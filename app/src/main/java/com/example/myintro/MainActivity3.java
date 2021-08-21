package com.example.myintro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {
    TextView ms;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        ms=findViewById(R.id.ms);
    }

    public void ms(View view) {
        Toast.makeText(this,"Fourth screen loaded",Toast.LENGTH_SHORT).show();
        Intent intent=new Intent(this,MainActivity4.class);
        startActivity(intent);
    }
}