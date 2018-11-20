package com.example.oeloem.checkbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    CheckBox cbox, cbox0, cbox1, cbox2, cbox3, cbox4, cbox5;
    Button btn; //Deklarasi Variable Button

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cbox = (CheckBox) findViewById(R.id.cb); //cast untuk checkbox1
        cbox0 = (CheckBox) findViewById(R.id.cb0); //cast untuk checkbox1
        cbox1 = (CheckBox) findViewById(R.id.cb1); //cast untuk checkbox1
        cbox2 = (CheckBox) findViewById(R.id.cb2); //cast untuk checkbox1
        cbox3 = (CheckBox) findViewById(R.id.cb3); //cast untuk checkbox1
        cbox4 = (CheckBox) findViewById(R.id.cb4); //cast untuk checkbox1
        cbox5 = (CheckBox) findViewById(R.id.cb5); //cast untuk checkbox1
        btn = (Button) findViewById(R.id.btn); //cast untuk checkbox1
        btn.setOnClickListener((android.view.View.OnClickListener)this);
    }

    public void onClick (View view) {
        String a = "";
        if (cbox.isChecked()) {
            a += "Main Bola \n"; //untuk menampilkan jika kamu memilih chekbox1

        }

        if (cbox0.isChecked()) {
            a += "Sambil Dengerin Musik"; //untuk menampilkan jika kamu memilih chekbox1

        }

        if (cbox1.isChecked()) {
            a += "Masak Sendiri"; //untuk menampilkan jika kamu memilih chekbox1

        }

        if (cbox2.isChecked()) {
            a += "Ngegambar"; //untuk menampilkan jika kamu memilih chekbox1

        }

        if (cbox3.isChecked()) {
            a += "Sepedaan"; //untuk menampilkan jika kamu memilih chekbox1

        }

        if (cbox4.isChecked()) {
            a += "Main Game"; //untuk menampilkan jika kamu memilih chekbox1

        }

        if (cbox5.isChecked()) {
            a += "Baca Buku "; //untuk menampilkan jika kamu memilih chekbox1

        }

        Toast.makeText(this, "Hobi Kamu Adalah: \n" +a, Toast.LENGTH_SHORT).show();
    }
}
