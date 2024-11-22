
package com.mycompany.aplicativo;

public class Aplicativo {

    public static void main(String[] args) {
        Calculator c = new Calculator();
        try{
            System.out.println(c.calcular(5.0, 7, '#'));
        } catch(ArithmeticException e){
            System.err.println(e.getMessage());
            //e.printStackTrace();
            
        } catch(InvalidOperationException e){
            System.err.println(e.getMessage());
        }
        
    }
}
