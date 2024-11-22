package com.mycompany.exercicio12;


public class Exercicio12 {

    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado(5);
        double areaQuadrado = quadrado.calcularArea();
        double periQuadrado = quadrado.calcularPerimetro();
        
        System.out.println("Quadrado: Área: " + areaQuadrado + " Perímetro: " + periQuadrado);
        
        Circulo circulo = new Circulo(2);
        double areaCirculo = circulo.calcularArea();
        double periCirculo = circulo.calcularPerimetro();
        
        System.out.println("Círculo: Área: " + areaCirculo + " Perímetro: " + periCirculo);
    }
}
