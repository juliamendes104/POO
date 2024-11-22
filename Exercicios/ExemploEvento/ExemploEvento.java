
package com.mycompany.exemploevento;

import javax.swing.JFrame;

public class ExemploEvento {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        MyPanel panel = new MyPanel();
        frame.add(panel);
        
        frame.setSize(250,150);
        frame.setVisible(true);
    }
}
