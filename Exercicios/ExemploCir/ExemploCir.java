package com.mycompany.exemplocir;

public class ExemploCir {

    public static void main(String[] args) {
        CirculoAgain c1 = new CirculoAgain();
        
        double area = c1.calculaArea(4);
        double area2 = c1.calculaArea(8.0f);
        System.out.println("Area: " + area + " " + area2);
    }
}
