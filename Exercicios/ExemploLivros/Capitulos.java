package com.mycompany.exemplolivros;

public class Capitulos {
    private String titulo;
    private int numPaginas;
    private String autor;
    
    public Capitulos(String titulo, int numPaginas, String autor){
        this.titulo = titulo;
        this.numPaginas = numPaginas;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public String getAutor() {
        return autor;
    }
}
