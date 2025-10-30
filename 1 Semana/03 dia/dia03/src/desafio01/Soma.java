package desafio01;

public class Soma {
    public static void main(String[] args) {
        //Adicione uma nova pontuação a um total de pontos existente em um jogo fictício.
        int totalDePontos =  50;
        int novosPontos = 20;

        int pontosAtualizado = totalDePontos + novosPontos;
        System.out.println(pontosAtualizado);


        //Para cada dia da semana defina a quantidade de horas trabalhadas e some o total.
        double segunda = 5;
        double terca = 5.5;
        double quarta = 7;
        double quinta = 7.2;
        double sexta = 8;
        double sabado = 6;

        double totalHoras = segunda + terca + quarta + quinta + sexta + sabado;
        System.out.println(totalHoras);

        //Imagine que sua casa 3 pessoas ganham salários diferentes, some eles para saber o ganho toal
        double salario1 = 800;
        double salario2 = 1550;
        double salario3 = 1250.75;
        double ganhoTotal = salario1 + salario2 + salario3;
        System.out.println(ganhoTotal);
    }
}
