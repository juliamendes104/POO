
package com.mycompany.exemploconta;


public class Conta {
    private String nome;
    private String cpf;
    private float saldo;
    private String senha;
    private int numeroConta;
    private int numeroAgencia;
    private static int contador = 0;
    
    public Conta(){
        contador++;
        this.numeroConta = contador;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public String getCpf(){
        return cpf;
    }
    
    public void setSaldo(Float saldo){
        this.saldo = saldo;
    }
    public float getSaldo(){
        return saldo;
    }
    
    public void setSenha(String senha){
        this.senha = senha;
    }
    public String getSenha(){
        return senha;
    }
    
    public int getNumeroConta(){
        return numeroConta;
    }
    public void setNumeroAgencia(int numeroAgencia){
        this.numeroAgencia = numeroAgencia;
    }
    public int getNumeroAgencia(){
        return numeroAgencia;
    }
    
    public void getDeposito(float saldo){
        this.saldo += saldo;
    }
    public float getSaque(float saldo){
        if(this.saldo < saldo){
            System.out.println("Não é possível sacar.");
        }
        else{
            this.saldo -= saldo;
        }
        return saldo;
    }
}
