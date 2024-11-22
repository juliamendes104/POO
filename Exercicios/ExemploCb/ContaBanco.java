
package com.mycompany.exemplocb;


public class ContaBanco {
    private static int contador = 0;
    private int numConta;
    private String tipo;
    private String dono;
    private double saldo;
    private boolean status;
    
    public ContaBanco(){
        this.status = false;
        this.saldo = 0.0;
    }
    public void abrirConta(String dono, String tipo){
        contador++;
        this.tipo = tipo;
        this.dono = dono;
        this.status = true;
        this.numConta = contador;
        
        if(tipo == "CC"){
            this.saldo = 50.0;
        }
        else{
            this.saldo = 150.0;
        }
        System.out.println("Conta criada com sucesso.");
    }

    public int getNumConta() {
        return numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    public void fecharConta(){
        if(this.saldo >0){
            System.out.println("Conta com dinheiro");
        }
        else if(this.saldo<0){
            System.out.println("Conta com dívida");
        }
        else{
            this.status = false;
            System.out.println("Conta fechada com sucesso");
        }
    }
    
    public void depositar(double saldo){
        if(this.status == true){
            this.saldo += saldo;
            System.out.println("Depósito realizado na conta de " + this.getDono());
        }
        else{
            System.out.println("Impossível depositar");
        }
    }
    
    public void sacar(double saldo){
        if(this.status == true){
            if(this.saldo >= saldo){
                this.saldo -= saldo;
                System.out.println("Saque realizado na conta de " + this.getDono());
            }
            else{
             System.out.println("Não é possóvel realizar o saque.");
            }
        }
        else{
            System.out.println("Impossível sacar.");
        }
    }
    
    public void pagarMensal(String tipo){
        double valor;
        if(tipo == "CC"){
            valor = 12.0;
        }
        else{
            valor = 20;
        }
        if(this.status == true){
            this.sacar(valor);
        }
        else{
            System.out.println("Impossivel pagar.");
        }
    }
    
    public void estadoAtual(){
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Conta: " + this.getDono());
        System.out.println("Conta: " + this.getTipo());
        System.out.println("Conta: " + this.getSaldo());
        System.out.println("Conta: " + this.getStatus());
    }
}

