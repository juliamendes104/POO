
package com.mycompany.exemploprodutos;

public class Produtos {
    private String nome;
    private float preco;
    private String descricao;
    
    public Produtos(String nome, float preco, String descricao){
        this.nome = nome;
        this. preco = preco;
        this.descricao = descricao;
    }
    
    public String getNome(){
        return nome;
    }
    
    public float getPreco(){
        return preco;
    }
}
