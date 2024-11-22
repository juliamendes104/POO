
package com.mycompany.exemploprodutos;

public class ExemploProdutos {

    public static void main(String[] args) {
        Produtos p1 = new Produtos("Sabonete", 3.7f, "Sabonete de corpo");
        Produtos p2 = new Produtos("Creme dental", 12.0f, "Para limpar os dentes");
        Produtos p3 = new Produtos("Desodorante", 10.5f, "Para evitar o mau odor");
        
        Cliente c = new Cliente("Rosana");
        c.pedirProduto(p1);
        c.inserirProduto(p2);
        c.pedirProduto(p3);
        
        c.imprimirHistorico();
    }
}
