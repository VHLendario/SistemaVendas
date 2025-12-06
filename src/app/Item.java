package app;

public class Item {
    private int quantidade; // corrigido para int
    private Produto produto;

    public Item(int quantidade, Produto produto) {
        this.quantidade = quantidade;
        this.produto = produto;
    }

    //getter
    public int getQuantidade () {
        return quantidade;
    }
    public Produto getProduto () {
        return produto;
    }

    //setter
    public void setQuantidade (int quantidade) {
        this.quantidade = quantidade;
    }
    public void setProduto (Produto produto) {
        this.produto = produto;
    }

    //retorna o preço pela quantidade
    public double subTotal () {
        return quantidade * produto.getPrecoUnitario();
    }
}
