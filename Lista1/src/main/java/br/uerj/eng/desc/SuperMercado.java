package br.uerj.eng.desc;

public class SuperMercado {
    public static void main(String[] args) {
        Produto p1 = new Produto("Arroz",19.90f,30);
        Produto p2 = new Produto("Nescau", 10f,20);
        
        //Criar pedido
        
        ItemPedido item1 = new ItemPedido(p1,3);
        ItemPedido item2 = new ItemPedido(p2,5);
        
        Pedido pedido = new Pedido();
        pedido.addItens(item1);
        pedido.addItens(item2);
        
        System.out.println(pedido.toString());
        
        System.out.println(pedido.getItens().get(0).getProduto().getPreco());
        
    }
}
