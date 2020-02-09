package com.example.lawagency;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private Button client, employee, moderator;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // связь кнопок
        client = (Button)findViewById(R.id.button_client);
        employee = (Button)findViewById(R.id.button_employee);
        moderator = (Button)findViewById(R.id.button_moderator);

//        // реакция нажатия на кнопку
//        client.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity.this, MainClientActivity.class);
//                startActivity(intent);
//                finish();
//            }
//        });

        // реакция нажатия на кнопку
        client.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RegistrationActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}