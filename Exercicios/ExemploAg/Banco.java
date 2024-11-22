
package com.mycompany.exemploag;

public class Banco {
    private String nome;
    private long cnpj;
    private float deposito;
    private int numBanco;
    private Agencia agencia;

    public Banco(String nome, long cnpj, Agencia agencia){
        this.nome = nome;
        this.cnpj = cnpj;
        this.agencia = agencia;
        this.numBanco = this.agencia.getNumBanco();
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCnpj() {
        return cnpj;
    }

    public void setCnpj(long cnpj) {
        this.cnpj = cnpj;
    }

    public float getDeposito() {
        return deposito;
    }

    public void setDeposito(float deposito) {
        this.deposito = deposito;
    }

    public int getNumBanco() {
        return numBanco;
    }

    public void setNumBanco(int numBanco) {
        this.numBanco = numBanco;
    }

    public Agencia getAgencia() {
        return agencia;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }
    
    
    
}
