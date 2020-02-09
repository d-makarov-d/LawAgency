package com.example.lawagency;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class RegistrationActivity extends AppCompatActivity implements View.OnClickListener {

    private FirebaseAuth mAuth;
    private FirebaseAuth.AuthStateListener mAuthListener;

    private TextInputLayout ti_name, ti_login, ti_password;
    private TextInputEditText tie_name,tie_password, tie_login;
    private Button button_sign_up, button_registration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        mAuth = FirebaseAuth.getInstance();

        mAuthListener = new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                FirebaseUser user = firebaseAuth.getCurrentUser();
                if (user != null){

                }
                else {

                }
            }
        };

        ti_login = (TextInputLayout)findViewById(R.id.TI_login);
        ti_password = (TextInputLayout)findViewById(R.id.TI_password);
        ti_name = (TextInputLayout)findViewById(R.id.TI_name);

        tie_name = (TextInputEditText)findViewById(R.id.TIE_name);
        tie_login = (TextInputEditText)findViewById(R.id.TIE_login);
        tie_password = (TextInputEditText) findViewById(R.id.TIE_password);
        button_registration = (Button)findViewById(R.id.button_registration);
        button_sign_up = (Button)findViewById(R.id.button_sign_in);

        //button_sign_up.setOnClickListener(this);
        //button_registration.setOnClickListener(this);
    }

    @Override
    public void onClick(View view ) {
        if (view.getId() == R.id.button_sign_up){
            signing(tie_login.getText().toString(), tie_password.getText().toString());

        }
        else if (view.getId() == R.id.button_registration){
            registration(tie_login.getText().toString(), tie_password.getText().toString());
        }
    }

    public void signing(String email, String password){
        mAuth.signInWithEmailAndPassword(email, password).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()) {
                    Toast.makeText(RegistrationActivity.this, "Авторизация успешна", Toast.LENGTH_SHORT).show();
                }
                else
                    Toast.makeText(RegistrationActivity.this, "Авторизация провалена", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void registration(String email, String password){
       mAuth.createUserWithEmailAndPassword(email, password).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
           @Override
           public void onComplete(@NonNull Task<AuthResult> task) {
               if(task.isSuccessful()){
                   Toast.makeText(RegistrationActivity.this, "Регистрация успешна", Toast.LENGTH_SHORT).show();
               } else
                   Toast.makeText(RegistrationActivity.this, "Регистрация провалена", Toast.LENGTH_SHORT).show();
           }
       });
    }
}
