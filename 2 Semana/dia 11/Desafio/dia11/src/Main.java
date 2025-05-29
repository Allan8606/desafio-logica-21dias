import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Pagina pagina = new Pagina();
        List<Integer> paginas = new ArrayList<>();

        paginas.add(1);


        System.out.println("Página 1");
        System.out.println("O que desja? Avançar/Voltar/Sair");
        String resposta = scanner.nextLine();

        while (true) {

            if (!resposta.equalsIgnoreCase("avançar") && !resposta.equalsIgnoreCase("voltar") && !resposta.equalsIgnoreCase("sair")) {
                System.out.println("Digite uma opção valida");
                System.out.println("---------");
                System.out.println("O que desja? Avançar/Voltar/Sair");
                resposta = scanner.nextLine();
            }

            if (resposta.equalsIgnoreCase("sair")){
                System.out.println("Saindo...");
                System.exit(0);
            }

            while (resposta.equalsIgnoreCase("avançar")) {
                pagina.avancar(paginas);
                System.out.println("O que desja? Avançar/Voltar/Sair");
                resposta = scanner.nextLine();
            }

            while (resposta.equalsIgnoreCase("voltar")) {
                pagina.voltar(paginas);
                System.out.println("O que desja? Avançar/Voltar/Sair");
                resposta = scanner.nextLine();
            }
        }
    }
}