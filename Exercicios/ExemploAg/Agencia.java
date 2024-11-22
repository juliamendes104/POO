
package com.mycompany.exemploag;
import java.util.ArrayList;

public class Agencia {
    private String nome;
    private int numAgencia;
    private int numBanco;
    private ArrayList<Conta> contaLista = new ArrayList<>();
    private static int contador = 0;

    public Agencia(String nome, Conta conta){
        contador++;
        this.nome = nome;
        contaLista.add(conta);
        this.numAgencia = conta.getNumeroAgencia();
        this.numBanco = contador;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumAgencia() {
        return numAgencia;
    }

    public void setNumAgencia(int numAgencia) {
        this.numAgencia = numAgencia;
    }

    public int getNumBanco() {
        return numBanco;
    }

    public void setNumBanco(int numBanco) {
        this.numBanco = numBanco;
    }

    public ArrayList<Conta> getConta() {
        return contaLista;
    }

    public void setConta(ArrayList<Conta> Conta) {
        this.contaLista = Conta;
    }
    
    public void inserirConta(Conta conta){
        if(conta.getNumeroAgencia() == this.getNumAgencia()){
            contaLista.add(conta);
            System.out.println("Nova conta inserida");
        }
        else{
            System.out.println("Conta de outra agência.");
        }
    }
    
    public void buscarConta(int numConta, String senha){
        int encontrada = 0;
        for(Conta item : contaLista ){
            if(item.getNumeroConta() == numConta && item.getSenha().equals(senha)){
                System.out.println("Conta encontrada.");
                encontrada = 1;
            }
        }
        if(encontrada == 0){
            System.out.println("Conta não encontrada.");
        }
    }
    
}
