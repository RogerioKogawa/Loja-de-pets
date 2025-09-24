package main.java;

import java.util.Random;

public class GeradorRegistros {
    public static void alimentarBancoDados(int numeroRegistros){
        for(int i = 0; i < numeroRegistros; i ++){
            Cliente cliente = new Cliente();
            Menu.OpcaoEscolhida(gerarNumeroAleatorio(1,6), cliente);
            Menu.OpcaoEscolhida(8, cliente);
        }
    }
    private static int gerarNumeroAleatorio(int min, int max){
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }

}


