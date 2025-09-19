package Produtos.Gato;

import Produtos.Produto;

public class RacaoGatoIntermediaria extends Produto {

    public RacaoGatoIntermediaria(){
        this.preco = 10;
    }
    @Override
    public String descricaoProduto(){
        return "Ração para gato intermediária";
    }
}
