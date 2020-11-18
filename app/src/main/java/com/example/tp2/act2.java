package com.example.tp2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class act2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act2);
        Intent intent= getIntent();
        String count = intent.getStringExtra("count");
        TextView txt_2 = (TextView) findViewById(R.id.count2);
        txt_2.setText(count);
    }
}