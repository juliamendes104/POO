package com.mycompany.exercicio11;
import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int flag = 0;
        
        System.out.println("Digite uma frase: ");
        String str = sc.nextLine();
        
        str = str.toLowerCase();
        
        for(int i=0; i<str.length()-1; i++){
            for(int j=i+1; j<str.length();j++){
                if(str.charAt(i) == str.charAt(j)){
                    flag = 1;
                }
            }
        }
        
        if(flag == 0){
            System.out.println("Caracteres únicos");
        }
        else{
            System.out.println("Repete caracter(s)");
        }
    }
}
