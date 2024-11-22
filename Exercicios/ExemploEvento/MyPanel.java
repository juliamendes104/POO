
package com.mycompany.exemploevento;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

class MyPanel extends JPanel implements ActionListener{

    private JButton yellowButton = new JButton("Yellow");
    private JButton redButton = new JButton("Red");
    private JButton blueButton = new JButton("Blue");
    private JPasswordField texto = new JPasswordField(20);
    
    public MyPanel(){
        this.add(yellowButton);
        this.add(redButton);
        this.add(blueButton);
        this.add(texto);
        
        yellowButton.addActionListener(this);
        redButton.addActionListener(this);
        blueButton.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        
        if(source==yellowButton){
            System.out.println(texto.getText());
        }
        else if(source==redButton){
            setBackground(Color.RED);
        }
        else if(source==blueButton){
            setBackground(Color.BLUE);
        }
    }
    
}
