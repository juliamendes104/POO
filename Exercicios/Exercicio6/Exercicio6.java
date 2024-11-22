package com.mycompany.exercicio6;
import java.util.Scanner;


public class Exercicio6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double salario;
        
        System.out.println("Digite o valor das vendas: ");
        double vendas = input.nextDouble();
        
        while(vendas != -1){
            salario = (9 * vendas)/100 + 200;
            System.out.println("O salário é: " + salario);
            System.out.println("Digite o valor das vendas: ");
            vendas = input.nextDouble();
        }
    }
}
