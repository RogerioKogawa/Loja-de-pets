package Produtos;

public abstract class Produto {
    protected String tipoProduto;
    protected int preco;

    public abstract String descricaoProduto();

    public int getPreco(){
        return this.preco;
    }

    public String getTipoProduto(){
        return this.tipoProduto;
    }
}
