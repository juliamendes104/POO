
package com.mycompany.exemplocon;

public class ContaBancaria {
    private int numeroDaConta;
    private double saldo;
    
    public ContaBancaria(int numero, double saldo){
        this.numeroDaConta = numero;
        this.saldo = saldo;
    }
    public void depositar(double valor){
        this.saldo += valor;
    }
    
    public double getSaldo(){
        return saldo;
    }
    
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    
    public void sacar(double valor){
        if(this.saldo > valor){
            this.saldo -= valor;
        }
        else{
            System.out.println("Não é possível realizar o saque");
        }
    }
}
