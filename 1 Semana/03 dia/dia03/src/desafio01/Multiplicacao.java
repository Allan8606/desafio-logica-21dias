package desafio01;

public class Multiplicacao {

    public static void main(String[] args) {
        //Vamos supor que voce tenha 2 produtos e que queira comprar 2 unidades de cada. Faça a multiplicação para encontrar o total.
        double produto1 = 20.65;
        double produto2 = 75.65;
        double total = produto1 * 2 + produto2 * 2; //Pode ser assim também: (produto1 + produto2) * 2
        System.out.println(total);

        //Calcule a area de um retangulo.
        int comprimento = 50;
        int largura = 40;
        int area = (comprimento * largura);
        System.out.println(area);


        //Crie 2 váraveis que contêm o total de horas trabalhadas e o valor por hora. Calcule o total a receber depois de trabalhar 160 horas.
        double horasTrabalhadas = 160;
        double valorPorHora = 50.45;
        double pagamento = horasTrabalhadas * valorPorHora;
        System.out.println(pagamento);


    }


}
