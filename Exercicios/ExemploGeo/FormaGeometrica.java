
package com.mycompany.exemplogeo;

public abstract class FormaGeometrica {
    private double lado;
    
    public FormaGeometrica(double lado){
        this.lado = lado;
    }
    
    public double getLado(){
        return lado;
    }
    public abstract double calcularArea();
}
