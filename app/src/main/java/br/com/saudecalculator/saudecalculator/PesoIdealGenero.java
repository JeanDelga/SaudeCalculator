package br.com.saudecalculator.saudecalculator;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Locale;

public class PesoIdealGenero extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pesoidealgenero);


        Button voltar = (Button) findViewById(R.id.voltar);
        voltar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(PesoIdealGenero.this, PrincipalActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK|
                                intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });
    }

    public void PIfem (View v){
        EditText alturapi = (EditText) findViewById(R.id.alturapi);
        double alturapi_valor = Integer.parseInt(alturapi.getText().toString());

        double resultAltura = alturapi_valor - 152.4;
        double resultKilos = (resultAltura / 2.54) * 1.7;
        double pesoideal = 45.5 + resultKilos;

        pesoideal = Double.valueOf(String.format(Locale.US, "%.2f", pesoideal));

        AlertDialog.Builder alerta = new AlertDialog.Builder(PesoIdealGenero.this);
        alerta
                .setTitle("Seu Peso Ideal é " + pesoideal + " kg")
                .setMessage(" \n - Fique atento para se manter próximo do seu peso ideal! \n")
                .setIcon(R.drawable.logo)
                .setNegativeButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                });
        AlertDialog alertDialog = alerta.create();
        alertDialog.show();
    }

    public void PImasc (View v){
        EditText alturapi = (EditText) findViewById(R.id.alturapi);
        double alturapi_valor = Integer.parseInt(alturapi.getText().toString());

        double resultAltura = alturapi_valor - 152.4;
        double resultKilos = (resultAltura / 2.54) * 2.3;
        double pesoideal = 50 + resultKilos;


        pesoideal = Double.valueOf(String.format(Locale.US, "%.2f", pesoideal));

        AlertDialog.Builder alerta = new AlertDialog.Builder(PesoIdealGenero.this);
        alerta
                .setTitle("Seu Peso Ideal é " + pesoideal + " kg")
                .setMessage(" \n - Fique atento para se manter próximo do seu peso ideal!! \n")
                .setIcon(R.drawable.logo)
                .setNegativeButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                });
        AlertDialog alertDialog = alerta.create();
        alertDialog.show();
    }

    public void infoGen(View v){
        AlertDialog.Builder alerta = new AlertDialog.Builder(PesoIdealGenero.this);
        alerta
                .setTitle("Informação ")
                .setMessage( "\n - A fórmula de peso ideal leva em conta a relação da sua altura com o o peso extimado para ela. \n" +
                "\n - Para os homens a fórmula ultilzada é a o Dr. Devine e para as mulheres a do Dr. Robinson. \n" +
                "\n - Este teste não serve para pessoas menores que 154 cm \n" +
                "\n - LEMBRE-SE: Havendo dúvida ou para confirmar qualquer resultado procure um médico. \n")
                .setIcon(R.drawable.logo)
                .setNegativeButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                });
        AlertDialog alertDialog = alerta.create();
        alertDialog.show();
    }
}

