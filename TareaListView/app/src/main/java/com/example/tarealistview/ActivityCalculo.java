package com.example.tarealistview;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ActivityCalculo extends AppCompatActivity {

    EditText eT,eNombre;
    Button bGenerar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculo);
        eT = findViewById(R.id.editText);
        eNombre = findViewById(R.id.editText2);
        bGenerar = findViewById(R.id.button);
        getSupportActionBar().hide();

        bGenerar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //obtencion del valor
                int num = Integer.parseInt(eT.getText().toString());
                int nombre = Integer.parseInt(eNombre.getText().toString());

                //creasr el puente bundle/caja
                Bundle bolsa = new Bundle();
                //meter el valor a la bolsa
                bolsa.putInt("VALOR",num);
                bolsa.putInt("NOMBRE",nombre);
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

