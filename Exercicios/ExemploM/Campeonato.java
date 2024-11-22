
package com.mycompany.exemplom;
import java.util.ArrayList;

public class Campeonato {
    private ArrayList <Motorcycle> motorcycleLista = new ArrayList<>();
    private static int quantMotos = 0;
    
    public Campeonato(Motorcycle motorcycle1, Motorcycle motorcycle2){
        motorcycleLista.add(motorcycle1);
        motorcycleLista.add(motorcycle2);
        quantMotos += 2;
        
    }
    
    public void adicionarMoto(Motorcycle motorcycle1){
        motorcycleLista.add(motorcycle1);
        quantMotos++;
    }
    
    public void evento(int id, int speed){
        for(Motorcycle item : motorcycleLista ){
            if(item.getId() == id){
                item.speedUp(speed);
            }
            item.setDistancia();
            item.getStatus();
        }
    }
}
