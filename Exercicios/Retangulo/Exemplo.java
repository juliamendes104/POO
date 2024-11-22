
package com.mycompany.retangulo;


public class Exemplo {

    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo(10,5);
        double area = retangulo.calcularArea();
        double perimetro = retangulo.calcularPerimetro();
        double largura = retangulo.getLargura();
    }
}
