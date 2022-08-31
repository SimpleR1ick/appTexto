package com.example.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class NextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        Intent i = getIntent(); // Obtendo o Intent da MainActivity
        String texto = i.getStringExtra("texto"); // Atribuindo à uma String a variável 'texto'
        TextView tvTexto = findViewById(R.id.tvTexto); // Atribuindo à variável o TextView de mesmo id
        tvTexto.setText(texto); // Definindo que o TextView recebe o conteúdo da variável 'texto'
    }
}