package com.example.marvi.taller_listview;

import android.content.DialogInterface;
import android.content.res.Resources;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class volumenes_Esfera extends AppCompatActivity {

    private EditText radio;
    private Resources res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volumenes__esfera);

        res = this.getResources();
        radio = (EditText) findViewById(R.id.txtRadio);
    }

    public void  VolEsfera(View v){

        double r = Double.parseDouble(radio.getText().toString());
        double calculo_area;
        Calculos p = new Calculos();
        p.CalcularVol_Esfera(r);
        p.getVol_Esfera();


        new AlertDialog.Builder(this).setMessage(res.getString(R.string.str_Volumen) +':' + p.getVol_Esfera())
                .setTitle(res.getString(R.string.str_Resultado))
                .setPositiveButton(res.getString(R.string.str_OK), new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialogo1, int id) {

                    }
                }).show();

    }
}
