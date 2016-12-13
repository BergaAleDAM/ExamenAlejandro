package com.example.alumnedam.examen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static android.widget.TextView.*;

public class Proves extends AppCompatActivity implements View.OnClickListener {

    private int tipusOper, qtty;
    String nom;
    int primer = 30;
    int segon = 2;
    private Button btnSeguent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proves);

        tipusOper = getIntent().getIntExtra("Operacio", tipusOper);
        qtty = getIntent().getIntExtra("Quantitat", qtty);
        //nom = getIntent().getStringExtra("Nombre", nombre);

        //no se porque no me coge el nombre

        String operacio = establerTipus(tipusOper);
        ferOperacions(qtty, operacio);

        Button btnSeguent = (Button) findViewById(R.id.btn_seguent);
        btnSeguent.setOnClickListener(this);

        Button btnFinale = (Button) findViewById(R.id.btn_final);
        btnFinale.setOnClickListener(this);
        setVisible(false);

        TextView pregunta = (TextView) findViewById(R.id.pregunta);
        String preg = setText(pregunta);
        //No se ben vé el que haig de fer per a que en transformi el que hi ha a pregunta en un String
        //Ho sabria fer pero no puc perdre temps, son les 17:00

       //Amb el set Visible ho vull posar en invisible pero ara no m'enrecordo com fer-ho
        //ho vull posar així btnFinale.setVisible(false);

    }

    private void ferOperacions(int qtty, String operacio) {


        for (int i =0; i< qtty; i ++){

            if(operacio == "+-"){
                if(Math.random()*10 < 5){
                    operacio = "+";
                }else{
                    operacio = "-";
                }
            }
            //Aqui vull transformar el String en TextViex
            String pregunta = (primer-i) + " " + operacio + " " + (segon+i) + " = ";
            //pero em temo que no ho puc fer


            //es guarden les respostes en un array junt amb les que haig de generar yo i que estiguin correctes per a comprar
            if(i == qtty-1){
                // vull fer un btnSeguent.setVisibility(false) per a deixar-ho invisible
                // i fer visible el btnFinale amb btnFinale.setVisibility
            }
        }

    }

    private String establerTipus(int tipusOper) {

        if(tipusOper == 1){
            return "+";
        }else if(tipusOper == 2){
            return "-";
        }else{
            return "+-";
        }


    }


    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.btn_comenzar){
            //no puc fer mes ya es la hora
            //vull carregar aquesta mateixa pagina pero amb dades actualitzades
        }else if(view.getId() == R.id.btn_final){
            //no puc fer mes
            //vull carregar la pagina de Finale.class pero passant-hi les encertades y el nom
        }
    }
}
