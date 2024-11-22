
package com.mycompany.exemplogeo;

public class Retangulo extends FormaGeometrica{
    private double outroLado;
    
    public Retangulo(double lado, double outroLado){
        super(lado);
        this.outroLado = outroLado;
    }
    
    @Override
    public double calcularArea(){
        return getLado() * outroLado;
    }
}
