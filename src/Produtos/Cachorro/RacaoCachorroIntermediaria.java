package Produtos.Cachorro;
import Produtos.*;

public class RacaoCachorroIntermediaria extends Produto{

    public RacaoCachorroIntermediaria(){
        this.preco = 10;
    }
    @Override
    public String descricaoProduto() {
        return "Ração para cachorro intermediária";
    }
}
