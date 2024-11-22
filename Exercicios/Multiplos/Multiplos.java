

package com.mycompany.multiplos;
import java.util.Scanner;

public class Multiplos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite dois números:");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        
        if(n1 >= n2 && n1%n2==0){
            System.out.println("Múltiplos");
        }
        else if(n2 > n1 && n2%n1==0){
            System.out.println("Múltiplos");
        }
        else{
            System.out.println("Não são múltiplos");
        }
    }
}
