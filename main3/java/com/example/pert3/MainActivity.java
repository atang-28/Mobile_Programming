package com.example.pert3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    //1. create golbal variable
    EditText editTxtNama;
    EditText editTxtAlamat;
    Button btnLogin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //2. linking global variable tp object
        editTxtNama=(EditText) findViewById(R.id.editTxtNama);
        editTxtAlamat=(EditText) findViewById(R.id.editTxtAlamat);
        btnLogin=(Button) findViewById(R.id.btnLogin);

        //3. membuat perintah
        btnLogin.setOnClickListener(f_login);
    }

    //4. create function
    View.OnClickListener f_login=new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Toast.makeText(getApplicationContext(),
                    "Hallo "+editTxtNama.getText().toString()+" Apa kabar?? "+"\r\n"+"Anda Tinggal di "+editTxtAlamat.getText().toString(),
                    Toast.LENGTH_LONG).show();
        }
    };
}