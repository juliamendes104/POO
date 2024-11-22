
package com.mycompany.exemplotempo;

public class ExemploTempo {

    public static void main(String[] args) {
        
        //Tempo t1 = new Tempo(11,10,26);
        //Tempo t2 = new Tempo(2,45,35);
        //Tempo t3 = new Tempo();
        
        //t3 = t3.somar(t1,t2, t3);
        //t3.subtrair(t1,t2);
        //t3.imprimir();
        Estacionamento e1 = new Estacionamento("GHY.03","XZIN",18,13);
        e1.imprimir();
        System.out.println("Valor: " + e1.pagarValor() + "$");
    }
}
