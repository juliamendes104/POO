
package com.mycompany.retangulo;


public class Retangulo {

    private double largura;
    private double altura;
    
    public Retangulo(double largura, double altura){
        this.largura = largura;
        this.altura = altura;
    }
    
    public double calcularArea(){
        return largura * altura;
    }
    
    public double calcularPerimetro(){
        return (largura + altura) * 2;
    }
    
    public double getLargura(){
        return largura;
    }
    
    public void setLargura(double largura){
        this.largura = largura;
    }
    
    public double getAltura(){
        return altura;
    }
    
    public void setAltura(double altura){
        this.altura = altura;
    }
    
    public static void main(String[] args){
        Retangulo retangulo = new Retangulo(10,5);
        double area = retangulo.calcularArea();
        double perimetro = retangulo.calcularPerimetro();
        double largura = retangulo.getLargura();
        retangulo.setLargura(20);
        
        System.out.println("A area é: " + area);
        System.out.println("O perimetro é: " + perimetro);
        System.out.println("A largura é: " + largura);
        largura = retangulo.getLargura();
        System.out.println("A largura é: " + largura);
    }
}


