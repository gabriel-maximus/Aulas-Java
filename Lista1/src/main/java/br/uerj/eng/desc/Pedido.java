package br.uerj.eng.desc;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<ItemPedido> itens = new ArrayList<>();
    private String metodoPagamento;

    public Pedido(List<ItemPedido> itens, String metodoPagamento) {
        this.itens = itens;
        this.metodoPagamento = metodoPagamento;
    }
    public Pedido(){
    }

    @Override
    public String toString() {
        return "Pedido{" + "itens=" + this.printaItens() + ", metodoPagamento=" + metodoPagamento + '}';
    }

    public List<ItemPedido> getItens() {
        return itens;
    }

    public void setItens(List<ItemPedido> itens) {
        this.itens = itens;
    }

    public String getMetodoPagamento() {
        return metodoPagamento;
    }

    public void setMetodoPagamento(String metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }
    
    public void addItens(ItemPedido item){
        this.itens.add(item);
    }
    
    private String printaItens(){
        StringBuilder resposta = new StringBuilder();
        for(ItemPedido item:this.itens){
            resposta.append(item.toString());
        }
        return resposta.toString();
    }
}
