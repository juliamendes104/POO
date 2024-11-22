
package com.mycompany.exemploprodutos;
import java.util.ArrayList;

public class Cliente {
    private String nome;
    private ArrayList <Pedidos> pedidosLista = new ArrayList<>();
    private static int contador = -1;
    
    public Cliente(String nome){
        this.nome = nome;
    }
    
    public void pedirProduto(Produtos produto){
        Pedidos pedido = new Pedidos(produto);
        this.pedidosLista.add(pedido);
        contador++;
    }
    
    public void inserirProduto(Produtos produto){
        this.pedidosLista.get(contador).adicionarProdutos(produto);
    }
    
    public void imprimirHistorico(){
        System.out.println("Nome: " + this.nome);
        for(Pedidos item: pedidosLista){
            item.imprimirPedido();
        }
    }
}
