package com.example.actividad_313;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        String usuario="Saul";
        String contrasenia="usuario";
        int num_Login=0;
        int num_Intentos=0;
        Button buttonLogin=(Button) findViewById(R.id.botonLogin);
        Button buttonCancel=(Button) findViewById(R.id.botonCancel);
        EditText editTextUsuario=findViewById(R.id.usuario);
        EditText editTextContrasenia=findViewById(R.id.contrasenia);
        ;
        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usuarioIngresado=editTextUsuario.getText().toString();
                String contrasreniaIngresada=editTextContrasenia.getText().toString();
                if(usuarioIngresado!=null&&contrasreniaIngresada!=null){
                    if(usuarioIngresado==usuario&&contrasreniaIngresada==contrasenia){
                        System.out.println("Login realizado correctamente");
                        num_Login++;
                    }else{
                        System
                    }
                }else{
                    System.out.println("Los campos de las credenciales estan vacios");
                }

            }
        });


    }
}