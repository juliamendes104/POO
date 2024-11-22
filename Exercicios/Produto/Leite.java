
package com.mycompany.produto;

public class Leite extends Produto {
    private int quanDias;
    
    public Leite(String nome, double preco, int quanDias){
        super(nome,preco);
        this.quanDias = quanDias;
    }
    
    public double custoBeneficio(){
        return 0.7 * (1/this.getPreco()) + 0.3 * this.quanDias;
    }
    
    @Override
    public int compareTo(Produto outro){
        Leite outroLeite = (Leite)outro;
        if(this.custoBeneficio() < outroLeite.custoBeneficio()){
            return -1;
        }
        else if(this.custoBeneficio() > outroLeite.custoBeneficio()){
            return 1;
        }
        else{
            return 0;
        }
    }
}
