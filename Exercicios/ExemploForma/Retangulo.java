
package com.mycompany.exemploforma;

public class Retangulo implements FormaGeometrica{
    private double a;
    private double b;
    
    public Retangulo(double a, double b){
        this.a = a;
        this.b = b;
    }
    
    @Override
    public double calcularArea(){
        return a * b;
    }
    
    @Override
    public double calcularPerimetro(){
        return 2*a + 2*b;
    }
}
