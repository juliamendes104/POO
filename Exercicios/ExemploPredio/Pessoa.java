
package com.mycompany.exemplopredio;

public class Pessoa {
    private String nome;
    private Andar destino;
    
    public Pessoa(String nome){
        this.nome = nome;
    }
    
    public void pegarElevador(Predio predio, int destino){
        for(Andar item: predio.getAndares()){
            if(item.getNumero() == destino){
                this.destino = item;
            }
        }
        predio.getElevadores().get(0).embarcarPessoa(this);
    }
    
    public void pararDeSegurarAPorta(Predio predio){
        predio.getElevadores().get(0).mover();
    }

    public Andar getDestino() {
        return destino;
    }

    public String getNome() {
        return nome;
    }
    
    
}
