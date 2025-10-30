package desafio03;

public class Desafio03 {
    public static void main(String[] args) {

        notaAluno(80);
        notaAluno(69);

    }

    public static void notaAluno(double nota){

        String resultado = (nota >= 70) ? "Aprovado" : "Reprovado";
        System.out.println(resultado);
    }
}
