public class App {
    public static void main(String[] args) throws Exception {
        calcularIMC(1.79, 80);

    }

    public static void calcularIMC(double altura, double peso){

        double imc = peso / (altura * altura);

        if (imc < 18.5) {
            System.out.println("Abaixo do peso");
        }else if (imc >= 18.5 && imc <=24.99) {
            System.out.println("Peso Normal");
        }else if (imc >= 25 && imc <=29.99) {
            System.out.println("Sobrepeso");
        }else if (imc >= 30 && imc <=34.99) {
            System.out.println("Obesidade grau I");
        }else if (imc >= 35 && imc <=39.99) {
            System.out.println("Obesidade grau II");
        }else{
            System.out.println("Obesidade grau III");
        }

  

    }
}
