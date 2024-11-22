
package com.mycompany.exemplofunc;

public class ExemploFunc {

    public static void main(String[] args) {
        Horista h = new Horista("Alfredo",6.0,240);
        Assalariado a = new Assalariado("Marcos",1400.50);
        Comissionado c = new Comissionado("Jorge",1100.0,500.0);
        System.out.println(h.calcularSalario());
        System.out.println(a.calcularSalario());
        System.out.println(c.calcularSalario());
        
        //Funcionario[] funcionarios = new Funcionario[3];
        //funcionarios[0] = new Horista("Alfredo",6.0,240);
        
        Funcionario[] funcionarios = {h,a,c};
        for(Funcionario item: funcionarios){
            System.out.println("Salário "+ item.calcularSalario());
        }
        
    }
}
