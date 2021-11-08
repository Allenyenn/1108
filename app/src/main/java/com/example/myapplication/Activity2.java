package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Activity2 extends AppCompatActivity {
    TextView txt2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);

        txt2= (TextView) findViewById(R.id.txt2);
        Intent intent=this.getIntent();
        Bundle bundle=intent.getExtras();
        int money =bundle.getInt("money");
        txt2.setText(String.valueOf(money));
    }
}