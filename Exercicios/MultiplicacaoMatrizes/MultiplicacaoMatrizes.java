
package com.mycompany.multiplicacaomatrizes;
import java.util.Scanner;

public class MultiplicacaoMatrizes {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        
        System.out.print("Digite a quantidade de linhas e colunas da primeira matriz: ");
        int linha = sc.nextInt();
        int coluna = sc.nextInt();
        
        int[][] matriz = new int[linha][coluna];
        
        for(int i = 0; i < linha; i++){
            for(int j = 0; j < coluna; j++){
                System.out.print("Digite um número: ");
                matriz[i][j] = sc.nextInt();
            }
        }
        
        System.out.print("Digite a quantidade de linhas e colunas da segunda matriz: ");
        int linha2 = sc.nextInt();
        int coluna2 = sc.nextInt();
        
        int[][] matriz1 = new int[linha2][coluna2];
        
        for(int i = 0; i < linha2; i++){
            for(int j = 0; j < coluna2; j++){
                System.out.print("Digite um número: ");
                matriz1[i][j] = sc.nextInt();
            }
        }
        
        if(matriz[0].length == matriz1.length){
            
            int[][] matriz2 = new int[linha][coluna2];
            int aux;
            
            for(int i = 0; i < linha; i++){
                for(int j = 0; j < coluna2; j++){
                    aux = 0;
                    for(int k = 0; k < linha2; k++){
                        aux = aux + matriz[i][k] * matriz1[k][j];
                    }
                    matriz2[i][j] = aux;
                }
            }
            
            for(int i = 0; i < linha; i++){
                for(int j = 0; j < coluna2; j++){
                    System.out.print(matriz2[i][j] + " ");
                }
                System.out.print("\n");
            }
        }
        else{
            System.out.println("Não é possível multiplicar.");
        }
    }
}
