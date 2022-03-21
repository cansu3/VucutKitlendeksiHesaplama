package com.example.vucutkitlendeksihesaplama;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText et_Boy, et_Kilo;
    Button btn_Hesapla, btn_Temizle;
    TextView tv_Sonuc;
    Double boy, kilo, sonuc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_Boy=(EditText) findViewById(R.id.et_Boy);
        et_Kilo= (EditText) findViewById(R.id.et_Kilo);
        btn_Hesapla = (Button) findViewById(R.id.btn_Hesapla);
        btn_Temizle = (Button) findViewById(R.id.btn_Temizle);
        tv_Sonuc = (TextView) findViewById(R.id.tv_Sonuc);

        btn_Hesapla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boy= Double.parseDouble(et_Boy.getText().toString());
                kilo= Double.parseDouble(et_Kilo.getText().toString());
                boy /= 100; //cm türünden m türüne çeviri
                sonuc=kilo/(boy*boy); //kilo / boy karesi

                tv_Sonuc.setText(sonuc.toString());

            }
        });

        btn_Temizle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et_Boy.setText("");
                et_Kilo.setText("");
                tv_Sonuc.setText("");
            }
        });
    }
}