package com.mycompany.exemplolivros;

public class ExemploLivros {

    public static void main(String[] args) {
        Capitulos c1 = new Capitulos("Capitulo1", 56, "Ronaldo");
        Capitulos c2 = new Capitulos ("Capitulo2", 45, "Mariana");
        Capitulos c3 = new Capitulos("Capitulo3", 67, "Cristiane");
        
        Livros l1 = new Livros("Marcelo", "Boitata", 2013, 4, 34.5f);
        l1.inserirCapitulos(c1);
        l1.inserirCapitulos(c2);
        l1.inserirCapitulos(c3);
        
        l1.imprimir();
    }
}
