import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<String> listaDeCompras = new ArrayList<>();
        listaDeCompras.add("leite");
        listaDeCompras.add("papel higienico");
        listaDeCompras.add("sabonete");
        listaDeCompras.add("arroz");
        listaDeCompras.add("macarrao");
        listaDeCompras.add("arroz");

        var palavraParaPesquisa = "arroz";
        verificaSeExisteNaLista(listaDeCompras, palavraParaPesquisa);

        var retornoDaPrimeiraOcorrencia = verificaPrimeiraOcorrencia(listaDeCompras, palavraParaPesquisa);
        System.out.println("A primeira ocorrencia da palavra " + palavraParaPesquisa + " esta na posicao: " + retornoDaPrimeiraOcorrencia);
        verificaUltimaOcorrencia(listaDeCompras, palavraParaPesquisa);


    }
    //Verifica se determonada palavra existe na lista. É o mesmo do include
    public static void verificaSeExisteNaLista(List<String> palavras, String palavra) {
        boolean pesquisa = palavras.contains(palavra);
        if (pesquisa){
            System.out.println("O item: " + palavra + ", está sim dentro da sua lita.");
        }else{
            System.out.println("O item: " + palavra + ", não está dentro da sua lita.");
        }
    }

    //Pesquisa a primeira ocorrencia
    public static int verificaPrimeiraOcorrencia(List<String> palavras, String palavra){
        int pesquisa = palavras.indexOf(palavra);
        return pesquisa;
    }

    //pesquisa a ultima ocorrencia
    public static void verificaUltimaOcorrencia (List<String> palavras, String palavra){
        int pesquisa = palavras.lastIndexOf(palavra);
        int pesquisa2 = palavras.indexOf(palavra);




        if (pesquisa != pesquisa2){
            System.out.println("O item: " + palavra + " aparece mais de uma vez na sua lista.");
            System.out.println("E a ultima vez que ela aparece vai ser na posição: " + pesquisa);
        }else {
            System.out.println("A palavra: " + palavra + " aparece apenas uma vez na sua lista.");
        }
    }



}