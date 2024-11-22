
package com.mycompany.exemplofilmes;

public class ExemploFilmes {

    public static void main(String[] args) {
        Filmes f1 = new Filmes("Gato de Botas", 2022, "Fulano", "Animacao");
        Filmes f2 = new Filmes("Como treinar seu dragao", 2010, "Dean Deblois", "Animacao");
        Cliente c = new Cliente("Creusa");
        c.alugarFilme(7, f1);
        c.alugarFilme(10,f2);
        c.historicoAluguel();
    }
}
