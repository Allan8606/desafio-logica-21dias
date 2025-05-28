import java.util.List;
import java.util.Scanner;

public class Caixa {
    String nomeCaixa;
    int tamanhoCaixa;
    Scanner scanner = new Scanner(System.in);

    public Caixa(String nomeCaixa, int tamanhoCaixa) {
        this.nomeCaixa = nomeCaixa;
        this.tamanhoCaixa = tamanhoCaixa;
    }

    public void adicionarItens(List<String> listaDeItens) {
        for (int i = 0; i < tamanhoCaixa; i++) {
            System.out.println("Qual o nome do item?");
            String nomeItem = scanner.nextLine();
            listaDeItens.add(nomeItem);

            if ((i + 1) == tamanhoCaixa) {
                System.out.println("Limite máximo da caixa atingido");
                System.out.println("---------------------------------");
            }
        }

        System.out.println("- A sua caixa de nome: " + nomeCaixa);
        System.out.println("- Está com " + tamanhoCaixa + " itens");
        System.out.println("- Lista de itens: " + listaDeItens);
    }

    public void retirarItens(List<String> listaDeItens) {
        String resposta = scanner.nextLine();

        while (resposta.equalsIgnoreCase("sim")) {
            if (!listaDeItens.isEmpty()) {
                String ultimoItem = listaDeItens.remove(listaDeItens.size() - 1);
                System.out.println("O item \"" + ultimoItem + "\" foi removido.");
                System.out.println("Sua lista de itens atual: " + listaDeItens);

                System.out.println("Deseja remover outro item? Sim/Não");
                resposta = scanner.nextLine();
            } else {
                System.out.println("Sua lista de itens está vazia.");
                System.out.println("Saindo...");
                return;
            }
        }

        if (resposta.equalsIgnoreCase("não") || resposta.equalsIgnoreCase("nao")) {
            System.out.println("Saindo...");
        }
    }
}
