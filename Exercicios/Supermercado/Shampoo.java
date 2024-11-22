
package com.mycompany.supermercado;

public class Shampoo extends Produto {
    private int irritabilidade;
    
    public Shampoo(String nome, double preco, int irritabilidade){
        super(nome,preco);
        this.irritabilidade = irritabilidade;
    }
    
    public double custoBeneficio(){
        return 0.7 * (1/this.getPreco()) - 0.3 * this.irritabilidade;
    }
    
    @Override
    public int compareTo(Produto outro){
        Shampoo outroShampoo = (Shampoo)outro;
        if(this.custoBeneficio() < outroShampoo.custoBeneficio()){
            return -1;
        }
        else if(this.custoBeneficio() > outroShampoo.custoBeneficio()){
            return 1;
        }
        else{
            return 0;
        }
    }
}
