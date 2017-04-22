package com.example.marvi.taller_listview;

/**
 * Created by marvi on 22/4/2017.
 */

public class Calculos {


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
    public void setArea_Cuadrado(int pArea){
        this.area = pArea;
    }
    public void CalcularArea_Cuadrado(int pLado){
        area = (pLado*pLado);
    }
    public int  getArea_Cuadrado(){
        return area;
    }


    // Rectángulo
    public  int getAltura_Rectangulo(){ return altura; }
    public void setAltura_Rectangulo(int pAltura){ this.altura = pAltura;}
    public int getBase_Rectangulo(){return base;}
    public void setBase_Rectangulo(int pBase){ this.altura = pBase;}
    public void CalcularArea_Rectangulo(int pBase, int pAltura){area = (pBase*pAltura);}
    public int  getArea_Rectangulo(){
        return area;
    }

    // Triángulo
    public  int getAltura_Triangulo(){ return altura; }
    public void setAltura_Triangulo(int pAltura){ this.altura = pAltura;}
    public int getBase_Triangulo(){return base;}
    public void setBase_Triangulo(int pBase){ this.altura = pBase;}
    public void CalcularArea_Triangulo(int pBase, int pAltura){area = (pAltura*pAltura)/2;}
    public int  getArea_Triangulo(){
        return area;
    }

    // Circulo
    public  int getRadio_Circulo(){ return radio; }
    public void setRadio_Circulo(int pRadio){ this.radio = pRadio;}
    public void CalcularArea_Circulo(int pRadio){area = pi*(pRadio*pRadio);}
    public int  getArea_Circulo(){
        return area;
    }
}
