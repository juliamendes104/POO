
package com.mycompany.exemplogeo;

public class ExemploGeo {

    public static void main(String[] args) {
        Retangulo ret = new Retangulo(3.0,4.0);
        System.out.println(ret.calcularArea());
        Triangulo tri = new Triangulo(4.0,4.0);
        System.out.println(tri.calcularArea());
        Circulo cir = new Circulo(5.0);
        System.out.println(cir.calcularArea());
    }
}
