package com.example.latihanuts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText tb, bb;
    Button btnGo;
    TextView res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tb=(EditText) findViewById(R.id.tinggi);
        bb=(EditText) findViewById(R.id.berat);
        res=(TextView) findViewById(R.id.hasil);
        btnGo=(Button) findViewById(R.id.btnGo);

        btnGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double berat=Double.parseDouble(bb.getText().toString());
                double tinggi=Double.parseDouble(tb.getText().toString());
                double result=berat/((tinggi/100)*(tinggi/100));

                String resultFormat=String.format("%.1f",result);
                res.setText(resultFormat);
            }
        });

    }
}