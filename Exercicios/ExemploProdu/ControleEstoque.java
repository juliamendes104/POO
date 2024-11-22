
package com.mycompany.exemploprodu;
import java.util.ArrayList;

public class ControleEstoque {
    private ArrayList<Produto> produtos;
    
    public ControleEstoque(){
        produtos = new ArrayList<Produto>();
    }
    
    public void adicionarProduto(Produto produto){
        produtos.add(produto);
    }
    
    public void removerProduto(String id){
        Produto produto = this.buscarProduto(id);
        if(produto!=null){
            produtos.remove(produto);
        }
    }
    
    public void listarProdutos(){
        for(Produto item: produtos){
            System.out.println(item.getNome());
        }
    }
    
    public Produto buscarProduto(String id){
        for(Produto item: produtos){
            if(item.getId().equals(id)){
                return item;
            }
        }
        return null;
    }
    
    public void aplicarDesconto(String id){
        Produto produto = this.buscarProduto(id);
        if(produto!=null){
            if(produto instanceof ProdutoPerecivel){
                double desconto = ((ProdutoPerecivel)produto).calcularDesconto();
                ((ProdutoPerecivel)produto).setPreco((desconto/100) * ((ProdutoPerecivel)produto).getPreco());
            }
            else if(produto instanceof ProdutoNaoPerecivel){
                double desconto = ((ProdutoNaoPerecivel)produto).calcularDesconto();
                ((ProdutoNaoPerecivel)produto).setPreco((desconto/100) * ((ProdutoNaoPerecivel)produto).getPreco());
            }
        }
    }
}
