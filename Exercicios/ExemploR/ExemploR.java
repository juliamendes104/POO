package com.mycompany.exemplor;

public class ExemploR {

    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo(10,5);
        
        double area = retangulo.calcularArea();
        
        double perimetro = retangulo.calcularPerimetro();
        
        double largura = retangulo.getLargura();
        
        System.out.println("A area é: " + area);
        System.out.println("O perimetro é: " + perimetro);
        System.out.println("A largura é: " + largura);
    }
}
