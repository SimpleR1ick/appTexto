package com.example.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnEnviar = findViewById(R.id.btnEnviar); // Armazenando em uma variavel o conteudo da view
        btnEnviar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                EditText etTexto = findViewById(R.id.etTexto); // Armazenando em uma variavel o conteudo da view
                String texto = etTexto.getText().toString(); // Convertendo o conteudo do editText para String

                Intent i = new Intent(MainActivity.this, NextActivity.class); // Criando um Intent a ser enviado para a próxima activity
                i.putExtra("texto", texto); // Inserindo no Intent o conteudo da PlainText

                startActivity(i); // Iniciando a NextActivity
            }
        });
    }
}