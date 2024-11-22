package com.mycompany.exercicio9;
import java.util.Scanner;

public class Exercicio9 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numeros = new int[12];
        double contagem=0, contagem2=0;
        
        System.out.println("Digite 12 inteiros: ");
        for(int i=0; i<numeros.length; i++){
            numeros[i] = input.nextInt();
        }
        
        for(int i=0; i<numeros.length; i++){
            if(numeros[i] < 8){
                contagem++;
            }
            if(numeros[i] > 10){
                contagem2++;
            }
        }
        double resultado1 = (contagem/12) * 100;
        double resultado2 = (contagem2/12) * 100;
        System.out.println("Porcentagem menores que 8: " + resultado1);
        System.out.println("Porcentagem maiores que 10: " + resultado2);
    }
}
