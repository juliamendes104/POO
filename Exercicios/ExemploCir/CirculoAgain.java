package com.mycompany.exemplocir;

public class CirculoAgain {
    private int raio;
    
    public float calculaArea(int raio){
        return raio * raio * 3.14f;
    }
    
    public float calculaArea(float diametro){
        return (diametro * diametro)/4 * 3.14f;
    }
}
