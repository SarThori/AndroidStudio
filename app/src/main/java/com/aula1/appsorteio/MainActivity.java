package com.aula1.appsorteio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int numeroAleatorio;
   public void geraNumero(View view){
       TextView texto = findViewById(R.id.textoResultado);
       numeroAleatorio = new Random().nextInt(11);
       texto.setText("O número gerado é: "+ numeroAleatorio);
   }

}