
package com.mycompany.exemplofunc;

public class Horista extends Funcionario{
    private int horas;
    
    public Horista(String nome, double salario, int horas){
        super(nome,salario);
        this.horas = horas;
    }
    
    @Override
    public double calcularSalario(){
        return getSalario() * horas;
    }
}
