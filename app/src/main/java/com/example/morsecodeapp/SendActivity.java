package com.example.morsecodeapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class SendActivity extends AppCompatActivity {

    public static String selectedCode = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        findViewById(R.id.btnLookup).setOnClickListener(view -> {
            Intent intent = new Intent(this, LookupActivity.class);
            intent.putExtra("MESSAGE", selectedCode);
            startActivityForResult(intent, 2);
        });
    }

    @Override
    protected void onResume() {
        String message = "Last Lookup: " + selectedCode;
        ((TextView) findViewById(R.id.lastLookup)).setText(message);
        super.onResume();
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            this.finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}