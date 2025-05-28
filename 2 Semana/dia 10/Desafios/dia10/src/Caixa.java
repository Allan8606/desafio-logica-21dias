import java.util.ArrayList;
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



    public void adicionandoItens(List listaDeItens){
        for (int i = 0; i < tamanhoCaixa; i++) {
            String nomeItem;
            if(i <= tamanhoCaixa){
                System.out.println("Qual o nome do item?");
                nomeItem = scanner.nextLine();
                listaDeItens.add(nomeItem);
            }
            if ((i+1) == tamanhoCaixa){
                System.out.println("Limite máximo da caixa atingido");
            }
        }
        System.out.println("A sua caixa de nome " + nomeCaixa);
        System.out.println("E está com tamanho de " + tamanhoCaixa + " itens");
        System.out.println("Sua lista de itens: " + listaDeItens);

    }

    public void retirandoItens(List listaDeItens,String resposta) {
        if (resposta.equalsIgnoreCase("sim")) {
            System.out.println("Qual o nome da caixa?");
            String nomeCaixa = scanner.nextLine();
            System.out.println("Qual o tamanho da caixa?");
        }
        if (resposta.equalsIgnoreCase("não") || resposta.equalsIgnoreCase("nao")){
            System.out.println("Saindo...");
            System.exit(0);
        }

    }


}
