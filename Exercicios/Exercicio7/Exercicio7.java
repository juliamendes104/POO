package com.mycompany.exercicio7;
import java.util.Scanner;


public class Exercicio7 {

    public static double fatorial(double x){
        double fatorial = 1;
        for(int i=1; i<=x; i++){
            fatorial = fatorial * i;
        }
        return fatorial;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double e = 1;
        
        System.out.println("Digite um inteiro: ");
        double termos = input.nextDouble();
        
        for(int i=1; i<=termos; i++){
            double denominador = Exercicio7.fatorial(i);
            e += 1/denominador;
        }
        System.out.println(e);
    }
}
