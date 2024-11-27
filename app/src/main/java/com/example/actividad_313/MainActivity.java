package com.example.actividad_313;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    // Declare instance variables to persist login count
    private int num_Login = 0;
    private int num_Intentos = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        // Hardcoded credentials
        String usuario = "Saul";
        String contrasenia = "usuario";

        // UI elements
        Button buttonLogin = findViewById(R.id.botonLogin);
        Button buttonCancel = findViewById(R.id.botonCancel);
        EditText editTextUsuario = findViewById(R.id.usuario);
        EditText editTextContrasenia = findViewById(R.id.contrasenia);
        TextView textLogin = findViewById(R.id.textLogin);
        TextView textCancel = findViewById(R.id.textCancel);

        // Login button click listener
        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usuarioIngresado = editTextUsuario.getText().toString();
                String contraseniaIngresada = editTextContrasenia.getText().toString();

                if (usuarioIngresado.isEmpty() || contraseniaIngresada.isEmpty()) {
                    System.out.println("Los campos de las credenciales están vacíos");
                } else {
                    if (usuarioIngresado.equals(usuario) && contraseniaIngresada.equals(contrasenia)) {
                        // Login correcto
                        num_Login++;
                        textLogin.setText("Login: " + num_Login);
                        System.out.println("Login realizado correctamente");
                    } else {
                        // Login incorrecto
                        num_Intentos++;
                        textCancel.setText("Intentos: "+num_Intentos);
                        System.out.println("Credenciales incorrectas");
                    }
                }
            }
        });

        // Cancel button click listener to clear fields
        buttonCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTextUsuario.setText("");
                editTextContrasenia.setText("");
            }
        });
    }
}
