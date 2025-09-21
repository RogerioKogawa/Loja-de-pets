import Produtos.Cachorro.*;
import Produtos.Gato.*;
import Produtos.Produto;

import java.util.Scanner;

public class Menu {
    private static Scanner input = new Scanner(System.in);
    public static void visualizarMenu(){
        System.out.println("Escolha uma das opções: ");
        System.out.println("1 - Ração para cachorro premium");
        System.out.println("2 - Ração para cachorro intermediária");
        System.out.println("3 - Ração para cachorro básica");
        System.out.println("4 - Ração para gato premium");
        System.out.println("5 - Ração para gato intermediária");
        System.out.println("6 - Ração para gato básica");
        System.out.println("7 - Visualizar itens no carrinho");
        System.out.println("8 - Finalizar compra");
        System.out.println("9 - Remover item por nome");
        System.out.println("10 - Remover item por numero");
    }
    public static void OpcaoEscolhida(int opcao, Cliente cliente){
        Produto produto = null;
        switch(opcao){
            case 1 -> produto = new RacaoCachorroPremium();
            case 2 -> produto = new RacaoCachorroIntermediaria();
            case 3 -> produto = new RacaoCachorroBasica();
            case 4 -> produto = new RacaoGatoPremium();
            case 5 -> produto = new RacaoGatoIntermediaria();
            case 6 -> produto = new RacaoGatoBasica();
            case 7 -> cliente.verItensCarrinho();
            //case 8 -> banco de dados e calcular valor final;
            case 8 -> cliente.finalizarCompra();
            case 9 -> {
                System.out.println("Digite o nome do item");
                String nomeProduto = input.nextLine();
                cliente.removerItemCarrinhoPorNome(nomeProduto);
            }
            case 10 -> {
                System.out.println("Digite o número do produto");
                int numeroProduto = Integer.parseInt(input.nextLine());
                cliente.removerItemCarrinhoPorNumero(numeroProduto);
            }
        }
        if(produto != null){
            cliente.adicionarItemCarrinho(produto);

        }
    }
}
