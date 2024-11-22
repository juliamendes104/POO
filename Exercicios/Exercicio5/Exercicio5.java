package com.mycompany.exercicio5;
import java.util.Scanner;

public class Exercicio5 {

    public static void compare(double[] numeros){
        double aux;
        for(int i=0; i<numeros.length-1; i++){
            for(int j=i+1; j<numeros.length; j++){
                if(numeros[j] > numeros[i]){
                    aux = numeros[j];
                    numeros[j] = numeros[i];
                    numeros[i] = aux;
                }
            }
        }
        System.out.println("Os dois maiores são: " + numeros[0] + " e " + numeros[1]);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] numeros = new double[15];
        
        System.out.println("Digite 15 inteiros: ");
        for(int i=0; i<numeros.length; i++){
            numeros[i] = sc.nextDouble();
        }
        Exercicio5.compare(numeros);
    }
}
