
package com.mycompany.exemploreta;

public class ExemploReta {

    public static void main(String[] args) {
        Retangulo re = new Retangulo(3,5);
        Operacao op = new Operacao();
        op.mudarRetangulo(re, 1, 4);
            System.out.println(re.getA() + " " + re.getB());
    }
}
