package com.mycompany.exercicio8;
import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int[] numeros = new int[12];
        
        System.out.println("Digite 12 inteiros: ");
        for(int i=0; i<numeros.length; i++){
            numeros[i] = input.nextInt();
        }
        
        for(int i=0; i<numeros.length; i++){
            if(numeros[i]%2 == 0){
                System.out.println(numeros[i] + " Par");
            }
            else{
                System.out.println(numeros[i] + " Impar");
            }
        }
    }
}
