
package com.mycompany.produto;

public class Supermercado {
    
    public static void main(String[] args){
        Shampoo shampoo = new Shampoo("Pantene",15.99,2);
        Shampoo shampoo1 = new Shampoo("Seda",12.49,3);
        Shampoo shampoo2 = new Shampoo("Clear",16.99,4);
        Biscoito biscoito = new Biscoito("Negresco",4.99,16);
        Biscoito biscoito1 = new Biscoito("Oreo",5.99,16);
        Biscoito biscoito2 = new Biscoito("Club Social",3.29,18);
        Leite leite = new Leite("Tirol",3.49,7);
        Leite leite1 = new Leite("Batavo",3.89,5);
        Leite leite2 = new Leite("Piracanjuba",6.79,10);
        
        Shampoo[] vetorShampoo = {shampoo,shampoo1,shampoo2};
        Biscoito[] vetorBiscoito = {biscoito,biscoito1,biscoito2};
        Leite[] vetorLeite = {leite,leite1,leite2};
        
        Shampoo maiorCustoBeneficio = vetorShampoo[0];
        for(Shampoo item : vetorShampoo){
            if(item.compareTo(maiorCustoBeneficio) >= 0){
                maiorCustoBeneficio = item;
            }
        }
        
        Biscoito maiorCustoBeneficioB = vetorBiscoito[0];
        for(Biscoito item : vetorBiscoito){
            if(item.compareTo(maiorCustoBeneficioB) >= 0){
                maiorCustoBeneficioB = item;
            }
        }
        
        Leite maiorCustoBeneficioL = vetorLeite[0];
        for(Leite item : vetorLeite){
            if(item.compareTo(maiorCustoBeneficioL) >= 0){
                maiorCustoBeneficioL = item;
            }
        }
        
        System.out.println("Melhor custo beneício:");
        System.out.println("Shampoo: " + maiorCustoBeneficio.getNome());
        System.out.println("Biscoito: " + maiorCustoBeneficioB.getNome());
        System.out.println("Leite: " + maiorCustoBeneficioL.getNome());
        
    }
}
