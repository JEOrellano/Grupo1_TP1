package com.example.grupo1_tp1;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import org.w3c.dom.Text;

public class Ejercicio2Activity extends AppCompatActivity {

    private int num1, num2;
    private String operacion;
    private boolean banderaPostResultado;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_ejercicio2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public boolean borrarCeroInicial(TextView textView){
        char primerNumero = textView.getText().charAt(0);
        if(primerNumero=='0'){

            return true;

        }
        return false;
    }





    public void onClickBtn1 (View view){

        TextView pantalla = (TextView)findViewById(R.id.txtResultado);

        // Si la pantalla tiene un resultado anterior lo borro

        if(banderaPostResultado) {
            pantalla.setText("0");
            banderaPostResultado = false;
        }

        if(borrarCeroInicial(pantalla)) {  pantalla.setText("1"); }
        else {   pantalla.setText(pantalla.getText()+"1"); }

    }
    public void onClickBtn2 (View view){

        TextView pantalla = (TextView)findViewById(R.id.txtResultado);

        // Si la pantalla tiene un resultado anterior lo borro

        if(banderaPostResultado) {
            pantalla.setText("0");
            banderaPostResultado = false;
        }

        if(borrarCeroInicial(pantalla)) {  pantalla.setText("2"); }
        else {   pantalla.setText(pantalla.getText()+"2"); }

    }
    public void onClickBtn3 (View view){

        TextView pantalla = (TextView)findViewById(R.id.txtResultado);

        // Si la pantalla tiene un resultado anterior lo borro

        if(banderaPostResultado) {
            pantalla.setText("0");
            banderaPostResultado = false;
        }

        if(borrarCeroInicial(pantalla)) {  pantalla.setText("3"); }
        else {   pantalla.setText(pantalla.getText()+"3"); }

    }
    public void onClickBtn4 (View view){



        TextView pantalla = (TextView)findViewById(R.id.txtResultado);

        // Si la pantalla tiene un resultado anterior lo borro

        if(banderaPostResultado) {
            pantalla.setText("0");
            banderaPostResultado = false;
        }

        if(borrarCeroInicial(pantalla)) {  pantalla.setText("4"); }
        else {   pantalla.setText(pantalla.getText()+"4"); }

    }
    public void onClickBtn5 (View view){

        TextView pantalla = (TextView)findViewById(R.id.txtResultado);

        // Si la pantalla tiene un resultado anterior lo borro

        if(banderaPostResultado) {
            pantalla.setText("0");
            banderaPostResultado = false;
        }

        if(borrarCeroInicial(pantalla)) {  pantalla.setText("5"); }
        else {   pantalla.setText(pantalla.getText()+"5"); }

    }
    public void onClickBtn6 (View view){

        TextView pantalla = (TextView)findViewById(R.id.txtResultado);

        // Si la pantalla tiene un resultado anterior lo borro

        if(banderaPostResultado) {
            pantalla.setText("0");
            banderaPostResultado = false;
        }

        if(borrarCeroInicial(pantalla)) {  pantalla.setText("6"); }
        else {   pantalla.setText(pantalla.getText()+"6"); }

    }
    public void onClickBtn7 (View view){

        TextView pantalla = (TextView)findViewById(R.id.txtResultado);

        // Si la pantalla tiene un resultado anterior lo borro

        if(banderaPostResultado) {
            pantalla.setText("0");
            banderaPostResultado = false;
        }

        if(borrarCeroInicial(pantalla)) {  pantalla.setText("7"); }
        else {   pantalla.setText(pantalla.getText()+"7"); }

    }
    public void onClickBtn8 (View view){

        TextView pantalla = (TextView)findViewById(R.id.txtResultado);

        // Si la pantalla tiene un resultado anterior lo borro

        if(banderaPostResultado) {
            pantalla.setText("0");
            banderaPostResultado = false;
        }

        if(borrarCeroInicial(pantalla)) {  pantalla.setText("8"); }
        else {   pantalla.setText(pantalla.getText()+"8"); }

    }
    public void onClickBtn9 (View view){

        TextView pantalla = (TextView)findViewById(R.id.txtResultado);

        // Si la pantalla tiene un resultado anterior lo borro

        if(banderaPostResultado) {
            pantalla.setText("0");
            banderaPostResultado = false;
        }

        if(borrarCeroInicial(pantalla)) {  pantalla.setText("9"); }
        else {   pantalla.setText(pantalla.getText()+"9"); }

    }

    public void onClickBtn0 (View view){

        TextView pantalla = (TextView)findViewById(R.id.txtResultado);

        // Si la pantalla tiene un resultado anterior lo borro

        if(banderaPostResultado) {
            pantalla.setText("0");
            banderaPostResultado = false;
        }

        if(borrarCeroInicial(pantalla)) {  pantalla.setText("0"); }
        else {   pantalla.setText(pantalla.getText()+"0"); }

    }

    public void onClickSumar (View view){
        TextView pantalla = (TextView)findViewById(R.id.txtResultado);
        // Si la pantalla tiene un resultado anterior lo borro
        if(banderaPostResultado) {
            pantalla.setText("0");
            banderaPostResultado = false;
        }
        if(borrarCeroInicial(pantalla)) {  pantalla.setText("+"); }
        else {   pantalla.setText(pantalla.getText()+"+"); }
    }
    public void onClickRestar (View view){
        TextView pantalla = (TextView)findViewById(R.id.txtResultado);
        // Si la pantalla tiene un resultado anterior lo borro
        if(banderaPostResultado) {
            pantalla.setText("0");
            banderaPostResultado = false;
        }
        if(borrarCeroInicial(pantalla)) {  pantalla.setText("-"); }
        else {   pantalla.setText(pantalla.getText()+"-"); }
    }


