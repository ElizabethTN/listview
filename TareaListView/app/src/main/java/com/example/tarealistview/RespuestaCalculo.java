package com.example.tarealistview;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.text.DecimalFormat;

public class RespuestaCalculo extends AppCompatActivity {
    TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        float obt = intent.getFloatExtra("Distancia",0);
        setContentView(R.layout.activity_resultadocalculo);
        resultado= findViewById(R.id.textView2);
        DecimalFormat formato = new DecimalFormat("#.00");
        String mensaje = (formato.format(obt)) + " m";
        resultado.setText(mensaje);
    }
}