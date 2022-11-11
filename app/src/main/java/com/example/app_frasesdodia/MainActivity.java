package com.example.app_frasesdodia;

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

    public void gerarNovaFrase(View view){
        String[] frases ={
                "Motivação é uma porta que se abre por dentro. \n\n-Mario Sergio Cortella-",
                "Faça o teu melhor, na condição que você tem, enquanto você não tem condições melhores, para fazer melhor ainda! \n\n-Mario Sergio Cortella-",
                "Seja 1% melhor todos os dias! \n\n-Joel Jota- ",
                "Sinta a alegria dessa nova manhã e agradeça por tudo de bom que existe em sua vida!",
                "NÃO EXISTE TENTAR! \n\n-Yoda-",
                "O maior conselho que você pode dar para alguém é seu exemplo. \n\n-Douglas Ninja-",
        };
        int numero = new Random().nextInt(6);//Gerador de números aleatórios com 5 números.

        TextView texto = findViewById(R.id.textResultado);
        texto.setText(frases[numero]);

    }

}