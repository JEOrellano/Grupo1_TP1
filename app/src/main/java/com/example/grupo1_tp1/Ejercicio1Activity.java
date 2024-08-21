package com.example.grupo1_tp1;

import static android.content.ContentValues.TAG;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Ejercicio1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_ejercicio1);

        Button btnCalc = findViewById(R.id.btnCalcularEj1);
        final TextView txtVal1 = findViewById(R.id.txtNum1);
        final TextView txtVal2 = findViewById(R.id.txtNum2);
        final TextView tvResult = findViewById(R.id.tvResultado);

        btnCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Obtener valores de los TextView
                String strVal1 = txtVal1.getText().toString();
                String strVal2 = txtVal2.getText().toString();


                try {
                    // Convertir los valores a enteros
                    int val1 = Integer.parseInt(strVal1);
                    int val2 = Integer.parseInt(strVal2);

                    // Sumar los valores
                    int resultado = val1 + val2;

                    // Mostrar el resultado en el TextView
                    tvResult.setText(Integer.toString(resultado));

                    Log.d(TAG, "onClick: Resultado: " + resultado);
                } catch (NumberFormatException e) {
                    Log.e(TAG, "onClick: Error al convertir a entero", e);
                }
            }
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}