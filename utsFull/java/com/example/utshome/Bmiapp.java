package com.example.utshome;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Bmiapp extends AppCompatActivity {
    EditText tb, bb;
    Button btnGo, balik;
    TextView res, keterangan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi_app);

        tb=(EditText) findViewById(R.id.tinggi);
        bb=(EditText) findViewById(R.id.berat);
        res=(TextView) findViewById(R.id.hasil);
        keterangan=(TextView) findViewById(R.id.ket);
        btnGo=(Button) findViewById(R.id.btnGo);

        btnGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double berat=Double.parseDouble(bb.getText().toString());
                double tinggi=Double.parseDouble(tb.getText().toString());
                double result=berat/((tinggi/100)*(tinggi/100));

                String resultFormat=String.format("%.1f",result);
                res.setText(resultFormat);

                if (result<18.5){
                    keterangan.setText("KURUS");
                    keterangan.setTextColor(getResources().getColor(R.color.kurus));
                } else if (result>=18.5 && result<25){
                    keterangan.setText("Normal");
                    keterangan.setTextColor(getResources().getColor(R.color.normal));
                } else {
                    keterangan.setText("GEMUK");
                    keterangan.setTextColor(getResources().getColor(R.color.gemuk));
                }
            }
        });

        balik=findViewById(R.id.btnBalik);
        balik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back=new Intent(Bmiapp.this, MainActivity.class);
                startActivity(back);
            }
        });

    }
}