package main.java;

import main.java.DAO.ProdutoVendidoDAO;
import main.java.Produtos.Produto;

import java.util.*;

public class CarrinhoCompras {
    private List<Produto> produtos = new ArrayList<>();

    public void adicionarItem(Produto produto){
        produtos.add(produto);
        System.out.println("Produto adicionado ao carrinho");
    }

    public boolean removerItemPorNumero(int numero) {
        try {
            produtos.remove(numero - 1);
            System.out.println("Produto removido");
            return true;
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Produto não encontrado");
            return false;
        }
    }


    public boolean removerItemPorNome(String nomeProduto){
        return produtos.removeIf(produto -> produto.getTipoProduto().equals(nomeProduto));
    }

    public String verItens(){
        StringBuilder listaItens = new StringBuilder();
        for(int i  = 0; i < produtos.size(); i++){
            listaItens.append(i + 1)
                      .append(" ")
                      .append(produtos.get(i).descricaoProduto())
                      .append("\n");
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

    public void salvarBancoDados(){
        for(var produto: produtos){
            ProdutoVendidoDAO.salvar(produto);
        }
    }

}
