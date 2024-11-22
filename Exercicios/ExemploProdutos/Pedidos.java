
package com.mycompany.exemploprodutos;
import java.util.ArrayList;

public class Pedidos {
    private ArrayList <Produtos> produtosLista = new ArrayList<>();
    private float preco = 0;
    
    public Pedidos(Produtos produto1){
        this.produtosLista.add(produto1);
    }
    
    public void adicionarProdutos(Produtos produto1){
        this.produtosLista.add(produto1);
    }
    
    public void imprimirPedido(){
        for(Produtos item : produtosLista){
            System.out.println("Nome do produto: " + item.getNome() + " Preço do produto: " + item.getPreco());
            this.preco += item.getPreco();
        }
        System.out.println("Valor total da compra: " + this.preco);
    }
}
