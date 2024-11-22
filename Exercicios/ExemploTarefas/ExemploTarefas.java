package com.mycompany.exemplotarefas;

public class ExemploTarefas {

    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("Luisa", "luisa.mendes@gmail");
        usuario1.criarTarefa("Tarefa1", "Escrever o tempo verbal", "29/03");
        usuario1.editarTarefa("Descrever o tempo verbal");
        usuario1.concluirTarefa("10/04");
        usuario1.imprimir();
    }
}
