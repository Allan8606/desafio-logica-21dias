import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tamanhoDaCaixa = -1;


        System.out.println("Deseja Criar Uma Caixa de Itens? Sim/Não");
        String resposta = scanner.nextLine();

        if (resposta.equalsIgnoreCase("sim")) {
            System.out.println("Qual o nome da caixa?");
            String nomeCaixa = scanner.nextLine();
            System.out.println("Qual o tamanho da caixa?");
            tamanhoDaCaixa = scanner.nextInt();
            scanner.nextLine();

            Caixa caixa = new Caixa(nomeCaixa, tamanhoDaCaixa);
            List<String> lista = new ArrayList<>();
            caixa.adicionandoItens(lista);

            System.out.println("Deseja tirar algum item?");
            caixa.retirandoItens(lista, resposta);


        }
        if (resposta.equalsIgnoreCase("não") || resposta.equalsIgnoreCase("nao")){
            System.out.println("Saindo...");
        }





    }
}