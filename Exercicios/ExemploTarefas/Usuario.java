
package com.mycompany.exemplotarefas;

public class Usuario {
    private String nome;
    private String email;
    private Tarefas tarefa;
    
    public Usuario(String nome, String email){
        this.nome = nome;
        this.email = email;
    }
    
    public void atribuirTarefa(Tarefas tarefa){
        this.tarefa = tarefa;
    }
    
    public void criarTarefa(String nome, String descricao, String dataCriacao){
        Tarefas t = new Tarefas(nome,descricao,dataCriacao);
        this.tarefa = t;
    }
    
    public void editarTarefa(String descricao){
        this.tarefa.setDescricao(descricao);
    }
    
    public void concluirTarefa(String dataConclusao){
        this.tarefa.setDataConclusao(dataConclusao);
    }
    
    public void imprimir(){
        System.out.println("Nome: " + this.nome + " Email: " + this.email + " " + this.tarefa.getNome() + " Descrição: " + this.tarefa.getDescricao() + " Data de criação: " + this.tarefa.getDataCriacao() + " Data de conclusão: " + this.tarefa.getDataConclusao());
    }
}
