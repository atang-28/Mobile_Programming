package com.example.kalkulator21103079;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    ImageButton profile, bmi, termo, diskon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        profile=findViewById(R.id.btnProfile);
        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pro=new Intent(MainActivity.this, profile.class);
                startActivity(pro);
            }
        });

        bmi=findViewById(R.id.btnBMI);

        bmi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent berat=new Intent(MainActivity.this,Bmiapp.class);
                startActivity(berat);
            }
        });

        termo=findViewById(R.id.btnSuhu);
        termo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent suhu=new Intent(MainActivity.this,SuhuApp.class);
                startActivity(suhu);
            }
        });
        diskon=findViewById(R.id.btnDiskon);
        diskon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent disc=new Intent(MainActivity.this, DiskonApp.class);
                startActivity(disc);
            }
        });
    }
}