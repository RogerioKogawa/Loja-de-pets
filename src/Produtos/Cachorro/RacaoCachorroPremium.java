package Produtos.Cachorro;
import Produtos.Produto;

public class RacaoCachorroPremium extends Produto {

    public RacaoCachorroPremium(){
        this.preco = 15;
    }
    @Override
    public String descricaoProduto() {
        return "Ração para cachorro premium";
    }
}
