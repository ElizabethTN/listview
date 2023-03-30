package com.example.tarealistview;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class ActivityGalopando extends AppCompatActivity
{
    ImageView ivCaballo, ivIzq, ivDer;
    int[] idsCaballo = {R.mipmap.caballo1, R.mipmap.caballo2,R.mipmap.caballo3, R.mipmap.caballo3, R.mipmap.caballo4, R.mipmap.caballo5, R.mipmap.caballo6, R.mipmap.caballo7, R.mipmap.caballo8};
    int posicion = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_galopando);
        getSupportActionBar().hide();

        ivCaballo = findViewById(R.id.imageView);
        ivIzq = findViewById(R.id.imageView2);
        ivDer = findViewById(R.id.imageView3);

        ivDer.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                posicion = (posicion == 7)? 0: posicion+1;
                ivCaballo.setImageResource(idsCaballo[posicion]);
            }
        });

        ivIzq.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                posicion = (posicion == 0)? 7: posicion-1;
                ivCaballo.setImageResource(idsCaballo[posicion]);
            }
        });
    }
    protected void onSaveInstanceState(Bundle outState)
    {
        super.onSaveInstanceState(outState);
        //siempre escribir abajo del super
        outState.putInt("VALOR", posicion);

    }
    //para el restore se utiliza el que tiene un solo bundle
    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState)
    {
        super.onRestoreInstanceState(savedInstanceState);
        posicion = savedInstanceState.getInt("VALOR");
        ivCaballo.setImageResource(idsCaballo[posicion]);
    }
}