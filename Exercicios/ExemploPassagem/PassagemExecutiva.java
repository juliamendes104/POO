
package com.mycompany.exemplopassagem;

import java.time.LocalDateTime;

public class PassagemExecutiva extends PassagemAbstrata{
    
    public PassagemExecutiva(String codigo, double preco, LocalDateTime dataHora, String origem, String destino){
        super(codigo,preco,dataHora,origem,destino);
    }
    
    @Override
    public double calcularPrecoFinal(){
        return this.getPreco() * 1.5;
    }
    
    public double teste(){
        return 0;
    }
}
