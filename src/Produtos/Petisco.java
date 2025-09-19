package Produtos;
import Produtos.Produto;
public class Petisco extends Produto{
    public Petisco(){
        this.preco = 7;
    }
    @Override
    public String descricaoProduto(){
        return "Petisco";
    }
}
