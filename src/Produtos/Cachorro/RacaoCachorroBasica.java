package Produtos.Cachorro;
import Produtos.*;

public class RacaoCachorroBasica extends Produto{
    public RacaoCachorroBasica(){
        this.preco = 5;
        this.tipoProduto = descricaoProduto();
    }
    @Override
    public String descricaoProduto() {
        return "Ração para cachorro básica";
    }
}
