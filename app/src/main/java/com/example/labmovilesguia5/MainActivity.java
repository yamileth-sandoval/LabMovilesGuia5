package com.example.labmovilesguia5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickMisDatos(View v){
        Intent misDatos=new Intent(this, misDatos.class);
        startActivity(misDatos);
    }
    public void clickLogin(View v){
        Intent login=new Intent(this,Login.class);
        startActivity(login);
    }
    public void clickCalculadora(View v){
        Intent calculadora=new Intent(this,Calculadora.class);
        startActivity(calculadora);
    }
    public void clcikConversacion(View v){
        Intent con=new Intent(this, Conversacion.class);
        startActivity(con);
    }
}
