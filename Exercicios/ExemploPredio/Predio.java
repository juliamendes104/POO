
package com.mycompany.exemplopredio;
import java.util.ArrayList;

public class Predio {
    private ArrayList<Andar> andares = new ArrayList<>();
    private ArrayList<Elevador> elevadores = new ArrayList();
    
    public Predio(int totalAndares, int totalElevador){
        for(int i=1; i<=totalAndares; i++){
            this.andares.add(new Andar(i));
        }
        for(int i=0; i<totalElevador; i++){
            this.elevadores.add(new Elevador());
        }
    }

    public ArrayList<Andar> getAndares() {
        return andares;
    }

    public ArrayList<Elevador> getElevadores() {
        return elevadores;
    }
    
    
}
