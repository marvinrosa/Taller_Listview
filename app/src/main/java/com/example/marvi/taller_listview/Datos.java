package com.example.marvi.taller_listview;

import java.util.ArrayList;

/**
 * Created by marvi on 22/4/2017.
 */

public class Datos {

    private static ArrayList<Calculos> calculos = new ArrayList<>();

    public static void Guardar(Calculos p){
        calculos.add(p);
    }

    public  static ArrayList<Calculos> getCalculos(){
        return calculos;
    }
}
