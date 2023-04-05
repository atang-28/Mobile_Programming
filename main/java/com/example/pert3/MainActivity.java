package com.example.pert3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {
    //1. global variabel sesuai dengan id subject yang telah dibuat
    EditText editTxtNama;
    EditText editTxtAlamat;
    Button btnSubmit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //2. menyambungkan Variabel Global dengan object di layout
        editTxtNama = (EditText) findViewById(R.id.editTxtNama);
        editTxtAlamat = (EditText) findViewById(R.id.editTxtAlamat);
        btnSubmit = (Button) findViewById(R.id.btnSubmit);

        //3. membuat perintah tombol klik
        btnSubmit.setOnClickListener(proses_klik);
    }

    //4. membuat fungsi proses_klik
    View.OnClickListener proses_klik=new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Toast.makeText(getApplicationContext(),
                    "Hallo " + editTxtNama.getText().toString() +" Apa Kabar?? "+ "\r\n" + "Anda Tinggal di "+ editTxtAlamat.getText().toString(),
                    Toast.LENGTH_LONG).show();
        }
    };
}