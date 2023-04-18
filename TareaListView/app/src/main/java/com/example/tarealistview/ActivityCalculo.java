package com.example.tarealistview;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ActivityCalculo extends AppCompatActivity {

    EditText velocidad, tiempo;
    Button bCalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculo);
        velocidad = findViewById(R.id.editText);
        tiempo = findViewById(R.id.editText2);
        bCalcular = findViewById(R.id.button);
        getSupportActionBar().hide();

        bCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //obtencion del valor
                int v = Integer.parseInt(velocidad.getText().toString());
                int t = Integer.parseInt(tiempo.getText().toString());

                //creasr el puente bundle/caja
                Bundle bolsa = new Bundle();
                //meter el valor a la bolsa
                bolsa.putInt("VELOCIDAD",v);
                bolsa.putInt("TIEMPO",t);
                //crear el intent y hacer el puentes con la siguiente interfaz
                Intent int1 = new Intent(ActivityCalculo.this ,RespuestaCalculo.class);
                //vincular el intent con nuestra cajita
                int1.putExtras(bolsa);
                //ejecutar la actividad
                startActivity(int1);

           }
       });
    }
}

