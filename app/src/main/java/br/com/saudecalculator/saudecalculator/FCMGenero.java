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

public class FCMGenero extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fcmgenero);


        Button voltar = (Button) findViewById(R.id.voltar);
        voltar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(FCMGenero.this, PrincipalActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK|
                                intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });
    }

    public void FCMfem (View v){
        EditText idade = (EditText) findViewById(R.id.idade);
        int idade_valor = Integer.parseInt(idade.getText().toString());

        int resultado = 226 - idade_valor;

        AlertDialog.Builder alerta = new AlertDialog.Builder(FCMGenero.this);
        alerta
                .setTitle("Sua FCM é " + resultado + " puls")
                .setMessage(" \n - Fique atento para não treinar além desse valor! \n")
                .setIcon(R.drawable.logo)
                .setNegativeButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                });
        AlertDialog alertDialog = alerta.create();
        alertDialog.show();
    }

    public void FCMmasc (View v){
        EditText idade = (EditText) findViewById(R.id.idade);
        int idade_valor = Integer.parseInt(idade.getText().toString());

        int resultado = 220 - idade_valor;

        AlertDialog.Builder alerta = new AlertDialog.Builder(FCMGenero.this);
        alerta
                .setTitle("Sua FCM é " + resultado + " puls")
                .setMessage(" \n - Fique atento para não treinar além desse valor! \n")
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
        AlertDialog.Builder alerta = new AlertDialog.Builder(FCMGenero.this);
        alerta
                .setTitle("Informação ")
                .setMessage( "\n - Cada tipo de treino possui um determinado ritmo que deve ser mantido para que se obtenha o desempenho esperado e a evolução nos treinamentos. Para isto o ritmo do treino pode ser determinado pela FCM do praticante. \n" +

                        "\n - A Frequência Cardíaca (FC): é o número de batimentos que o coração dá em um minuto. \n" +

                        "\n - A FCM é o número máximo de batimentos que o coração pode dar em um minuto. \n" +

                        "\n- A FCM é pouco influenciada pelo treino.\n" +

                        "\n - A FCM diminui progressivamente com a idade (perdemos cerca de 1 pulsação por ano). \n" +

                        "\n - LEMBRE-SE: Havendo dúvida ou para confirmar qualquer resultado procure um médico.\n")


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

