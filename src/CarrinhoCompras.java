import java.util.*;
import Produtos.Produto;
public class CarrinhoCompras {
    List<Produto> produtos = new ArrayList<>();

    public void adicionarItem(Produto produto){
        produtos.add(produto);
    }

    public boolean removerItemPorNumero(int numero) {
        try {
            produtos.remove(numero - 1);
            return true; // deu certo
        } catch (IndexOutOfBoundsException e) {
            return false; // número inválido
        }
    }


    public boolean removerItemPorNome(String nomeProduto){
        return produtos.removeIf(produto -> produto.getTipoProduto().equals(nomeProduto));
    }

    public String verItens(){
        StringBuilder listaItens = new StringBuilder();
        for(int i  = 0; i < produtos.size(); i++){
            listaItens.append(i + " ")
                      .append(produtos.get(i))
                      .append("/n");
        }
        return listaItens.toString();
    }

    private int CalcularPrecoTotal(){
        int precoFinal = 0;
        for(var produto: produtos){
            precoFinal += produto.getPreco();
        }
        return precoFinal;
    }

    public int getValorFinal(){
        return CalcularPrecoTotal();
    }

}
