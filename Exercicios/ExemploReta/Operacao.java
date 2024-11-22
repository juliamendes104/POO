
package com.mycompany.exemploreta;

public class Operacao {
    public void mudarRetangulo(Retangulo re, int b, int a){
        re.setB(re.getB() + b);
        re.setA(re.getA() + a);
        re = null;
        re = new Retangulo(1,2);
        re.setA(4);
        re.setB(0);
    }
}
