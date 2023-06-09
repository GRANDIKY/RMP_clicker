package com.example.clicker;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "StartActivity";

    private static final String KEY_COUNTER = "COUNTER";
    private Integer counter = 0;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(savedInstanceState == null){
            Toast.makeText(this, "ДЕТЕЙ", Toast.LENGTH_LONG).show();
        }
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(KEY_COUNTER, counter);
    }

    @SuppressLint("SetTextI18n")
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        counter = savedInstanceState.getInt(KEY_COUNTER);
        TextView counterView = findViewById(R.id.txt_counter);
        counterView.setText(counter.toString());
    }

    @SuppressLint("SetTextI18n")
    public void OnClickBtnAddDETEY(View view){
        counter ++;
        TextView counterView = findViewById(R.id.txt_counter);
        counterView.setText(counter.toString());
    }
}
