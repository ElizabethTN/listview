package com.example.tarealistview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {


    private ListView lv;

    private String items [] = {"A cerca de", "Cálculo", "Colecciones", "Galopando"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = (ListView)findViewById(R.id.lv1);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.menu_listview, items);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 0:
                        Intent musica = new Intent(MainActivity.this,ActivityAcercade.class);
                        startActivity(musica);
                        break;
                    case 1:
                        Intent video = new Intent(MainActivity.this,ActivityCalculo.class);
                        startActivity(video);
                        break;
                    case 2:
                        Intent animacion = new Intent(MainActivity.this, ActivityColecciones.class);
                        startActivity(animacion);
                        break;
                    case 3:
                        Intent touchS = new Intent(MainActivity.this,ActivityGalopando.class);
                        startActivity(touchS);
                        break;
                    default:
                        break;
                }
            }
        });

    }
}