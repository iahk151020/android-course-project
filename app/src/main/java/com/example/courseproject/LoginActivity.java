package com.example.courseproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {

    Button btnLogin, btnSignup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnSignup = findViewById(R.id.btn_toSignUp);
        btnLogin = findViewById(R.id.btn_login);

        btnSignup.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent in = new Intent(LoginActivity.this, SignUp.class);
                startActivity(in);
            }
        });

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(LoginActivity.this, UserHomeActivity.class);
                startActivity(in);
            }
        });


    }
}