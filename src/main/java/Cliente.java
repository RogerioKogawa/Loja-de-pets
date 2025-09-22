package main.java;

import main.java.Produtos.Produto;

public class Cliente {
    private String nome;
    private CarrinhoCompras carrinhoCompras = new CarrinhoCompras();

    public void verItensCarrinho(){
        System.out.println(carrinhoCompras.verItens());
    }

    public void adicionarItemCarrinho(Produto produto){
        carrinhoCompras.adicionarItem(produto);
    }

    public void removerItemCarrinhoPorNome(String nome){
        if(carrinhoCompras.removerItemPorNome(nome)){
            System.out.println("Item removido.");
        }else{
            System.out.println("Item não encontrado");
        }
    }

    public void removerItemCarrinhoPorNumero(int numero){
        carrinhoCompras.removerItemPorNumero(numero);
    }

    public void finalizarCompra(){
        System.out.printf("Total a pagar %d\n", carrinhoCompras.getValorFinal());
    }
}
