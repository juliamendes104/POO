
package com.mycompany.exemplogeo;

public class Circulo extends FormaGeometrica{
    
    public Circulo(double lado){
        super(lado);
    }
    
    @Override
    public double calcularArea(){
        return 3.14 * getLado() * getLado();
    }
}
