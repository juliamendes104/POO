
package com.mycompany.exemplopessoas;

public class ExemploPessoas {

    public static void main(String[] args) {
        //Pessoa p1 = new Pessoa();
        Visitante v1 = new Visitante();
        v1.setNome("Juvenal");
        v1.setIdade(22);
        v1.setSexo("M");
        //System.out.println(v1.toString());
        
        Aluno a1 = new Aluno();
        a1.setNome("Cláudio");
        a1.setIdade(16);
        a1.setSexo("M");
        a1.setMat(1111);
        a1.setCurso("Informática.");
        a1.pagarMensalidade();
        
        Bolsista b1 = new Bolsista();
        b1.setNome("Jubileu");
        b1.setIdade(16);
        b1.setSexo("M");
        b1.setMat(1112);
        b1.setCurso("Sistemas");
        b1.setBolsa(12.5f);
        b1.pagarMensalidade();
    }
}
