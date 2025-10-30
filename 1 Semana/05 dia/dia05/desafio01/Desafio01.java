package desafio01;

public class Desafio01 {

    public static void main(String[] args) {
        rendimentoAplicacao(1000, 10);

    }

    public static void rendimentoAplicacao(double valor, int quantidadeAnos){
        double taxaJuros = 0.12;

        for (int ano = 1; ano <= quantidadeAnos; ano ++){
            valor += (valor * taxaJuros);
            System.out.println("Ano " + ano +": " + String.format("%.2f", valor));
        }


    }
}
