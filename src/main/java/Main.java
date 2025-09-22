package main.java;

import main.java.util.ConnectionFactory;

import java.sql.Connection;
import java.sql.SQLException;

public class Main{
    public static void main(String[] args) throws SQLException{
        try(Connection conn = ConnectionFactory.getConnection()){
            System.out.println(conn.toString());
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
}