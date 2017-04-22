package com.example.marvi.taller_listview;

/**
 * Created by marvi on 22/4/2017.
 */

public class Calculo_Area {


    private  int pi = (int) 3.1416;
    private  int lado;
    private  int base, altura;
    private  int radio;
    private  int calculo, area;

    // Cuadrado
    public int getLado_Cuadrado(){
        return lado;
    }

    public void setLado_Cuadrado(int pLado){
        this.lado = pLado;
    }

    public int  getArea_Cuadrado(){
        return area;
    }

    public void setArea_Cuadrado(int pArea){
        this.area = pArea;
    }



    public void CalcularArea_Cuadrado(int pLado){
        area = (pLado*pLado);
    }

    //

}
