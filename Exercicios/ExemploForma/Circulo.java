
package com.mycompany.exemploforma;

public class Circulo implements FormaGeometrica{
    private double raio;
    
    public Circulo(double raio){
        this.raio = raio;
    }
    
    @Override
    public double calcularArea(){
        return raio * raio * 3.14;
    }
    
    @Override
    public double calcularPerimetro(){
        return 2 * 3.14 * raio;
    }
}
