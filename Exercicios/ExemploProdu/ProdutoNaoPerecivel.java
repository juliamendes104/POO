
package com.mycompany.exemploprodu;

public class ProdutoNaoPerecivel extends ProdutoAbstrato {
    private String categoria;
    
    public ProdutoNaoPerecivel(String nome, double preco, int quantidade, String id, String categoria){
        super(nome,preco,quantidade,id);
        this.categoria = categoria;
    }
    
    @Override
    public double calcularDesconto(){
        if(this.categoriaEspecial()){
            return 5;
        }
        return 0;
    }
    
    public boolean categoriaEspecial(){
        return this.categoria.equals("Especial");
    }
}
