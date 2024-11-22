
package com.mycompany.exemplogeo;

public class Triangulo extends FormaGeometrica{
    private double altura;
    
    public Triangulo(double lado, double altura){
        super(lado);
        this.altura = altura;
    }
    @Override
    public double calcularArea(){
        return (getLado() * altura)/2;
    }
}
