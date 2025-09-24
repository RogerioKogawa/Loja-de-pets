package main.java;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Cliente cliente = new Cliente();
        int opcao = 1;
        /*
        while(opcao != 0) {
            Menu.visualizarMenu();
            opcao = Integer.parseInt(input.nextLine());
            Menu.OpcaoEscolhida(opcao, cliente);
        }

         */
        GeradorRegistros.alimentarBancoDados(100);
    }
}