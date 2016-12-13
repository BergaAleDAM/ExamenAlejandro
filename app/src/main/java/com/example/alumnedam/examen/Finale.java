package com.example.alumnedam.examen;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by ALUMNEDAM on 13/12/2016.
 */

public class Finale extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finale);

        Button btnFinale = (Button) findViewById(R.id.buttontornar);
        btnFinale.setOnClickListener( this);

    }


    @Override
    public void onClick(View view) {

        if(view.getId() == R.id.buttontornar) {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);

        }
        }

}
