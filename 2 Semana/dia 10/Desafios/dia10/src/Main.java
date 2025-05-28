import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tamanhoDaCaixa;

        System.out.println("Deseja criar uma caixa de itens? Sim/Não");
        String resposta = scanner.nextLine();

        if (resposta.equalsIgnoreCase("sim")) {
            System.out.println("Qual o nome da caixa?");
            String nomeCaixa = scanner.nextLine();

            System.out.println("Qual o tamanho da caixa?");
            tamanhoDaCaixa = scanner.nextInt();
            scanner.nextLine();

            Caixa caixa = new Caixa(nomeCaixa, tamanhoDaCaixa);
            List<String> lista = new ArrayList<>();
            caixa.adicionarItens(lista);

            System.out.println("Deseja tirar algum item? Sim/Não");
            caixa.retirarItens(lista);
        }

        if (resposta.equalsIgnoreCase("não") || resposta.equalsIgnoreCase("nao")) {
            System.out.println("Saindo...");
        }

        scanner.close();
    }
}
