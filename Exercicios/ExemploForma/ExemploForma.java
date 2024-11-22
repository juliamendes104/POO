
package com.mycompany.exemploforma;

public class ExemploForma {

    public static void main(String[] args) {
        Retangulo r = new Retangulo(15.0,26.0);
        Circulo c = new Circulo(4.0);
        
        System.out.println(r.calcularArea());
        System.out.println(r.calcularPerimetro());
        System.out.println(c.calcularArea());
        System.out.println(c.calcularPerimetro());
    }
}
