package com.example.bruno.travel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Relatorio extends AppCompatActivity {
        float valorDisponivel;

        float valorAlimentacaoMaximo = (float)(valorDisponivel * 0.40);
        float valorTransporteMaximo = (float)(valorDisponivel * 0.20);
        float valorLazerMaximo = (float)(valorDisponivel * 0.30);
        float valorOutrosMaximo = (float)(valorDisponivel * 0.10);
        float valorAlimentacao;
        float valorTransporte;
        float valorLazer;
        float valorOutros;
        float valorTotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relatorio);
        getSupportActionBar().hide();

        Intent it = getIntent();
        valorDisponivel = getIntent().getFloatExtra("valor", 1000);
        //Toast.makeText(this, Float.toString(valorDisponivel), Toast.LENGTH_SHORT).show();

        TextView total = (TextView) findViewById(R.id.valorDisponivel);
        total.setText(String.valueOf(valorDisponivel));

    }


}
