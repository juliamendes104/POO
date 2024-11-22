
package com.mycompany.exemplop;


public class Livro implements Publicacao {
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor){
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.leitor = leitor;
        this.setAberto(false);
        this.setPagAtual(0);
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean getAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }
    
    public void detalhes(){
        System.out.println("Título: " + this.getTitulo());
        System.out.println("Autor: " + this.getAutor());
        System.out.println("Total de Página: " + this.getTotPaginas());
        if(this.getAberto()){
            System.out.println("Página Atual: " + this.getPagAtual());
        }
        else{
            System.out.println("Livro Fechado");
        }
        System.out.println("Leitor: " + this.getLeitor().getNome());
        System.out.println("Idade do leitor: " + this.getLeitor().getIdade());
        System.out.println("Sexo do leitor: " + this.getLeitor().getSexo());
        
    }

    @Override
    public void abrir() {
        this.setAberto(true);
    }

    @Override
    public void fechar() {
        this.setAberto(false);
    }

    @Override
    public void folhear(int paginas) {
        if((this.getPagAtual() + paginas) < this.getTotPaginas()){
            this.setPagAtual(this.getPagAtual() + paginas);
        }
        else{
            System.out.println("Não é possível folhear essa quantidade de páginas.");
        }
    }

    @Override
    public void avancarPag() {
        if(this.getAberto() && this.getPagAtual() != this.getTotPaginas()){
            this.setPagAtual(this.getPagAtual() + 1);
        }
        else{
            System.out.println("Não é possível avançar a página.");
        }
    }

    @Override
    public void voltarPag() {
        if(this.getAberto() && this.getPagAtual() != 0){
            this.setPagAtual(this.getPagAtual() + 1);
        }
        else{
            System.out.println("Não é possível voltar a página.");
        }
    }
}
