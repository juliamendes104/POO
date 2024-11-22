
package com.mycompany.exemplom;

public class Motorcycle {
    private int speed;
    private int gear;
    private int id;
    private int distancia = 0;
    private static int numberOfMotorcycles = 0;
    private int posicao;

    public Motorcycle(){
        numberOfMotorcycles++;
        this.id = numberOfMotorcycles + 1000;
    }
    
    public Motorcycle(int speed, int gear){
        numberOfMotorcycles++;
        this.speed = speed;
        this.gear = gear;
        this.id = numberOfMotorcycles + 1000;
        this.setDistancia();
    }
    
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public int getId() {
        return id;
    }
    
    public void speedUp(int speed){
        this.setSpeed(this.getSpeed() + speed);
        if(this.getSpeed() < 10){
            if(this.getGear()<1){
                this.setGear(1);
            }
        }
        else if(this.getSpeed() < 20){
            if(this.getGear()<2){
                this.setGear(2);
            }
        }
        else if(this.getSpeed() < 30){
            if(this.getGear()<3){
                this.setGear(3);
            }
        }
        else if(this.getSpeed() < 40){
            if(this.getGear()<4){
                this.setGear(4);
            }
        }
        else if(this.getSpeed() < 50){
            if(this.getGear()<5){
                this.setGear(5);
            }
        }
        else{
            if(this.getGear()<6){
                this.setGear(6);
            }
        }
    }
    
    public void applyBreaks(){
        this.setSpeed(0);
        this.setGear(0);
    }
    
    public void getStatus(){
        System.out.println("Moto " + this.getId() + ": Velocidade=" + this.getSpeed() + ", Marcha=" + this.getGear() + ", Distancia=" + this.getDistancia());
        
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia() {
        this.distancia += this.getSpeed() * 10;
    }

    public int getPosicao() {
        return posicao;
    }

    public void setPosicao(int posicao) {
        this.posicao = posicao;
    }
    
    
    
    
    
}
