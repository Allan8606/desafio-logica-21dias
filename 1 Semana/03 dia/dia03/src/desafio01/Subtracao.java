package desafio01;

public class Subtracao {
    public static void main(String[] args) {
        //Imagine que voce tem algumas váriaveis com compras no cartão de crédito, e uma com um valor a ser estornado de uma compra errada, calcule o total da fatura do cartão.
        double compra1 = 150.55;
        double compra2 = 180.75;
        double compra3 = 250.55;
        double comprasExtornadas =  compra2;

        double faturCartao = (compra1 + compra2 +compra3) - comprasExtornadas;
        System.out.println(faturCartao);


        //Calcule a sua idade a partir de dua váriaveis contendo o ano de nascimento e o ano atual.
        int anoAtual = 2025;
        int anoNascimento = 1993;
        int idade = anoAtual - anoNascimento;
        System.out.println(idade);

        //Imagine que em um jogo você teha um total de moedas e para cada vez que você compra um artefato você gasta um determinado númeo de moedas. Calcule a quantidade de moedas final.
        int moedas = 100;
        int artefato = 12;
        int quantidadeArtefatos = 3;
        int moedasFinal = moedas - (artefato * quantidadeArtefatos);
        System.out.println(moedasFinal);






    }
}
