package desafio02;

public class Desafio02 {
    public static void main(String[] args) {
        diasDaSemana(1);
        diasDaSemana(2);
        diasDaSemana(3);
        diasDaSemana(4);
        diasDaSemana(5);
        diasDaSemana(6);
        diasDaSemana(7);
        diasDaSemana(8);


    }

    public static void diasDaSemana(int dia){

        switch (dia){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-Feira");
                break;
            case 3:
                System.out.println("Terça-Feira");
                break;
            case 4:
                System.out.println("Quarta-Feira");
                break;
            case 5:
                System.out.println("Quinta-Feira");
                break;
            case 6:
                System.out.println("Sexta-Feira");
                break;
            case 7:
                System.out.println("Sábado");
                break;

            default:
                System.out.println("Escolha um dia valido");



        }

    }
}
