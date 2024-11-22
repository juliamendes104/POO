package com.mycompany.exercicio12;


public class Quadrado {
    private double lado;
    
    public Quadrado(double lado){
        this.lado = lado;
    }
    
    public double calcularArea(){
        return lado*lado;
    }
    
    public double calcularPerimetro(){
        return lado*4;
    }
}