    public void onClickDividir (View view){

        TextView pantalla = (TextView)findViewById(R.id.txtResultado);
        // Si la pantalla tiene un resultado anterior lo borro
        if(banderaPostResultado) {
            pantalla.setText("0");
            banderaPostResultado = false;
        }
        if(borrarCeroInicial(pantalla)) {  pantalla.setText("/"); }
        else {   pantalla.setText(pantalla.getText()+"/"); }

    }

    public void onClickMultiplicar (View view){
       // Wy- Genero logica para multiplicacion
        TextView pantalla = (TextView)findViewById(R.id.txtResultado);
        // Si la pantalla tiene un resultado anterior lo borro
        if(banderaPostResultado) {
            pantalla.setText("0");
            banderaPostResultado = false;
        }
        if(borrarCeroInicial(pantalla)) {  pantalla.setText("*"); }
        else {   pantalla.setText(pantalla.getText()+"*"); }

    }

    public void onClickIgual (View view){
        //capturo el segundo numero
        TextView pantalla = (TextView)findViewById(R.id.txtResultado);
        String contenidoPantalla = pantalla.getText().toString();

        // Verificar si la pantalla contiene un "+" o "-"
        if (contenidoPantalla.contains("+")) {
            // Separar el contenido en dos partes usando el "+"
            String[] partes = contenidoPantalla.split("\\+");

            // Asegurarse de que hay dos partes
            if (partes.length == 2) {
                try {
                    // Convertir las partes en números
                    double numero1 = Double.parseDouble(partes[0].trim());
                    double numero2 = Double.parseDouble(partes[1].trim());

                    // Realizar la suma
                    double resultado = numero1 + numero2;

                    // Mostrar el resultado en la pantalla
                    pantalla.setText(String.valueOf(resultado));
                } catch (NumberFormatException e) {
                    // Manejo del error si las partes no son números válidos
                    pantalla.setText("Error");
                }
            } else {
                pantalla.setText("Error");
            }
        }
        if (contenidoPantalla.contains("-")) {
            // Separar el contenido en dos partes usando el "-"
            String[] partes = contenidoPantalla.split("\\-");

            // Asegurarse de que hay dos partes
            if (partes.length == 2) {
                try {
                    // Convertir las partes en números
                    double numero1 = Double.parseDouble(partes[0].trim());
                    double numero2 = Double.parseDouble(partes[1].trim());

                    // Realizar la resta
                    double resultado = numero1 - numero2;

                    // Mostrar el resultado en la pantalla
                    pantalla.setText(String.valueOf(resultado));
                } catch (NumberFormatException e) {
                    pantalla.setText("Error");
                }
            } else {
                pantalla.setText("Error");
            }
        }

        if (contenidoPantalla.contains("*")) {
            // Separar el contenido en dos partes usando el "*"
            String[] partes = contenidoPantalla.split("\\*");

            // Asegurarse de que hay dos partes
            if (partes.length == 2) {
                try {
                    // Convertir las partes en números
                    double numero1 = Double.parseDouble(partes[0].trim());
                    double numero2 = Double.parseDouble(partes[1].trim());

                    // Realizar la multipliccion
                    double resultado = numero1 * numero2;

                    // Mostrar el resultado en la pantalla
                    pantalla.setText(String.valueOf(resultado));
                } catch (NumberFormatException e) {
                    pantalla.setText("Error");
                }
            } else {
                pantalla.setText("Error");
            }
        }



        if (contenidoPantalla.contains("/")) {
            // Separar el contenido en dos partes usando el "-"
            String[] partes = contenidoPantalla.split("\\/");

            // Asegurarse de que hay dos partes
            if (partes.length == 2) {
                try {
                    // Convertir las partes en números
                    double numero1 = Double.parseDouble(partes[0].trim());
                    double numero2 = Double.parseDouble(partes[1].trim());

                    // Realizar la dividir
                    double resultado = numero1 / numero2;

                    // Mostrar el resultado en la pantalla
                    pantalla.setText(String.valueOf(resultado));
                } catch (NumberFormatException e) {
                    pantalla.setText("Error");
                }
            } else {
                pantalla.setText("Error");
            }
        }
/*
        num2 = Integer.parseInt((String) pantalla.getText());

        if(operacion.equals("/")) {

            if(num2 !=0 ) {
                //asigno resultado a la pantalla
                num1 = num1 / num2;
                banderaPostResultado = true;
            }
            else {

                pantalla = (TextView)findViewById(R.id.txtResultado);
                pantalla.setText("0");
                num1=0;
                num2=0;
                operacion="";

                Toast.makeText(this, "No se puede dividir por cero", Toast.LENGTH_LONG).show();

            }

        }*/

        //imprimo el resultado
        //pantalla.setText (String.valueOf(num1));


    }


    public void clickBorrar (View view) {

        TextView pantalla = (TextView)findViewById(R.id.txtResultado);
        pantalla.setText("0");
        num1=0;
        num2=0;
        operacion="";

    }







}
