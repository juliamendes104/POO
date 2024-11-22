
package com.mycompany.produto;

public class Biscoito extends Produto{
    private int quanComponente;
    
    public Biscoito(String nome, double preco, int quanComponente){
        super(nome,preco);
        this.quanComponente = quanComponente;
    }
    
    public double custoBeneficio(){
        return 0.7 * (1/this.getPreco()) - 0.3 * this.quanComponente;
    }
    
    @Override
    public int compareTo(Produto outro){
        Biscoito outroBiscoito = (Biscoito)outro;
        if(this.custoBeneficio() < outroBiscoito.custoBeneficio()){
            return -1;
        }
        else if(this.custoBeneficio() > outroBiscoito.custoBeneficio()){
            return 1;
        }
        else{
            return 0;
        }
    }
}
