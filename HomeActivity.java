package com.example.currencyexchange;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {

    Button nextBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        nextBtn = findViewById(R.id.nextBtn);

        nextBtn.setOnClickListener(v -> {
            Intent intent = new Intent(HomeActivity.this, DetailsActivity.class);
            startActivity(intent);
        });
    }
}
