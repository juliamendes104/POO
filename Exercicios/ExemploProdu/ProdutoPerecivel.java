
package com.mycompany.exemploprodu;

import java.time.LocalDate;

public class ProdutoPerecivel extends ProdutoAbstrato{
    private LocalDate dataValidade;
    
    public ProdutoPerecivel(String nome, double preco, int quantidade, String id, LocalDate data){
        super(nome,preco,quantidade,id);
        this.dataValidade = data;
    }
    
    @Override
    public double calcularDesconto(){
        if(!this.produtoVencido()){
            if(this.dataValidade.getMonth()==LocalDate.now().getMonth()){
                return dataValidade.getDayOfMonth() - LocalDate.now().getDayOfMonth();
            }
            return 30;
        }
        return 0;
    }
    
    public boolean produtoVencido(){
        LocalDate data = LocalDate.now();
        return data.isAfter(this.dataValidade) || data.isEqual(this.dataValidade);
    }
}
