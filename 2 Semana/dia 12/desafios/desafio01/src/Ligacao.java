import java.util.List;

public class Ligacao implements ReceberLigacao {
    List<String> numeros;
    List<String> numerosJaAtendidos;
    String numeroTelefone;


    public Ligacao(List<String> numeros, List<String> numerosJaAtendidos, String numeroTelefone) {
        this.numeros = numeros;
        this.numerosJaAtendidos = numerosJaAtendidos;
        this.numeroTelefone = numeroTelefone;
    }

    // Todo: Método que vai receber as ligações e add os numeros de telefone na fila
    @Override
    public void receberLigacao(List<String> numeros, String numeroTelefone){
        numeros.add(numeroTelefone);
        System.out.println("O número: " + numeroTelefone + " foi adicionado na fila para o atendimento");
        System.out.println("Fila de telefones para serem atendidos: " + numeros);
        System.out.println("--------------------");
    }

    //TODO: Método que vai tirar o primeiro numero que chegou da lista
    public void retirandoNumero (List<String> numerosAtendidos) {
        if (numerosAtendidos.isEmpty()) {
            System.out.println("Parabéns todos seu atendimentos foram feitos");
            System.out.println("Lista de números que já foram atendidos: " + numerosJaAtendidos);
            System.exit(0);
        }else {
            String numeroRetirado = numerosAtendidos.get(0);
            numerosAtendidos.remove(numeroRetirado);
            numerosJaAtendidos.add(numeroRetirado);
            System.out.println("O número: " + numeroRetirado + " foi atendido com sucesso.");
            System.out.println("-----------------------");
            System.out.println("Lista atualizada de números para serem atendidos: " + numeros);
            System.out.println("Lista de números que já foram atendidos: " + numerosJaAtendidos);
        }


    }

}
