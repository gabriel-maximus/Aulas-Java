package br.uerj.eng.desc;

public class ItemPedido {
    private Produto produto;
    private int quatidade;

    @Override
    public String toString() {
        return "ItemPedido{" + "produto=" + produto.getNome() + ", quatidade=" + quatidade + '}';
    }

    public ItemPedido(Produto produto, int quatidade) {
        this.produto = produto;
        this.quatidade = quatidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuatidade() {
        return quatidade;
    }

    public void setQuatidade(int quatidade) {
        this.quatidade = quatidade;
    }
    
    
}
