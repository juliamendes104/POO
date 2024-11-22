
package com.mycompany.exemploag;

public class Conta {
    private String nome;
    private String cpf;
    private float saldo;
    private String senha;
    private int numeroConta;
    private int numeroAgencia;
    private static int contador = 0;

    public Conta(String nome, String cpf, float saldo, String senha, int numeroAgencia){
        contador++;
        this.nome = nome;
        this.cpf = cpf;
        this.saldo = saldo;
        this.senha = senha;
        this.numeroAgencia = numeroAgencia;
        this.numeroConta = contador;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public int getNumeroAgencia() {
        return numeroAgencia;
    }

    public void setNumeroAgencia(int numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
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
        return this.saldo;
    }

}
