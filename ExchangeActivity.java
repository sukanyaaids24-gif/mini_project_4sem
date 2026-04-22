package com.example.currencyexchange;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ExchangeActivity extends AppCompatActivity {

    Button requestBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exchange);

        requestBtn = findViewById(R.id.requestBtn);

        requestBtn.setOnClickListener(v ->
                Toast.makeText(this,
                        "Exchange Request Submitted",
                        Toast.LENGTH_SHORT).show()
        );
    }
}
