
package com.mycompany.exemplopassagem;

import java.time.LocalDateTime;

public abstract class PassagemAbstrata implements Passagem {
    private String codigo;
    private double preco;
    private LocalDateTime dataHora;
    private String origem;
    private String destino;
    
    public PassagemAbstrata(String codigo, double preco, LocalDateTime dataHora, String origem, String destino){
        this.codigo = codigo;
        this.preco = preco;
        this.dataHora = dataHora;
        this.origem = origem;
        this.destino = destino;
    }
    
    public abstract double calcularPrecoFinal();
    
    @Override
    public String getCodigo(){
        return codigo;
    }
    
    @Override
    public double getPreco(){
        return preco;
    }
    
    @Override
    public LocalDateTime getDataHora(){
        return dataHora;
    }
    
    @Override
    public String getOrigem(){
        return origem;
    }
    
    @Override
    public String getDestino(){
        return destino;
    }
}
