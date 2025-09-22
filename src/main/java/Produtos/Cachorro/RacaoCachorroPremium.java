package main.java.Produtos.Cachorro;
import main.java.Produtos.Produto;

public class RacaoCachorroPremium extends Produto {

    public RacaoCachorroPremium(){
        this.preco = 15;
        this.tipoProduto = descricaoProduto();
    }
    @Override
    public String descricaoProduto() {
        return "Ração para cachorro premium";
    }
}
