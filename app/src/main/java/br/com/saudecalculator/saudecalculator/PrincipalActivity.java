package br.com.saudecalculator.saudecalculator;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class PrincipalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        Button imc = (Button) findViewById(R.id.imc);
        imc.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(PrincipalActivity.this, IMCGenero.class);
                startActivity(intent);
            }
        });

        Button fcm = (Button) findViewById(R.id.fcm);
        fcm.setOnClickListener(new  View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(PrincipalActivity.this, FCMGenero.class);
                startActivity(intent);
            }
        });

        Button pesoideal = (Button) findViewById(R.id.pesoideal);
        pesoideal.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(PrincipalActivity.this, PesoIdealGenero.class);
                startActivity(intent);
            }
        });
    }

    public void infoBtnImc (View v){

        AlertDialog.Builder alerta = new AlertDialog.Builder(PrincipalActivity.this);
        alerta
                .setTitle("Índice de Massa Corporal (IMC)")
                .setMessage(" \n - O índice de massa corporal (IMC) é uma medida internacional usada para calcular se uma pessoa está no peso ideal. \n")
                .setIcon(R.drawable.logo)
                .setNegativeButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                });
        AlertDialog alertDialog = alerta.create();
        alertDialog.show();
    }

    public void infoBtnFcm (View v){

        AlertDialog.Builder alerta = new AlertDialog.Builder(PrincipalActivity.this);
        alerta
                .setTitle("Frequência Cardíaca Máxima (FCM)")
                .setMessage(" \n - A FCM (Frequência Cardíaca Máxima) é o número máximo de batimentos que o coração pode atingir por minuto. É muito útil para se saber o nível de certos treinos físicos para cada praticante.\n")
                .setIcon(R.drawable.logo)
                .setNegativeButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                });
        AlertDialog alertDialog = alerta.create();
        alertDialog.show();
    }

    public void infoBtnPi (View v){

        AlertDialog.Builder alerta = new AlertDialog.Builder(PrincipalActivity.this);
        alerta
                .setTitle("Peso Ideal")
                .setMessage(" \n - Diferente do IMC este cálculo lhe informa qual o seu peso ideal em relação a sua altura. \n")
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
