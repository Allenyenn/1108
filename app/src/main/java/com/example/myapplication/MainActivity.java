package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button btn,btn1,btn2,btn3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=(Button) findViewById(R.id.btn);
        btn1=(Button) findViewById(R.id.btn1);
        btn2=(Button) findViewById(R.id.btn2);
        btn3=(Button) findViewById(R.id.btn3);
        btn.setOnClickListener(bt);
        btn1.setOnClickListener(bt);
        btn2.setOnClickListener(bt);
        btn3.setOnClickListener(bt);
    }
    private Button.OnClickListener bt=new Button.OnClickListener(){

        @Override
        public void onClick(View view) {
            switch (view.getId()){
                case R.id.btn:
                    Uri uri=Uri.parse("https://www.youtube.com/");
                    Intent it =new Intent(Intent.ACTION_VIEW,uri);
                    startActivity(it);
                    break;
                case R.id.btn1:
                    Uri uri1=Uri.parse("https://www.google.com.tw/maps/");
                    Intent it1 =new Intent(Intent.ACTION_VIEW,uri1);
                    startActivity(it1);
                    break;
                case R.id.btn2:
                    Uri uri2=Uri.parse("tel:080000123");
                    Intent it2 =new Intent(Intent.ACTION_DIAL,uri2);
                    startActivity(it2);
                    break;
                case R.id.btn3:
                    Intent intent =new Intent();
                    intent.setClass(MainActivity.this,Activity2.class);
                    Bundle bundle=new Bundle();
                    int a=1;
                    bundle.putInt("money",a);
                    intent.putExtras(bundle);
                    startActivity(intent);

            }
        }
    };
}