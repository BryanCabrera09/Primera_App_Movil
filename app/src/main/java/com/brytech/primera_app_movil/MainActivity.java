package com.brytech.primera_app_movil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button boton_ingresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);     //ENLACE CON LA VISTA
        boton_ingresar = findViewById(R.id.btn_ingreso);        //ENLAZAR EL ELEMENTO
        Iniciar_Control();
    }

    private void Iniciar_Control(){
        boton_ingresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //ENLAZAMOS AL TEXTO USUARIO
                EditText text_user = findViewById(R.id.txt_mail);
                //Obtener el valor
                String usuario = text_user.getText().toString();
                //Comunica los dos activities
                Intent inten = new Intent(getApplicationContext(),Menu_Principal.class);
                //Enviar toda informacion al activity2
                inten.putExtra("Nombre Usuario",usuario);
                //Inicio de activity enlazado
                startActivity(inten);
            }
        });
    }
}