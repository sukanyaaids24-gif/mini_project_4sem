package com.example.currencyexchange;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class DetailsActivity extends AppCompatActivity {

    Button submitBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        submitBtn = findViewById(R.id.submitBtn);

        submitBtn.setOnClickListener(v -> {
            Intent intent = new Intent(DetailsActivity.this, ExchangeActivity.class);
            startActivity(intent);
        });
    }
}
