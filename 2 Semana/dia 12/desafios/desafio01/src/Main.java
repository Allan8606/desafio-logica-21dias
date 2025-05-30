import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<String> listaDeNumeros = new ArrayList<>();
        List<String> numerosAtendidos = new ArrayList<>();
        String numeroDeTelefone = "";

        Ligacao ligacao = new Ligacao(listaDeNumeros, numerosAtendidos, numeroDeTelefone);

        System.out.println("Deseja receber ligação e adicionar ela na fila de atendimento? Sim / Sair");
        String resposta = scanner.nextLine();


        while (true){


            if (resposta.equalsIgnoreCase("sim")){
                System.out.println("Qual numero está ligando?");
                numeroDeTelefone = scanner.nextLine();
                ligacao.receberLigacao(listaDeNumeros, numeroDeTelefone);
                System.out.println("Deseja atender outro número ou fazer um atendimento: Sim/Sair/Atendimento");
                resposta = scanner.nextLine();

            } else if (!resposta.equalsIgnoreCase("sim") && !resposta.equalsIgnoreCase("sair") && !resposta.equalsIgnoreCase("atendimento")) {
                System.out.println("Digite uma resposta valida: ");
                System.out.println("------------");
                System.out.println("Deseja receber ligação e adicionar ela na fila de atendimento ou fazer um " +
                        "atendimento? Sim / Sair/ Atendimento");
                resposta = scanner.nextLine();

            } else if (resposta.equalsIgnoreCase("atendimento")) {

                ligacao.retirandoNumero(listaDeNumeros);
                System.out.println("Deseja receber ligação e adicionar ela na fila de atendimento ou fazer um " +
                        "atendimento? Sim/ Sair/ Atendimento");
                resposta = scanner.nextLine();

            } else {
                System.out.println("Saindo...");
                System.out.println("A lista de número para serem atendidos: " + listaDeNumeros);
                return;
            }
        }

    }
}