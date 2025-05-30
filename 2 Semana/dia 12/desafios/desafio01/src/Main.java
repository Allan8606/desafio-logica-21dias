import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<String> listaDeNumeros = new ArrayList<>();
        List<String> numerosAtendidos = new ArrayList<>();
        Ligacao ligacao = new Ligacao();

        System.out.println("Deseja receber ligaça e adicionar ela na fila de atendimento? sim/não");
        String resposta = scanner.nextLine();
        String numeroDeTelefone ;

        while (true){


            if (resposta.equalsIgnoreCase("sim")){
                System.out.println("Qual numero está ligando?");
                numeroDeTelefone = scanner.nextLine();
                ligacao.receberLigacao(listaDeNumeros, numeroDeTelefone);
                System.out.println("Deseja atender outro número ou fazer um atendimento: Sim/Não/Atendimento");
                resposta = scanner.nextLine();

            } else if (resposta.equalsIgnoreCase("sim") || resposta.equalsIgnoreCase("nao") || resposta.equalsIgnoreCase("não") || resposta.equalsIgnoreCase("atendimento")) {
                System.out.println("Digite uma resposta valida: ");
                System.out.println("------------");
                System.out.println("Deseja receber ligação e adicionar ela na fila de atendimento ou fazer um atendimento? Sim/Não/Atendimento");
                resposta = scanner.nextLine();
            } else if (resposta.equalsIgnoreCase("atendimento")) {
                ligacao.retirandoNumero(listaDeNumeros);

            } else {
                System.out.println("Saindo...");
                System.out.println("A lista de número para serem atendidos: " + listaDeNumeros);
                return;
            }
        }

    }
}