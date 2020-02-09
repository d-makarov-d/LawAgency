package com.example.lawagency;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class LoginActivity extends AppCompatActivity {

    private TextInputLayout textInput_login, textInput_password;
    private TextInputEditText text_input_password1, text_input_login1;
    private Button button_sign_up;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        textInput_login = (TextInputLayout)findViewById(R.id.text_input_login);
        textInput_password = (TextInputLayout)findViewById(R.id.text_input_password);
        button_sign_up = (Button)findViewById(R.id.button_sign_in);

        text_input_login1 = (TextInputEditText)findViewById(R.id.text_input_login1);
        text_input_password1 = (TextInputEditText)findViewById(R.id.text_input_password1);

        String login_str = text_input_login1.getText().toString();
        String password_str = text_input_password1.getText().toString();

        button_sign_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }


}
