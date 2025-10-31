package desafio03;

public class Desafio03 {
    public static void main(String[] args) {
        calcularJuros(1000);

    }


    public static void calcularJuros(double investimentoInicial){
        double juros = 0.05;
        int ano = 0;
        double dobroDoInvestimento = investimentoInicial * 2;

        while (investimentoInicial <= dobroDoInvestimento){

            investimentoInicial = investimentoInicial + (investimentoInicial * juros);
            ano++;
        }

        System.out.println("Levará " + ano + " anos para dobrar o investimento inicial");



    }
}
