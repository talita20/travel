package com.example.bruno.travel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static float valor;

    public void saladValor(View view){
        EditText valorEdit = (EditText) findViewById(R.id.valorDisponivel);
        valor = Float.valueOf(valorEdit.getText().toString());
        Intent it = new Intent(MainActivity.this, Relatorio.class);
        it.putExtra("valor", valor);

        startActivity(it);
    }

    static float getValor(){
        return valor;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
    }
}
