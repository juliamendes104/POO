
package com.mycompany.exemplofunc;

public class Comissionado extends Funcionario{
    private double comissao;
    
    public Comissionado(String nome, double salario, double comissao){
        super(nome,salario);
        this.comissao = comissao;
    }
    
    @Override
    public double calcularSalario(){
       return (0.25 * comissao) + getSalario(); 
    }
}
