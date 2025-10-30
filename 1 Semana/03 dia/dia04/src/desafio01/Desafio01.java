package desafio01;

public class Desafio01 {
    public static void main(String[] args) {
//        Vamos supor que estamos criando um sistema para controlar a renovação da carteira de motorista e precisamos saber em quanto tempo a mesma irá vencer de acordo com a legislação.
//          -De acordo com a lei, se você está tirando a carteira pela 1ª vez (independentemente da sua idade), o tempo de vencimento dela é de 1 ano;
//          -Se você tem idade inferior a 50 anos o vencimento é de 10 anos;
//          -Se for igual ou superior a 50 anos ou inferior a 70 anos o vencimento é de 5 anos;
//          -Mas se for igual ou superior a 70 anos o vencimento será de 3 anos.
//        Você deve criar variáveis e estruturas condicionais para controlar esse vencimento.



        controladorRenovacaoCnh(1993, 2025, true);
        controladorRenovacaoCnh(1993, 2025, false);
        controladorRenovacaoCnh(1965, 2025, false);
        controladorRenovacaoCnh(1950, 2025, false);



    }

    public static void controladorRenovacaoCnh(int anoNascimento, int anoAtual, boolean primeiraHabilitacao){
        int idade = anoAtual - anoNascimento;


        if(primeiraHabilitacao){
            System.out.println("Sua CNH tem a validade de 1 ano, e vai vencer no ano de " + (anoAtual + 1));
        } else if (idade < 50){
            System.out.println("Sua CNH tem a validade de 10 anos, e vai vencer no ano de " + (anoAtual + 10));
        } else if (idade >= 50 && idade < 70) {
            System.out.println("Sua CNH tem a validade de 5 anos, e vai vencer no ano de " + (anoAtual + 5));
        }else {
            System.out.println("Sua CNH tem a validade de 3 anos, e vai vencer no ano de " + (anoAtual + 3));
        }

    }
}
