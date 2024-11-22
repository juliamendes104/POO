
package com.mycompany.exemplom;

public class ExemploM {

    public static void main(String[] args) {
        Motorcycle motorcycle1 = new Motorcycle(19,2);
        Motorcycle motorcycle2 = new Motorcycle(29,3);
        Motorcycle motorcycle3 = new Motorcycle(49,5);
        
        Campeonato campeonato1 = new Campeonato(motorcycle1, motorcycle2);
        campeonato1.adicionarMoto(motorcycle3);
        campeonato1.evento(1001, 2);
        campeonato1.evento(1003, -3);
        
    }
}
