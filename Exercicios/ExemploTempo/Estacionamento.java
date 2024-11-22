package com.mycompany.exemplotempo;

public class Estacionamento {
    private String placa;
    private String modelo;
    private int horaSaida;
    private int horaEntrada;

    public Estacionamento(){
        this.placa = null;
        this.modelo = null;
        this.horaSaida = 0;
        this.horaEntrada = 0;
    }
    
    public Estacionamento(String placa, String modelo, int saida, int entrada){
        this.placa = placa;
        this.modelo = modelo;
        this.horaSaida = saida;
        this.horaEntrada = entrada;
    }
    
    public void imprimir(){
        System.out.println("Placa: " + this.getPlaca() + " Modelo: " + this.getModelo() + " Hora de entrada: " + this.getHoraEntrada() + " Hora de saída: " + this.getHoraSaida());       
    }
    
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getHoraSaida() {
        return horaSaida;
    }

    public void setHoraSaida(int horaSaida) {
        this.horaSaida = horaSaida;
    }

    public int getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(int horaEntrada) {
        this.horaEntrada = horaEntrada;
    }
    
    public float pagarValor(){
        float valor;
        Tempo t1 = new Tempo(this.getHoraEntrada(), 0, 0);
        Tempo t2 = new Tempo(this.getHoraSaida(),0,0);
        Tempo t3 = new Tempo();
        t3.subtrair(t2,t1);
        valor = t3.getHora() * 1.50f;
        return valor;
    }
}
