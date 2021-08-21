package com.example.myintro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        message=findViewById(R.id.message);
    }

    public void message(View view) {
        Toast.makeText(this,"Second screen loaded",Toast.LENGTH_SHORT).show();
        Intent intent=new Intent(this,MainActivity2.class);
        startActivity(intent);

    }
}