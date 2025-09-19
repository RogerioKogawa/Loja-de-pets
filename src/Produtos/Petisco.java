package Produtos;
import Produtos.Produto;
public class Petisco extends Produto{
    int valor = 7;
    @Override
    public String descricaoProduto(){
        return "Petisco";
    }
}
