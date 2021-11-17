package com.example.app_checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText et1, et2;
    private CheckBox cb1, cb2;
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1=(EditText)findViewById(R.id.txt_valor1);
        et2=(EditText)findViewById(R.id.txt_valor2);

        cb1=(CheckBox)findViewById(R.id.check_suma);
        cb2=(CheckBox)findViewById(R.id.check_resta);

        tv1=(TextView)findViewById(R.id.tv_resultado);
    }

    //Método para calcular
    public void calcular(View view){
        String valor1_string=et1.getText().toString();
        String valor2_string=et2.getText().toString();

        int valor1_int=Integer.parseInt(valor1_string);
        int valor2_int=Integer.parseInt(valor2_string);

        String resultado="";

        if(cb1.isChecked()==true){
            int suma=valor1_int+valor2_int;
            String suma_string=String.valueOf(suma);
            resultado+="La suma es "+suma+" / ";
        }
        if(cb2.isChecked()==true){
            int resta=valor1_int-valor2_int;
            String resta_string=String.valueOf(resta);
            resultado+="La resta es "+resta+" / ";
        }

        tv1.setText(resultado);
    }
}