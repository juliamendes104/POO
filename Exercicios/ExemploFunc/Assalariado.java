
package com.mycompany.exemplofunc;

public class Assalariado extends Funcionario {
    public Assalariado(String nome, double salario){
        super(nome,salario);
    }
    
    @Override
    public double calcularSalario(){
        return getSalario();
    }
}
