
package com.mycompany.exemplopassagem;

import java.time.LocalDateTime;

public class ExemploPassagem {

    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.of(2021,5,13,14,50,0);
        PassagemEconomica eco = new PassagemEconomica("economica",15.8,ldt,"Botanica","Paraiso");
        PassagemExecutiva exe = new PassagemExecutiva("executiva",20.0,ldt,"Botanica","Paraiso");
        SistemaReservas sr = new SistemaReservas();
        sr.adicionarPassagem(eco);
        sr.adicionarPassagem(exe);
        sr.listarPassagens();
        System.out.println(sr.calcularPrecoFinal("economica"));
        System.out.println(sr.calcularPrecoFinal("executiva"));
        sr.removerPassagem("economica");
        sr.listarPassagens();
    }
}
