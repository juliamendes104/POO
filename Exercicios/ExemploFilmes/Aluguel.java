package com.mycompany.exemplofilmes;

public class Aluguel {
    private int periodoTempo;
    private float taxa;
    private Filmes filme;
    
    public Aluguel(int tempo, Filmes filme){
        this.periodoTempo = tempo;
        this.filme = filme;
        this.taxa = tempo * 1.99f;
    }
    
    public float getTaxa(){
        return taxa;
    }
    
    public Filmes getFilme(){
        return filme;
    }
}
