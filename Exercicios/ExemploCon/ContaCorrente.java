
package com.mycompany.exemplocon;

public class ContaCorrente extends ContaBancaria {
    private double limite;
    
    public ContaCorrente(int numero, double saldo, double limite){
        super(numero,saldo);
        this.limite = limite;
    }
    
    @Override
    public void sacar(double valor){
        if(this.getSaldo() > valor){
            super.sacar(valor);
        }
        else{
            if(limite > valor){
                this.limite -= valor;
                this.setSaldo(getSaldo()-valor);
            }
            else{
                System.out.println("Limite não é suficiente");
            }
        }
    }
}
