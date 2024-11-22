
package com.mycompany.exemplopredio;
import java.util.ArrayList;

public class Elevador {
    private Andar andarAtual;
    private ArrayList<Pessoa> passageiros = new ArrayList<>();
    
    public Elevador(){
        this.andarAtual = null;
    }
    
    public void embarcarPessoa(Pessoa pessoa){
        this.passageiros.add(pessoa);
        System .out . println ( pessoa . getNome () + " entrou no elevador .") ;
    }
    
    public void desembarcarPessoa(Pessoa pessoa){
        this.passageiros.remove(pessoa);
        System .out . println ( pessoa . getNome () + " saiu do elevador .") ;
    }
    
    public int acharAndar(){
        int andarDestino = this.passageiros.get(0).getDestino().getNumero();
        for(int i=0; i<this.passageiros.size(); i++){
            if(this.passageiros.get(i).getDestino().getNumero()<andarDestino){
                andarDestino = this.passageiros.get(i).getDestino().getNumero();
            }
        }
        return andarDestino;
    }
    
    public void mover(){
        int andarDestino = acharAndar();
        System .out . println (" Elevador se movendo para o andar " + andarDestino ) ;
            for(Pessoa item: new ArrayList<>(passageiros)){
                if(andarDestino == item.getDestino().getNumero()){
                    desembarcarPessoa(item);
                    this.andarAtual = item.getDestino();
                }
            }
            if(!this.passageiros.isEmpty()){
                mover();
            }    
    }
}
