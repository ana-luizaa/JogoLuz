package com.example.mistrio;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Dica3 extends AppCompatActivity {

    Button btnFechar3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dica3);

        btnFechar3 = findViewById(R.id.btnFechar3);
    }
    public void fechar3(View view) {
        Intent intent = new Intent(this, Fase3.class);
        startActivity(intent);
    }
}

