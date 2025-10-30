package desafio03;

public class Desafio03 {
    public static void main(String[] args) {

        double peso = 80.8;
        double altura = 1.79;
        double imc = peso / (altura * 2);

        if (imc < 18.5){
            System.out.println("Abaixo do peso");
        } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("Peso Normal");
        }else if (imc >= 25 && imc <= 29.9){
            System.out.println("Sobrepeso");
        }else {
            System.out.println("Obesidade");
        }


    }
}
