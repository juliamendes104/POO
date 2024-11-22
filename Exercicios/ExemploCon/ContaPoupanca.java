
package com.mycompany.exemplocon;

public class ContaPoupanca extends ContaBancaria {
    private double taxaDeJuros;
    
    public ContaPoupanca(int numeroDaConta, double saldo, double taxaDeJuros){
        super(numeroDaConta,saldo);
        this.taxaDeJuros = taxaDeJuros;
    }
    
    public void aplicarRendimento(){
        this.depositar(taxaDeJuros*getSaldo());
    }
}
