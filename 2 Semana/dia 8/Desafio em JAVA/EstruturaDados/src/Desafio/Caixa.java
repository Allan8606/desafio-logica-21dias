package Desafio;

public class Caixa {


    int numeroDeClientesNaFila;


    public  void clientesSendoAtendidos( int numeroDeClientesNaFila){
        this.numeroDeClientesNaFila = numeroDeClientesNaFila;
        for (int i = 1; i <= numeroDeClientesNaFila; i++){
            System.out.println("Cliente " + i + " está sendo atendido...");
            System.out.println("Cliente " + i + " foi atendido.");


            if (i == numeroDeClientesNaFila){
                System.out.println("Esse foi o ultimo cliente para ser atendido");
                System.out.println("--------------------------------");
            }else {
                System.out.println("Próximo cliente");
                System.out.println("--------------------------------");
            }
        }
    }






}
