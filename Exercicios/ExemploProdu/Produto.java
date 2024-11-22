
package com.mycompany.exemploprodu;

public interface Produto {
    public abstract String getNome();
    public abstract double getPreco();
    public abstract int getQuantidade();
    public abstract void setQuantidade(int quantidade);
    public abstract String getId();
    public abstract void setPreco(double valor);
}
