package Produtos.Gato;

import Produtos.Produto;

public class RacaoGatoPremium extends Produto {

    public RacaoGatoPremium(){
        this.preco = 15;
        this.tipoProduto = descricaoProduto();
    }

    @Override
    public String descricaoProduto(){
        return "Ração para gato premium";
    }
}
