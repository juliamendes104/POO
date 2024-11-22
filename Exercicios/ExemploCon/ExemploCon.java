
package com.mycompany.exemplocon;

public class ExemploCon {

    public static void main(String[] args) {
        ContaBancaria p = new ContaPoupanca(1,500.0,0.25);
        ContaBancaria c = new ContaCorrente(2,700.0,1000.0);
        ContaBancaria[] conta = {p,c};
        
        
        conta[0].sacar(100.0);
        //ContaCorrente cor = (ContaCorrente)conta[1];
        //cor.sacar(800.0);
        conta[1].sacar(800.0);
        System.out.println(p.getSaldo());
        System.out.println(c.getSaldo());
    }
}
