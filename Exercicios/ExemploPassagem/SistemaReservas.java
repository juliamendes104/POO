
package com.mycompany.exemplopassagem;

import java.util.ArrayList;
import java.util.List;

public class SistemaReservas {
    private List<Passagem> passagens;
    
    public SistemaReservas(){
        passagens = new ArrayList<>();
    }
    
    public void adicionarPassagem(Passagem passagem){
        passagens.add(passagem);
    }
    
    public void removerPassagem(String codigo){
        Passagem passagem = this.buscarPassagem(codigo);
        if(passagem!=null){
            passagens.remove(passagem);
        }
    }
    
    public void listarPassagens(){
        for(Passagem item: passagens){
            System.out.println(item.getCodigo());
        }
    }
    
    public Passagem buscarPassagem(String codigo){
        for(Passagem item: passagens){
            if(item.getCodigo().equals(codigo)){
                return item;
            }
        }
        return null;
    }
    
    public double calcularPrecoFinal(String codigo){
        Passagem passagem = this.buscarPassagem(codigo);
        if(passagem!=null){
            if(passagem instanceof PassagemEconomica){
                return ((PassagemEconomica)passagem).calcularPrecoFinal();
            }
            else if(passagem instanceof PassagemExecutiva){
                return ((PassagemExecutiva)passagem).calcularPrecoFinal();
            }
        }
        return 0;
    }
}
