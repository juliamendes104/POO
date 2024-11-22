
package com.mycompany.exemploprodu;

import java.time.LocalDate;

public class ExemploProdu {

    public static void main(String[] args) {
        LocalDate data = LocalDate.of(2023,05,23);
        ProdutoPerecivel pp = new ProdutoPerecivel("Leite", 3.5, 2, "L123",data);
        data = LocalDate.of(2023,05,10);
        ProdutoPerecivel pp1 = new ProdutoPerecivel("Peixe", 12.99, 3, "0001",data);
        ProdutoNaoPerecivel pnp = new ProdutoNaoPerecivel("Caneta Bic", 1.50, 50, "C0001","Normal");
        ProdutoNaoPerecivel pnp2 = new ProdutoNaoPerecivel("Caderno", 10.00, 20, "C0002","Especial");
        
        ControleEstoque c = new ControleEstoque();
        c.adicionarProduto(pp);
        c.adicionarProduto(pp1);
        c.adicionarProduto(pnp);
        c.adicionarProduto(pnp2);
        c.listarProdutos();
        c.aplicarDesconto("L123");
        c.aplicarDesconto("0001");
        c.aplicarDesconto("C0001");
        c.aplicarDesconto("C0002");
        System.out.println(pp.getPreco());
        System.out.println(pp1.getPreco());
        System.out.println(pnp.getPreco());
        System.out.println(pnp2.getPreco());
        
        c.removerProduto("0001");
        c.removerProduto("C0001");
        c.listarProdutos();
    }
}
