package Desafio;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos caixas tem em seu supermercado?");
        int quantidadeDeCaixas = scanner.nextInt();
        scanner.nextLine();
     Caixa[] caixas = new Caixa[quantidadeDeCaixas];

     for (int i = 0; i < caixas.length; i++){

         caixas[i] = new Caixa();

         System.out.println("Caixa " + (i + 1));
         System.out.println("---------");

         System.out.println("Quantos Clientes?");
         int quantidadeCliente = scanner.nextInt();
         scanner.nextLine();
         caixas[i].clientesSendoAtendidos(quantidadeCliente);

     }

     int totalDeClientes = 0;
        for (Caixa caixa : caixas) {
            totalDeClientes += caixa.numeroDeClientesNaFila;

        }

     System.out.println("Você tem um total de " + caixas.length + " caixas");
     System.out.println("E todos os tem um total " + totalDeClientes);
    }
}
