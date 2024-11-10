package com.mycompany.adicao;

import java.util.Scanner;

public class Adicao {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int number1;
        int number2;
        int soma;
        
        System.out.print("Digite o primeiro numero:");
        number1 = input.nextInt();
        
        System.out.print("Digite o segundo numero:");
        number2 = input.nextInt();
        
        soma = number1 + number2;
        
        System.out.printf("Soma: %d", soma);

        
    }
}
