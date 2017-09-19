package br.com.saudecalculator.saudecalculator;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class IMCGenero extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imcgenero);

        Button fem = (Button) findViewById(R.id.fem);
        fem.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(IMCGenero.this, IMCDadosFem.class);
                startActivity(intent);
            }
        });

        Button masc = (Button) findViewById(R.id.masc);
        masc.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent2 = new Intent(IMCGenero.this, IMCDadosMasc.class);
                startActivity(intent2);
            }
        });

        Button voltar = (Button) findViewById(R.id.voltar);
        voltar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(IMCGenero.this, PrincipalActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK|
                                intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });
    }

    public void infoGen(View v){
        AlertDialog.Builder alerta = new AlertDialog.Builder(IMCGenero.this);
        alerta
                .setTitle("Informação ")
                .setMessage("  - O IMC é a razão entre o seu peso e a sua altura elevada ao quadrado. \n\n" +
                        "- O cálculo é o mesmo para homens e mulheres, mas a interpretação deles difere de gênero para gênero. \n\n" +
                        "- LEMBRE-SE: Havendo dúvida ou para confirmar qualquer resultado procure um médico.\n" )
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

