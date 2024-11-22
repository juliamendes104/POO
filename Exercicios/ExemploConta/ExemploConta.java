package com.mycompany.exemploconta;


public class ExemploConta {

    public static void main(String[] args) {
        Conta c1 = new Conta();
        Conta c2 = new Conta();
        
        c1.setNome("Caroline");
        c1.setCpf("443.919.218-12");
        
        String nome = c1.getNome();
        String cpf = c1.getCpf();
        int numeroConta = c1.getNumeroConta();
        int numeroConta2 = c2.getNumeroConta();
        
        System.out.println(nome + " " + cpf + " " + numeroConta);
        System.out.println(numeroConta2);
    }
}
