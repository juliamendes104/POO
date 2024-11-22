
package com.mycompany.exemploag;

public class ExemploAg {

    public static void main(String[] args) {
        Conta conta1 = new Conta("Mariana", "332.778.968-19", 100f, "765427", 9876);
        conta1.getDeposito(50f);
        System.out.println(conta1.getSaque(70f));
        Conta conta2 = new Conta("Pedro", "099.789.333-12", 700f, "987465", 9876);
        
        Agencia agencia1 = new Agencia(conta1.getNome(),conta1);
        agencia1.buscarConta(1, "765427");
        System.out.println("Agencia7");
        agencia1.inserirConta(conta2);
        agencia1.buscarConta(2, "987465");
        
        
    }
}
