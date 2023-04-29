package com.example.pert5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button pindah2;//deklarasi object button
    Button pindah3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pindah2=findViewById(R.id.btnHal2);//mapping object xml -> java
        pindah2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a=new Intent(MainActivity.this, Halaman2Activity.class);
                startActivity(a);
            }
        });
        pindah3=findViewById(R.id.btnHal3);
        pindah3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent b=new Intent(MainActivity.this, Halaman3Activity.class);
                startActivity(b);
            }
        });
    }
}
