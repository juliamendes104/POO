
package com.mycompany.exercicio1;
import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite três inteiros: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        
        int soma = n1 + n2 + n3;
        int media = soma/3;
        int produto = n1 * n2 *n3;
        int menor;
        int maior;
        
        if(n3 > n2 && n3 > n1){
            maior = n3;
            if(n2 < n1){
                menor = n2;
            }
            else{
                menor = n1;
            }
        }
        else if(n2 > n3 && n2 > n1){
            maior = n2;
            if(n3 < n1){
                menor = n3;
            }
            else{
                menor = n1;
            }
        }
        else{
            maior = n1;
            if(n2 < n3){
                menor = n2;
            }
            else{
                menor = n3;
            }
        }
        
        System.out.println("Soma: " + soma + " Media: " + media + " Produto: " + produto + " Menor: " + menor + " Maior: " + maior);
        
        
    }
}
