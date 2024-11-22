
package com.mycompany.exemplofilmes;

public class Filmes {
    private String titulo;
    private int anoLancamento;
    private String diretor;
    private String genero;
    
    public Filmes(String titulo, int ano, String diretor, String genero){
        this.titulo = titulo;
        this.anoLancamento = ano;
        this.diretor = diretor;
        this.genero = genero;
    }
    
    public String getTitulo(){
        return titulo;
    }
}
