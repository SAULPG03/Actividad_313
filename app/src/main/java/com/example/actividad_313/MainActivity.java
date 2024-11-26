package com.example.actividad_313;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private int num_Login = 0; // Inicializa los contadores como variables de clase
    private int num_Intentos = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        String usuario = "Saul";
        String contrasenia = "usuario";

        Button buttonLogin = findViewById(R.id.botonLogin);
        Button buttonCancel = findViewById(R.id.botonCancel);
        EditText editTextUsuario = findViewById(R.id.usuario);
        EditText editTextContrasenia = findViewById(R.id.contrasenia);
        TextView intentosLogin = findViewById(R.id.textLogin);
        TextView intentosCancel = findViewById(R.id.textCancel);

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usuarioIngresado = editTextUsuario.getText().toString();
                String contraseniaIngresada = editTextContrasenia.getText().toString();

                if (!usuarioIngresado.isEmpty() && !contraseniaIngresada.isEmpty()) {
                    if (usuarioIngresado.equals(usuario) && contraseniaIngresada.equals(contrasenia)) {
                        // Credenciales correctas
                        num_Login++;
                        intentosLogin.setText("Logueado: " +num_Login);
                    } else {
                        // Credenciales incorrectas
                        num_Intentos++;
                        intentosCancel.setText("Intentos: " + num_Intentos);
                    }
                } else {
                    System.out.println("Los campos de las credenciales están vacíos");
                }
            }
        });

        buttonCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Reinicia los campos de texto
                editTextUsuario.setText("");
                editTextContrasenia.setText("");
            }
        });
    }
}
