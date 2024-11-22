package com.mycompany.exercicio12;


public class Circulo {
    private double raio;
    
    public Circulo(double raio){
        this.raio = raio;
    }
    
    public double calcularArea(){
        return raio * raio * 3.14;
    }
    
    public double calcularPerimetro(){
        return 2 * 3.14 * raio;
    }
    
}
