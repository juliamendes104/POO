
package com.mycompany.exemploc;

public class ContaBancaria {
    public double saldo;
    public String titular;
    
    public void depositar(double saldo){
        this.saldo += saldo;
        System.out.println(this.titular + " " + this.saldo);
    }
    public void sacar(double saldo){
        this.saldo -= saldo;
        System.out.println(this.titular + " " + this.saldo);
    }
}
