package Produtos.Gato;

import Produtos.Produto;

public class RacaoGatoBasica extends Produto {

    public RacaoGatoBasica(){
        this.preco = 5;
    }
    @Override
    public String descricaoProduto(){
        return "Ração para gato básica";
    }
}
