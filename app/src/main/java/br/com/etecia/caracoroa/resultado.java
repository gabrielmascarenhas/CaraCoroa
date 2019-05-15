package br.com.etecia.caracoroa;

import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.Random;

public class resultado extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        ImageButton botaoVoltar = findViewById(R.id.btnVoltar);
        botaoVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (resultado.this, MainActivity.class);
                startActivity(intent);
            }
        });

        ImageView imageResult = findViewById(R.id.imageView3);

        Random numero = new Random();
        int extras = numero.nextInt(2);

            if (extras==0){
                imageResult.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.moeda_cara));
            }else {
                imageResult.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.moeda_coroa));
            }
        }
    }

   