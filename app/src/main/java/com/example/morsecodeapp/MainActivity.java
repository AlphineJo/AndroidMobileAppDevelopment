package com.example.morsecodeapp;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        findViewById(R.id.btnSend).setOnClickListener(view -> {
            SendActivity.selectedCode = "";
            Intent intent = new Intent(this, SendActivity.class);
            startActivity(intent);
        });

        findViewById(R.id.btnReceive).setOnClickListener(view -> {
            Intent intent = new Intent(this, ReceiveActivity.class);
            startActivity(intent);
        });

        findViewById(R.id.btnAbout).setOnClickListener(view -> {
            Intent intent = new Intent(this, AboutActivity.class);
            startActivity(intent);
        });
    }
}