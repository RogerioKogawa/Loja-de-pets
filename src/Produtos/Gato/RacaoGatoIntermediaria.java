package Produtos.Gato;

import Produtos.Produto;

public class RacaoGatoIntermediaria extends Produto {

    public RacaoGatoIntermediaria(){
        this.preco = 10;
        this.tipoProduto = descricaoProduto();
    }
    @Override
    public String descricaoProduto(){
        return "Ração para gato intermediária";
    }
}
