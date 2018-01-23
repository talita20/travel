package com.example.bruno.travel;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Relatorio extends AppCompatActivity {
    int valorDisponivel;
    float valorAlimentacaoMaximo = (float)(valorDisponivel * 0.40);
    float valorTransporteMaximo = (float)(valorDisponivel * 0.20);
    float valorLazerMaximo = (float)(valorDisponivel * 0.30);
    float valorOutrosMaximo = (float)(valorDisponivel * 0.10);
    float valorAlimentacao = 0;
    float valorTransporte = 0;
    float valorLazer = 0;
    float valorOutros = 0 ;
    float valorTotal = 0;
    private TextView gastoAlimentacao;
    private TextView gastoTransporte;
    private TextView gastoLazer;
    private TextView gastoOutros;


    public void exibeValores(Intent intent){
        valorDisponivel = intent.getIntExtra("valor", 1000);
        valorDisponivel = 5000;
        TextView total = findViewById(R.id.valorDisponivel);
        total.setText(String.valueOf(valorDisponivel));
        TextView totalGasto = findViewById(R.id.valorTotal);
        totalGasto.setText(String.valueOf(valorTotal));
        TextView alimentacao = findViewById(R.id.valorAlimentacaoMaximo);
        alimentacao.setText(String.valueOf(valorAlimentacaoMaximo));
        TextView alimentacaoGasto = findViewById(R.id.valorAlimentacao);
        alimentacaoGasto.setText(String.valueOf(valorAlimentacao));
        TextView transporte = findViewById(R.id.valorTransporteMaximo);
        transporte.setText(String.valueOf(valorTransporteMaximo));
        TextView transporteGasto = findViewById(R.id.valorTransporte);
        transporteGasto.setText(String.valueOf(valorTransporte));
        TextView lazer = findViewById(R.id.valorLazerMaximo);
        lazer.setText(String.valueOf(valorLazerMaximo));
        TextView lazerGasto = findViewById(R.id.valorLazer);
        lazerGasto.setText(String.valueOf(valorLazer));
        TextView outros = findViewById(R.id.valorOutrosMaximo);
        outros.setText(String.valueOf(valorOutrosMaximo));
        TextView outrosGasto = findViewById(R.id.valorOutros);
        outrosGasto.setText(String.valueOf(valorOutros));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relatorio);
        getSupportActionBar().hide();
        //exibeValores(getIntent());
        String value = "";
        gastoAlimentacao = (TextView) findViewById(R.id.valorAlimentacao);
        gastoTransporte = (TextView) findViewById(R.id.valorTransporte);
        gastoLazer = (TextView) findViewById(R.id.valorLazer);
        gastoOutros = (TextView) findViewById(R.id.valorOutros);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            value = extras.getString("valor");
            //The key argument here must match that used in the other activity
        }
        valorDisponivel = Integer.parseInt(value);
        System.out.println(value);

        valorAlimentacaoMaximo = (float)(valorDisponivel * 0.40);
        valorTransporteMaximo = (float)(valorDisponivel * 0.20);
        valorLazerMaximo = (float)(valorDisponivel * 0.30);
        valorOutrosMaximo = (float)(valorDisponivel * 0.10);
        valorAlimentacao = 0;
        valorTransporte = 0;
        valorLazer = 0;
        valorOutros = 0 ;
        valorTotal = 0;

        TextView total = findViewById(R.id.valorDisponivel);
        total.setText(String.valueOf(valorDisponivel));
        final TextView totalGasto = findViewById(R.id.valorTotal);
        totalGasto.setText(String.valueOf(valorTotal));
        TextView alimentacao = findViewById(R.id.valorAlimentacaoMaximo);
        alimentacao.setText(String.valueOf(valorAlimentacaoMaximo));
        //TextView alimentacaoGasto = findViewById(R.id.valorAlimentacao);
        gastoAlimentacao.setText(String.valueOf(valorAlimentacao));
        gastoTransporte.setText(String.valueOf(valorTransporte));
        gastoLazer.setText(String.valueOf(valorLazer));
        gastoOutros.setText(String.valueOf(valorOutros));
        TextView transporte = findViewById(R.id.valorTransporteMaximo);
        transporte.setText(String.valueOf(valorTransporteMaximo));
        TextView transporteGasto = findViewById(R.id.valorTransporte);
        transporteGasto.setText(String.valueOf(valorTransporte));
        TextView lazer = findViewById(R.id.valorLazerMaximo);
        lazer.setText(String.valueOf(valorLazerMaximo));
        TextView lazerGasto = findViewById(R.id.valorLazer);
        lazerGasto.setText(String.valueOf(valorLazer));
        TextView outros = findViewById(R.id.valorOutrosMaximo);
        outros.setText(String.valueOf(valorOutrosMaximo));
        TextView outrosGasto = findViewById(R.id.valorOutros);
        outrosGasto.setText(String.valueOf(valorOutros));

        gastoAlimentacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final AlertDialog.Builder alert = new AlertDialog.Builder(Relatorio.this);
                final EditText editText = new EditText(Relatorio.this);
                alert.setTitle("Adicionar gasto");
                alert.setMessage("Insira o quanto você gastou:");
                alert.setView(editText);

                alert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Editable valor = editText.getText();
                        Float total = Float.parseFloat(gastoAlimentacao.getText().toString()) + Float.parseFloat(valor.toString());
                        gastoAlimentacao.setText(total.toString());
                        Float total_gasto = Float.parseFloat((totalGasto.getText().toString())) + Float.parseFloat(valor.toString());
                        totalGasto.setText(total_gasto.toString());
                    }
                });
                alert.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
                alert.show();

            }
        });

        gastoTransporte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final AlertDialog.Builder alert = new AlertDialog.Builder(Relatorio.this);
                final EditText editText = new EditText(Relatorio.this);
                alert.setTitle("Adicionar gasto");
                alert.setMessage("Insira o quanto você gastou:");
                alert.setView(editText);

                alert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Editable valor = editText.getText();
                        Float total = Float.parseFloat(gastoTransporte.getText().toString()) + Float.parseFloat(valor.toString());
                        gastoTransporte.setText(total.toString());
                        Float total_gasto = Float.parseFloat((totalGasto.getText().toString())) + Float.parseFloat(valor.toString());
                        totalGasto.setText(total_gasto.toString());
                    }
                });
                alert.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
                alert.show();

            }
        });

        gastoLazer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final AlertDialog.Builder alert = new AlertDialog.Builder(Relatorio.this);
                final EditText editText = new EditText(Relatorio.this);
                alert.setTitle("Adicionar gasto");
                alert.setMessage("Insira o quanto você gastou:");
                alert.setView(editText);

                alert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Editable valor = editText.getText();
                        Float total = Float.parseFloat(gastoLazer.getText().toString()) + Float.parseFloat(valor.toString());
                        gastoLazer.setText(total.toString());
                        Float total_gasto = Float.parseFloat((totalGasto.getText().toString())) + Float.parseFloat(valor.toString());
                        totalGasto.setText(total_gasto.toString());
                    }
                });
                alert.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
                alert.show();

            }
        });

        gastoOutros.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final AlertDialog.Builder alert = new AlertDialog.Builder(Relatorio.this);
                final EditText editText = new EditText(Relatorio.this);
                alert.setTitle("Adicionar gasto");
                alert.setMessage("Insira o quanto você gastou:");
                alert.setView(editText);

                alert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Editable valor = editText.getText();
                        Float total = Float.parseFloat(gastoOutros.getText().toString()) + Float.parseFloat(valor.toString());
                        gastoOutros.setText(total.toString());
                        Float total_gasto = Float.parseFloat((totalGasto.getText().toString())) + Float.parseFloat(valor.toString());
                        totalGasto.setText(total_gasto.toString());
                    }
                });
                alert.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
                alert.show();

            }
        });
    }


}
