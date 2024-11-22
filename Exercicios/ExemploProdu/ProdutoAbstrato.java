
package com.mycompany.exemploprodu;

public abstract class ProdutoAbstrato implements Produto{
    private String nome;
    private double preco;
    private int quantidade;
    private String id;
    
    public ProdutoAbstrato(String nome, double preco, int quantidade, String id){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.id = id;
    }
    
    public abstract double calcularDesconto();
    
    @Override
    public String getNome(){
        return nome;
    }
    
    @Override
    public double getPreco(){
        return preco;
    }
    
    @Override
    public int getQuantidade(){
        return quantidade;
    }
    
    @Override
    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }
    
    @Override
    public String getId(){
        return id;
    }
    
    
    @Override
    public void setPreco(double valor){
        this.preco -= valor;
    }
}
