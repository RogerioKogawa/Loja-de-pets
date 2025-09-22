package main.java.DAO;
import main.java.Produtos.Produto;
import main.java.util.ConnectionFactory;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class ProdutoVendidoDAO {
    public static void salvar(Produto produto){
        String sql = String.format("INSERT INTO `produtos_vendidos`.`produtos` (`tipo_produto`, `preco`) VALUES ('%s', '%d');", produto.getTipoProduto(), produto.getPreco());
        try(Connection conn = ConnectionFactory.getConnection();
            Statement stmt = conn.createStatement()){
            int rowsAffected = stmt.executeUpdate(sql);
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
