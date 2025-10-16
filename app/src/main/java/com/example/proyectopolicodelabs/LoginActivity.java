package com.example.proyectopolicodelabs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // --- Referencias a los componentes de la UI ---
        EditText editTextEmail = findViewById(R.id.editTextEmail);
        EditText editTextPassword = findViewById(R.id.editTextPassword);
        Button buttonSignIn = findViewById(R.id.buttonSignIn);
        TextView textViewNoAccount = findViewById(R.id.textViewNoAccount);


        // --- Lógica de Navegación ---

        // Listener para el botón de Iniciar Sesión
        buttonSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Aquí iría la lógica para validar el email y la contraseña.
                // Por ahora, simularemos un inicio de sesión exitoso.
                Toast.makeText(LoginActivity.this, "Inicio de sesión exitoso (simulado)", Toast.LENGTH_SHORT).show();

                // Navegar al Dashboard de Negocio (puedes cambiarlo al del repartidor)
                Intent intent = new Intent(LoginActivity.this, DeliveryDashboardActivity.class);
                startActivity(intent);
            }
        });

        // Listener para el texto de "No tienes una cuenta"
        textViewNoAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Crear un Intent para abrir la RegisterActivity
                Intent intent = new Intent(LoginActivity.this, DeliveryDashboardActivity.class);
                startActivity(intent);
            }
        });
    }
}

