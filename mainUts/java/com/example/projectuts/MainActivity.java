package com.example.projectuts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText bb, tb;
    TextView res;
    Button btn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bb=(EditText) findViewById(R.id.berat);
        tb=(EditText) findViewById(R.id.tinggi);
        btn=(Button) findViewById(R.id.btnGo);
        res=(TextView) findViewById(R.id.hasil);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double berat=Double.parseDouble(bb.getText().toString());
                double tinggi=Double.parseDouble(tb.getText().toString());
                double result=(berat/(tinggi/100)*(tinggi/100));

                res.setText(Double.toString(result));
            }
        });


    }
}