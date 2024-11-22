
package com.mycompany.exemplocliente;

public class ExemploCliente {

    public static void main(String[] args) {
        Endereco e1 = new Endereco("Margarida", "Jardins", 111);
        
        Cliente c1 = new Cliente("Roberta", e1);
        
        Item i1 = new Item("Sabonete", 4.0f);
        Item i2 = new Item("Creme Dental", 12.0f);
        Item i3 = new Item("Desodorante", 10.0f);
        
        Pedido p1 = new Pedido(c1,i1);
        p1.adicionarItem(i2);
        p1.adicionarItem(i3);
        p1.imprimirCompra();
        
    }
}
