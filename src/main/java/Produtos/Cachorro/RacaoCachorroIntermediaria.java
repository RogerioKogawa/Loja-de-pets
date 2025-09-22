package main.java.Produtos.Cachorro;
import main.java.Produtos.Produto;

public class RacaoCachorroIntermediaria extends Produto {

    public RacaoCachorroIntermediaria(){
        this.preco = 10;
        this.tipoProduto = descricaoProduto();
    }
    @Override
    public String descricaoProduto() {
        return "Ração para cachorro intermediária";
    }
}
