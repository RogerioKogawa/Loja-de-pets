package Produtos;

public abstract class Produto {
    String tipoProduto;
    int valor;

    public abstract String descricaoProduto();

    public int getValor(){
        return this.valor;
    }

    public String getTipoProduto(){
        return this.tipoProduto;
    }
}
