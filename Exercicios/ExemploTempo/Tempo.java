
package com.mycompany.exemplotempo;

public class Tempo {
    private int hora;
    private int minuto;
    private int segundo;
    
    public Tempo(){
        this.hora = 0;
        this.minuto = 0;
        this.segundo = 0;
    }
    public Tempo(int hora, int minuto, int segundo){
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }
    
    public void imprimir(){
        System.out.println(this.getHora() + ":" + this.getMinuto() + ":" + this.getSegundo());
    }
    
    public void subtrair(Tempo tempo1, Tempo tempo2){
        if((tempo1.segundo - tempo2.segundo) >= 0){
            this.segundo = tempo1.segundo - tempo2.segundo;
        }
        else{
            this.minuto--;
            this.segundo = (tempo1.segundo + 60) - tempo2.segundo;
        }
        
        if((tempo1.minuto - tempo2.segundo) >= 0){
            this.minuto += tempo1.minuto - tempo2.segundo;
        }
        else{
            this.hora--;
            this.minuto += (tempo1.minuto + 60) - tempo2.minuto;
        }
        
        this.hora += tempo1.hora - tempo2.hora;
    }
    
    public void somar(Tempo tempo1, Tempo tempo2){
        if((tempo1.segundo + tempo2.segundo) < 60){
            this.segundo = tempo1.segundo + tempo2.segundo;
        }
        else{
            this.minuto++;
            this.segundo = (tempo1.segundo + tempo2.segundo) - 60;
        }
        
        if((tempo1.minuto + tempo2.minuto) < 60){
            this.minuto += tempo1.minuto + tempo2.minuto;
        }
        else{
            this.hora++;
            this.minuto += (tempo1.minuto + tempo2.minuto) - 60;
        }
        
        this.hora += tempo1.hora + tempo2.hora;
    }
    
    public Tempo somar(Tempo tempo1, Tempo tempo2, Tempo tempo3){
        if((tempo1.segundo + tempo2.segundo) < 60){
            tempo3.segundo = tempo1.segundo + tempo2.segundo;
        }
        else{
            tempo3.minuto++;
            tempo3.segundo = (tempo1.segundo + tempo2.segundo) - 60;
        }
        
        if((tempo1.minuto + tempo2.minuto) < 60){
            tempo3.minuto += tempo1.minuto + tempo2.minuto;
        }
        else{
            tempo3.hora++;
            tempo3.minuto += (tempo1.minuto + tempo2.minuto) - 60;
        }
        
        tempo3.hora += tempo1.hora + tempo2.hora;
        return tempo3;
    }
}
