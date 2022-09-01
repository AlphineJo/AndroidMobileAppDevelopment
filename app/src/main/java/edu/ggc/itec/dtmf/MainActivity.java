package edu.ggc.itec.dtmf;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void onKeyTapped(View view) {
        Log.v("DTMFTool", ((Button) view).getText() + " key was tapped");
    }

    public void onMicrophoneTapped(View view) {
        Log.v("DTMFTool", "Microphone is tapped");
    }
}