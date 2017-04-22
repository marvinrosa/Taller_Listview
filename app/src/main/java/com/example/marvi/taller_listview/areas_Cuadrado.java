package com.example.marvi.taller_listview;

import android.content.DialogInterface;
import android.content.res.Resources;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class areas_Cuadrado extends AppCompatActivity {


    private EditText ladoCuadrado;
    private Resources res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_areas__cuadrado);

        res = this.getResources();
       ladoCuadrado = (EditText) findViewById(R.id.txtLado);
    }

    public void  AreaCuadrado(View v){

        int lado = Integer.parseInt(ladoCuadrado.getText().toString());
        int calculo_area;
        Calculo_Area p = new Calculo_Area();
        p.CalcularArea_Cuadrado(lado);
        p.getArea_Cuadrado();


        new AlertDialog.Builder(this).setMessage(" Área: " + p.getArea_Cuadrado())
                .setTitle(res.getString(R.string.str_Resultado))
                .setPositiveButton(res.getString(R.string.str_OK), new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogo1, int id) {

            }
        }).show();

    }
}
