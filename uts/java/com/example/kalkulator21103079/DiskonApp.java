package com.example.kalkulator21103079;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class DiskonApp extends AppCompatActivity {
    TextView res, ket;
    EditText harga, diskon;
    Button hitung, balik;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diskon_app);

        harga=findViewById(R.id.inputHarga);
        diskon=findViewById(R.id.inputDiskon);
        res=findViewById(R.id.hargaAkhir);
        ket=findViewById(R.id.keterangan);
        hitung=findViewById(R.id.btnHitung);

        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double price=Double.parseDouble(harga.getText().toString());
                double disc=Double.parseDouble(diskon.getText().toString());

                double result=price - (price * (disc/100));
                DecimalFormat formatResult=new DecimalFormat("#,###.#");
                String hargaAkhirStr=formatResult.format(result);
                res.setText(hargaAkhirStr);
                double hemat=price-result;
                DecimalFormat formatHemat=new DecimalFormat("#,###.#");
                String strHemat=formatHemat.format(hemat);
                ket.setText("Anda Hemat "+strHemat);
            }
        });

        balik=findViewById(R.id.btnBalik);
        balik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back=new Intent(DiskonApp.this,MainActivity.class);
                startActivity(back);
            }
        });
    }
}