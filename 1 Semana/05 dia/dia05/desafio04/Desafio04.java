package desafio04;

public class Desafio04 {
    public static void main(String[] args) {
        calculoParcelado(1000, 5);

    }


    public static void calculoParcelado(double valorCompra, int quantidadeParcelas){
        double valorRestante = 0;
        int parcelas = 1;
        double valorParcela = valorCompra / quantidadeParcelas;

        while (parcelas <= quantidadeParcelas){
            System.out.println("Parcela " + parcelas + ": R$" + valorParcela );
            System.out.println("------------------------------");

            valorRestante = valorCompra - valorParcela;
            valorCompra = valorRestante;

            System.out.println("Valor restante: R$" + valorRestante);
            parcelas++;


        }

    }
}
