package desafio04;

public class Desafio04 {
    public static void main(String[] args) {


        calculoViagem(250, 5.99);





    }

    public static void calculoViagem(double distanciaViagem, double precoGasolina){
        double quantidadeLitrosNecessarios = distanciaViagem / 12;
        double totalGasto = quantidadeLitrosNecessarios * precoGasolina;

        System.out.println("Vão ser necessários " + quantidadeLitrosNecessarios + " litros de gasolina para essa viagem");
        System.out.println("Nessa viagem você vi gastar R$" + totalGasto );

    }
}
