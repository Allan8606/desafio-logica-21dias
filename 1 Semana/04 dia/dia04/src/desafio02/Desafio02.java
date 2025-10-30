package desafio02;

public class Desafio02 {
    public static void main(String[] args) {
//        Crie um algoritmo que precisa dizer para um aluno como foi sua performance em uma prova a partir da nota que ele tirou.
//        As regras são:
    //        Se a nota for menor que 5, então mostre que foi "Insuficiente";
    //        Se foi menor que 6, então mostre "Regular";
    //        Se foi menor que 7.5, mostre "Bom"
    //        Se foi menor que 9, "Muito bom";
//        E finalmente se for maior ou igual a 9, mostre "Excelente".

        calculoNota(4);
        calculoNota(5);
        calculoNota(6);
        calculoNota(8);
        calculoNota(8.9);
        calculoNota(10);

    }

    public static void calculoNota(double nota){
        if(nota < 5){
            System.out.println("Insuficiente");
        } else if (nota >= 5 && nota < 6) {
            System.out.println("Regular");
        } else if (nota >= 6 && nota < 7.5) {
            System.out.println("Bom");
        } else if (nota >= 7.5 && nota < 9) {
            System.out.println("Muito Bom");
        }else{
            System.out.println("Excelente");
        }

    }
}
