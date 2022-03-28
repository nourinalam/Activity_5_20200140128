package com.example.activity5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Switch;
import android.widget.TextView;

public class HasilActivity extends AppCompatActivity {

    TextView Nama,NoHp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);
        Nama = findViewById(R.id.tf_nama);
        NoHp = findViewById(R.id.tf_nohp);

        Bundle bundle = getIntent().getExtras();
        String nama = bundle.getString("a");

        switch (nama){
            case "Kolis":
                Nama.setText("Nurkolis");
                NoHp.setText("08122223121");
                break;
            case "Dewa":
                Nama.setText("Dewa Angga");
                NoHp.setText("08122223122");
                break;
            case "Ilham":
                Nama.setText("Ilham Saputra");
                NoHp.setText("08122223123");
                break;
            case "Riyan":
                Nama.setText("Riyan Priyadi");
                NoHp.setText("08122223124");
                break;
            case "Alex":
                Nama.setText("Alex Mustaqim");
                NoHp.setText("08122223125");
                break;

        }
    }
}