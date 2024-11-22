
package com.mycompany.exemplopredio;

public class ExemploPredio {

    public static void main(String[] args) {
        Predio p = new Predio(9,1);
        
        Pessoa p1 = new Pessoa("Maria");
        Pessoa p2 = new Pessoa("Joao");
        Pessoa p3 = new Pessoa ("Carlota");
        
        p1.pegarElevador(p, 8);
        p2.pegarElevador(p, 7);
        p3.pegarElevador(p,1);
        p1.pararDeSegurarAPorta(p);
        
    }
}
