
package com.mycompany.pessoa;


public class Pessoa1 {
    private String name;
    private int idade;
    
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public int getIdade(){
        return this.idade;
    }
    public void status(){
        System.out.println("Nome:" + this.name);
        System.out.println("Idade:" + this.idade);
    }
}
