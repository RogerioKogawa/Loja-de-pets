package main.java;

import main.java.DAO.ProdutoVendidoDAO;
import main.java.Produtos.Cachorro.RacaoCachorroBasica;
import main.java.Produtos.Produto;
import main.java.util.ConnectionFactory;

import java.sql.Connection;
import java.sql.SQLException;

public class Main{
    public static void main(String[] args) throws SQLException{
       Produto produto = new RacaoCachorroBasica();
        ProdutoVendidoDAO.salvar(produto);
    }
}