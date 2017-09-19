package br.com.saudecalculator.saudecalculator;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import java.util.Locale;

public class IMCDadosFem extends AppCompatActivity {


    public static double imc;
    private ImageView view;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imcdadosfem);

        Button voltar = (Button) findViewById(R.id.voltar);
        voltar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(IMCDadosFem.this, IMCGenero.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK|
                        intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });
}

    public void infoFem(View v){
        AlertDialog.Builder alerta = new AlertDialog.Builder(IMCDadosFem.this);
        alerta
                .setTitle("Informação ")
                .setMessage(" - Os riscos à saúde aumentam a partir da faixa de sobrepeso, para doenças como diabetes e hipertensão. E este aumento é contínuo, à medida que aumenta o valor do IMC.\n" +
                        "\n" +
                        "- Os riscos também são altos quando o IMC estiver na faixa de Muito abaixo do peso\n" +
                        "\n" +
                        "- O IMC precisa de gráficos específicos para ser aplicado à crianças, portanto, a forma simples que se aplica a adultos não serve para estes indivíduos.\n" +
                        "\n" +
                        "- Também não há aplicabilidade em idosos, cuja classificação é diferenciada.\n" +
                        "\n" +
                        "- O cuidado deve ser redobrado em pessoas brevelíneas, ou muito musculosas. Nesses casos, o IMC pode estar elevado sem, no entendo, significar obesidade.\n" +
                        "\n" +
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

    public void imc_calculo(View v) {

        EditText altura = (EditText) findViewById(R.id.altura);
        double altura_valor = Integer.parseInt(altura.getText().toString());

        EditText peso = (EditText) findViewById(R.id.peso);
        double peso_valor = Integer.parseInt(peso.getText().toString());

        double altura_valor2 = altura_valor / 100;

        imc = peso_valor / (altura_valor2 * altura_valor2);

        imc = Double.valueOf(String.format(Locale.US, "%.2f", imc));


    if(imc < 17){

        ImageView image = new ImageView(this);
        image.setImageResource(R.drawable.fem1);

        AlertDialog.Builder alerta = new AlertDialog.Builder(IMCDadosFem.this);
        alerta
                .setTitle("Seu IMC é " + imc)
                .setMessage(" ")
                .setIcon(R.drawable.logo)
                .setNegativeButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                })
                .setView(image);
        setView(image);
        AlertDialog alertDialog = alerta.create();
        alertDialog.show();
    }
    else if(imc < 18.5){

        ImageView image = new ImageView(this);
        image.setImageResource(R.drawable.fem2);

        AlertDialog.Builder alerta = new AlertDialog.Builder(IMCDadosFem.this);
        alerta
                .setTitle("Seu IMC é " + imc)
                .setMessage(" ")
                .setIcon(R.drawable.logo)
                .setNegativeButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                })
                .setView(image);
        setView(image);
        AlertDialog alertDialog = alerta.create();
        alertDialog.show();
    }
    else if(imc < 25){

        ImageView image = new ImageView(this);
        image.setImageResource(R.drawable.fem3);

        AlertDialog.Builder alerta = new AlertDialog.Builder(IMCDadosFem.this);
        alerta
                .setTitle("Seu IMC é " + imc)
                .setMessage(" ")
                .setIcon(R.drawable.logo)
                .setNegativeButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                })
                .setView(image);
        setView(image);
        AlertDialog alertDialog = alerta.create();
        alertDialog.show();
    }
    else if(imc < 30){

        ImageView image = new ImageView(this);
        image.setImageResource(R.drawable.fem4);

        AlertDialog.Builder alerta = new AlertDialog.Builder(IMCDadosFem.this);
        alerta
                .setTitle("Seu IMC é " + imc)
                .setMessage(" ")
                .setIcon(R.drawable.logo)
                .setNegativeButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                })
                .setView(image);
        setView(image);
        AlertDialog alertDialog = alerta.create();
        alertDialog.show();
    }
    else if(imc < 35){

        ImageView image = new ImageView(this);
        image.setImageResource(R.drawable.fem5);

        AlertDialog.Builder alerta = new AlertDialog.Builder(IMCDadosFem.this);
        alerta
                .setTitle("Seu IMC é " + imc)
                .setMessage(" ")
                .setIcon(R.drawable.logo)
                .setNegativeButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                })
                .setView(image);
        setView(image);
        AlertDialog alertDialog = alerta.create();
        alertDialog.show();
    }
    else if(imc < 40){

        ImageView image = new ImageView(this);
        image.setImageResource(R.drawable.fem6);

        AlertDialog.Builder alerta = new AlertDialog.Builder(IMCDadosFem.this);
        alerta
                .setTitle("Seu IMC é " + imc)
                .setMessage(" ")
                .setIcon(R.drawable.logo)
                .setNegativeButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                })
                .setView(image);
        setView(image);
        AlertDialog alertDialog = alerta.create();
        alertDialog.show();
    }
    else
        {

            ImageView image = new ImageView(this);
            image.setImageResource(R.drawable.fem7);

            AlertDialog.Builder alerta = new AlertDialog.Builder(IMCDadosFem.this);
            alerta
                    .setTitle("Seu IMC é " + imc)
                    .setMessage(" ")
                    .setIcon(R.drawable.logo)
                    .setNegativeButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                        }
                    })
                    .setView(image);
            setView(image);
            AlertDialog alertDialog = alerta.create();
            alertDialog.show();
        }
    }



    public void setView(ImageView view) {
        this.view = view;
    }
}
