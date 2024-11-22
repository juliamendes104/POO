
package com.mycompany.exemplop;


public class ExemploP {

    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Rosa", 54, "F");
        Livro livro1 = new Livro("O nome da rosa", "Umberto Eco", 400, pessoa1);
        livro1.abrir();
        livro1.setPagAtual(98);
        livro1.folhear(200);
        livro1.avancarPag();
        pessoa1.fazerAniversario();
        livro1.detalhes();
    }
}
