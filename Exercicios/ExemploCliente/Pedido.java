
package com.mycompany.exemplocliente;
import java.util.ArrayList;


public class Pedido {
    private Cliente cliente;
    private ArrayList<Item> itemLista = new ArrayList<>();

    
    public Pedido(Cliente cliente, Item item){
        this.cliente = cliente;
        this.itemLista.add(item);
    }
    
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<Item> getItemLista() {
        return itemLista;
    }

    public void setItemLista(ArrayList<Item> itemLista) {
        this.itemLista = itemLista;
    }
    
    public void adicionarItem(Item item){
        this.itemLista.add(item);
    }
    
    public void imprimirCompra(){
        float valor = 0;
        System.out.println("Cliente: " + this.getCliente().getNome() + " Bairro: " + this.getCliente().getEndereco().getBairro());
        for( Item i: itemLista){
            System.out.println("Produto: " + i.getNome() + " Preço: " + i.getPreco());
            valor += i.getPreco();
        }
        System.out.println("Valor da compra: " + valor);
    }
}
