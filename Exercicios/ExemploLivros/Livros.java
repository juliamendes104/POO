package com.mycompany.exemplolivros;
import java.util.ArrayList;

public class Livros {
    private String editor;
    private String titulo;
    private int ano;
    private int edicao;
    private float preco;
    private ArrayList<Capitulos> capitulosList = new ArrayList<>();
    
    public Livros(String editor, String titulo, int ano, int edicao, float preco){
        this.editor = editor;
        this.titulo = titulo;
        this.ano = ano;
        this.edicao = edicao;
        this.preco = preco;
    }
    
    public void inserirCapitulos(Capitulos capitulos){
        capitulosList.add(capitulos);
    }
    
    public void imprimir(){
        System.out.println("Editor: " + this.editor + " Título: " + this.titulo + " Ano: " + this.ano + " Edição: " + this.edicao + " Preço: " + this.preco);
        for( Capitulos item : capitulosList){
            System.out.println("Título: " + item.getTitulo() + " Número de páginas: " + item.getNumPaginas() + " Autor: " + item.getAutor());
        }
    }
}
