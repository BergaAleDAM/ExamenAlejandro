package com.example.alumnedam.examen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    RadioButton curt, mitj, llarg, suma, resta, sumaresta;
    EditText nom;
    String nombre;
    private Button btnStart;
    int tipusOper, qtty;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        curt = (RadioButton) findViewById(R.id.curt);
        mitj = (RadioButton) findViewById(R.id.mitj);
        llarg = (RadioButton) findViewById(R.id.llarg);

        mitj.setChecked(true);

        suma = (RadioButton) findViewById(R.id.suma);
        resta = (RadioButton) findViewById(R.id.resta);
        sumaresta = (RadioButton) findViewById(R.id.sumayresta);

        sumaresta.setChecked(true);

        nom = (EditText) findViewById(R.id.et_nombre);
        nombre = nom.getText().toString();

        Button btnStart = (Button) findViewById(R.id.btn_comenzar);
        btnStart.setOnClickListener( this);
        
        
    }


    @Override
    public void onClick(View view) {


        if(view.getId() == R.id.btn_comenzar){

            if(suma.isChecked()){
                tipusOper = 1;
            } else if (resta.isChecked()){
                tipusOper = 2;
            } else {
                tipusOper = 3;
            }

            if(curt.isChecked()){
                qtty = 5;
            }else if(mitj.isChecked()){
                qtty = 10;
            }else{
                qtty = 20;
            }

            Intent intent = new Intent(this, Proves.class);
            intent.putExtra("Operacio",tipusOper);
            intent.putExtra("Quantitat", qtty);
            intent.putExtra("Nombre", nombre);

            startActivity(intent);


        }
    }
}
