package com.example.bruno.travel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private String valor;

    public void saladValor(View view){
        EditText valorEdit = findViewById(R.id.valorDisponivel);
        valor = (valorEdit.getText().toString());
        System.out.println(valor);
        Intent it = new Intent(MainActivity.this, Relatorio.class);
        it.putExtra("valor", valor);
        startActivity(it);
    }

    //static float getValor(){
    //    return valor;
    //}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
    }
}
