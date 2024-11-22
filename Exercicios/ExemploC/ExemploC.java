
package com.mycompany.exemploc;

public class ExemploC {

    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria();
        ContaBancaria conta2 = new ContaBancaria();
        
        conta1.saldo = 100.0;
        conta1.titular = "Arnaldo";
        conta2.saldo = 200.0;
        conta2.titular = "Lucas";
        
        conta1.depositar(50.0);
        conta2.sacar(20.0);
        conta1.sacar(40.0);
        conta2.depositar(30.0);
    }
}
