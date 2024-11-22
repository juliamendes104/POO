
package com.mycompany.exemploani;

public class ExemploAni {

    public static void main(String[] args) {
        Mamifero mamifero = new Mamifero();
        Ave ave = new Ave();
        Reptil reptil = new Reptil();
        Animal[] animal = {mamifero,ave,reptil};
        
        for(int i=0;i<animal.length;i++){
            animal[i].fazerSom();
            animal[i].seMovimentar();
            System.out.println();
        }
    }
}
