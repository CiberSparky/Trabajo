package com.pincheira.trabajo6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button A;
    Button HA;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        A = findViewById(R.id.A);
        A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Z = new Intent(MainActivity.this,ejecutar2.class);
                startActivity(Z);
            }
        });
    }

}