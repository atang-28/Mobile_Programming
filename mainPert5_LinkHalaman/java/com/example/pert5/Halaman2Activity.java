package com.example.pert5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Halaman2Activity extends AppCompatActivity {
    EditText tx1, tx2;
    Button tambah;
    TextView txhasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.halaman2);

        tx1=(EditText) findViewById(R.id.angka1);
        tx2=(EditText) findViewById(R.id.angka2);
        txhasil=(TextView) findViewById(R.id.hasil);
        tambah=(Button) findViewById(R.id.btnTambah);

        tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double angka1=Double.parseDouble(tx1.getText().toString());
                double angka2=Double.parseDouble(tx2.getText().toString());
                double hasil=angka1+angka2;
                txhasil.setText(Double.toString(hasil));
            }
        });
    }
}