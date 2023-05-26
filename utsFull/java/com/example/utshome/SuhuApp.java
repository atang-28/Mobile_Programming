package com.example.utshome;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class SuhuApp extends AppCompatActivity {
    Spinner spinner1, spinner2;
    EditText input, res;
    Button konvers, balik;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suhu_app);

        spinner1=findViewById(R.id.menu1);
        spinner2=findViewById(R.id.menu2);
        input=findViewById(R.id.inputSuhu);
        res=findViewById(R.id.hasil);
        konvers=findViewById(R.id.btnKonversi);

        konvers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String inputan=input.getText().toString();

                if(!inputan.isEmpty()){
                    double suhuAwal=Double.parseDouble(inputan);
                    double suhuAkhir=0.0;

                    String opsi1=spinner1.getSelectedItem().toString();
                    String opsi2=spinner2.getSelectedItem().toString();

                    if (opsi1.equals("C") && opsi2.equals("F")){
                        suhuAkhir=(suhuAwal*9/5)+32;
                    } else if (opsi1.equals("C") && opsi2.equals("K")){
                        suhuAkhir=suhuAwal+273.15;
                    } else if (opsi1.equals("F")&& opsi2.equals("C")){
                        suhuAkhir=(suhuAwal-32)*5/9;
                    }else if(opsi1.equals("F") && opsi2.equals("K")){
                        suhuAkhir=(suhuAwal+459.67)*5/9;
                    } else if (opsi1.equals("K")&&opsi2.equals("C")){
                        suhuAkhir=suhuAwal-273.15;
                    } else if (opsi1.equals("K")&&opsi2.equals("F")){
                        suhuAkhir=(suhuAwal*9/5)-459.67;
                    }
                    res.setText(String.valueOf(suhuAkhir));
                }
            }
        });

        balik=findViewById(R.id.btnBalik);
        balik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home=new Intent(SuhuApp.this,MainActivity.class);
                startActivity(home);
            }
        });
    }
}