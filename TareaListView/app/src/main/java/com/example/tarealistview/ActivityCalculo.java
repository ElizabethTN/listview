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

    EditText eT1,eT2;
    Button bCalcular;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculo);
        eT1 = findViewById(R.id.editText);
        eT2 = findViewById(R.id.editText2);
        bCalcular = findViewById(R.id.button);
        getSupportActionBar().hide();

        bCalcular.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("DefaultLocale")
            @Override
            public void onClick(View view) {

                try {
                    String velocidadS = eT1.getText().toString();
                    String tiempoS = eT2.getText().toString();
                    float velocidad = Float.parseFloat(velocidadS);
                    float tiempo = Float.parseFloat(tiempoS);
                    float distancia = velocidad * tiempo;
                    Intent intent = new Intent(ActivityCalculo.this, RespuestaCalculo.class);
                    intent.putExtra("Distancia", distancia);
                    startActivity(intent);


                }catch (Exception ex){
                    Toast.makeText(getApplicationContext(),"Falta capturar valor", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}

