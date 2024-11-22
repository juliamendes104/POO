
package com.mycompany.circulo;
import java.util.Scanner;


public class Circulo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o raio de um círculo: ");
        double raio = sc.nextDouble();
        
        double diametro = 2 * raio;
        double area = raio * raio * 3.14;
        double circunferencia = 2 * 3.14 * raio;
        
        System.out.printf("Diametro: %.2f Area : %.2f Circunferencia: %.2f ", diametro, area, circunferencia);
    }
}
