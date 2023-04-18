package com.example.tarealistview;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.text.DecimalFormat;

public class RespuestaCalculo extends AppCompatActivity {

    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultadocalculo);


        tv = findViewById(R.id.textView2);
        Bundle bolsaRec = getIntent().getExtras();
        int num = bolsaRec.getInt("VALOR");
        String nombre = bolsaRec.getString("NOMBRE");
        tv.setText("tabla del "+ num + "\n\n" + "Para: " + nombre + "\n\n");
        for(int i=1; i<=10; i++)
        {
            tv.append(String.format("%d x %d = %d\n", num,i,num*i));
        }
    }
}