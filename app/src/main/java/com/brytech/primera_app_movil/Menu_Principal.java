package com.brytech.primera_app_movil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Menu_Principal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);

        Intent inten = getIntent();//      Recibe el bundle o variables

        String user = inten.getStringExtra("Nombre Usuario");

        TextView text = findViewById(R.id.txt_mensaje);        //Enlace
        text.setText(user);     //Set al mensaje
    }
}