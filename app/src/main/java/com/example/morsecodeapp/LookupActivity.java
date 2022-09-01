package com.example.morsecodeapp;

import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class LookupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lookup);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        if (SendActivity.selectedCode.equals("")) {
            ((TextView) findViewById(R.id.tvPick)).setText("Select: n/a");
        } else {
            ((TextView) findViewById(R.id.tvPick)).setText("Select: " + SendActivity.selectedCode);
        }

    }

    public void morseClick(View view) {
        String text = ((TextView) view).getText().toString();
        ((TextView) findViewById(R.id.tvPick)).setText(text);

        Log.v("LookupActivity", ((TextView) view).getText() + " tapped");
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            SendActivity.selectedCode = ((TextView) findViewById(R.id.tvPick)).getText().toString();
            finish();//finishing activity
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}