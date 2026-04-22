package com.example.currencyexchange;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText username, password;
    Button loginBtn, registerBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);

        loginBtn = findViewById(R.id.loginBtn);
        registerBtn = findViewById(R.id.registerBtn);

        loginBtn.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, HomeActivity.class);
            startActivity(intent);
        });

        registerBtn.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, HomeActivity.class);
            startActivity(intent);
        });
    }
}
