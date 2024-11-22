
package com.mycompany.exemplofilmes;
import java.util.ArrayList;

public class Cliente {
    private String nome;
    private ArrayList <Aluguel> aluguelLista = new ArrayList<>();
    
    public Cliente(String nome){
        this.nome = nome;
    }
    
    public void alugarFilme(int tempo, Filmes filme){
        Aluguel a = new Aluguel(tempo,filme);
        aluguelLista.add(a);
    }
    
    public void historicoAluguel(){
        for(Aluguel item : aluguelLista){
            System.out.println("Valor: " + item.getTaxa() + " Nome do filme: " + item.getFilme().getTitulo());
        }
    }
}
