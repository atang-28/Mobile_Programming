package com.example.pert4_operasibilangan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //1. global variable
    EditText inputBil1;
    EditText inputBil2;
    Button tambah;
    Button kurang;
    Button kali;
    Button bagi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //2. menyambung variable global
        inputBil1=(EditText) findViewById(R.id.inputBil1);
        inputBil2=(EditText) findViewById(R.id.inputBil2);
        tambah=(Button) findViewById(R.id.tambah);
        kurang=(Button) findViewById(R.id.kurang);
        kali=(Button) findViewById(R.id.kali);
        bagi=(Button) findViewById(R.id.bagi);

        //3. membuat printah
        tambah.setOnClickListener(f_tambah);
        kurang.setOnClickListener(f_kurang);
        kali.setOnClickListener(f_kali);
        bagi.setOnClickListener(f_bagi);
    }

    //4a. membuat fungsi tambah
    View.OnClickListener f_tambah=new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            int b1,b2,hasil;
            b1=Integer.parseInt(inputBil1.getText().toString());
            b2=Integer.parseInt(inputBil2.getText().toString());
            hasil=b1+b2;

            Toast.makeText(getApplicationContext(),
                    b1+" + "+b2+" = "+hasil,
                    Toast.LENGTH_LONG).show();
        }
    };

    //4b. membuat fungsi kurang
    View.OnClickListener f_kurang=new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            int b1,b2,hasil;
            b1=Integer.parseInt(inputBil1.getText().toString());
            b2=Integer.parseInt(inputBil2.getText().toString());
            hasil=b1-b2;

            Toast.makeText(getApplicationContext(),
                    b1+" - "+b2+" = "+hasil,
                    Toast.LENGTH_LONG).show();
        }
    };

    //4c. membuat fungsi kali
    View.OnClickListener f_kali=new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            int b1,b2,hasil;
            b1=Integer.parseInt(inputBil1.getText().toString());
            b2=Integer.parseInt(inputBil2.getText().toString());
            hasil=b1*b2;

            Toast.makeText(getApplicationContext(),
                    b1+" x "+b2+" = "+hasil,
                    Toast.LENGTH_LONG).show();
        }
    };

    //4d. membuat fungsi bagi
    View.OnClickListener f_bagi=new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            int b1,b2,hasil;
            b1=Integer.parseInt(inputBil1.getText().toString());
            b2=Integer.parseInt(inputBil2.getText().toString());
            hasil=b1/b2;

            Toast.makeText(getApplicationContext(),
                    b1+" / "+b2+" = "+hasil,
                    Toast.LENGTH_LONG).show();
        }
    };

}



