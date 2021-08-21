package com.example.myintro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    TextView msg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        msg=findViewById(R.id.msg);

    }

    public void msg(View view) {
        Toast.makeText(this,"Third screen loaded",Toast.LENGTH_SHORT).show();
        Intent intent=new Intent(this,MainActivity3.class);
        startActivity(intent);
    }
}