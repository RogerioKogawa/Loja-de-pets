package main.java.Produtos.Cachorro;
import main.java.Produtos.Produto;

public class RacaoCachorroBasica extends Produto {
    public RacaoCachorroBasica(){
        this.preco = 5;
        this.tipoProduto = descricaoProduto();
    }
    @Override
    public String descricaoProduto() {
        return "Ração para cachorro básica";
    }
}
