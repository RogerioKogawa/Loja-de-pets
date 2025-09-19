package Produtos.Gato;

import Produtos.Produto;

public class RacaoGatoBasica extends Produto {

    public RacaoGatoBasica(){
        this.preco = 5;
        this.tipoProduto = descricaoProduto();
    }
    @Override
    public String descricaoProduto(){
        return "Ração para gato básica";
    }
}
