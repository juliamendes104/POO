
package com.mycompany.exemplocb;


public class ExemploCB {

    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.setDono("Jubileu");
        p1.abrirConta(p1.getDono(), "CC");
        
        ContaBanco p2 = new ContaBanco();
        p2.abrirConta("Creusa", "CP");
        
        p1.depositar(100.0);
        p2.depositar(500.0);
        p2.sacar(1000.0);
        
        p1.sacar(150);
        p1.fecharConta();
        
        p1.estadoAtual();
        p2.estadoAtual();
    }
}
