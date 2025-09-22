package main.java.Produtos;

public class Petisco extends Produto {
    public Petisco(){
        this.preco = 7;
        this.tipoProduto = descricaoProduto();
    }
    @Override
    public String descricaoProduto(){
        return "Petisco";
    }
}
