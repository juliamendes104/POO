

package com.mycompany.exemplocr;

public class ExemploCR {

    public static void main(String[] args) {
        ControleRemoto c = new ControleRemoto();
        c.ligar();
        //c.setLigado(true);
        c.maisVolume();
        c.play();
        c.pause();
        c.abrirMenu();
        c.fecharMenu();
    }
}
