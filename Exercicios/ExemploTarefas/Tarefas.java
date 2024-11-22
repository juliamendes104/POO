
package com.mycompany.exemplotarefas;

public class Tarefas {
    private String nome;
    private String descricao;
    private String dataCriacao;
    private String dataConclusao;
    
    public Tarefas(String nome, String descricao, String dataCriacao){
        this.nome = nome;
        this.descricao = descricao;
        this.dataCriacao = dataCriacao;
    }
    
    public String getDescricao(){
        return descricao;
    }
    
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public String getDataConclusao() {
        return dataConclusao;
    }

    public void setDataConclusao(String dataConclusao) {
        this.dataConclusao = dataConclusao;
    }

    public String getNome() {
        return nome;
    }

    public String getDataCriacao() {
        return dataCriacao;
    }
    
    
    
}
