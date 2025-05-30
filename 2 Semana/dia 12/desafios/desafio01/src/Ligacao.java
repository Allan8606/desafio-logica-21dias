import java.util.List;

public class Ligacao implements ReceberLigacao {
    List<String> numeros;


    String numeroTelefone;

  // Todo: Método que vai receber as ligações e add os numeros de telefone na fila
    @Override
    public void receberLigacao(List<String> numeros, String numeroTelefone){
        this.numeros = numeros;
        this.numeroTelefone = numeroTelefone;

        numeros.add(numeroTelefone);
        System.out.println("O número: " + numeroTelefone + " foi adicionado na fila para o atendimento");
        System.out.println("Fila de telefones para serem atendidos: " + numeros);
        System.out.println("--------------------");
    }

    //TODO: Método que vai tirar o primeiro numero que chegou da lista
    public void retirandoNumero (List<String> numerosAtendidos){
        if (numerosAtendidos.isEmpty()){
            System.out.println("Parabéns todos seu atendimentos foram feitos");
            System.exit(0);
        }else {
            String numeroRetirado = numerosAtendidos.get(0);
            numerosAtendidos.remove(numeroRetirado);
            System.out.println("O número: " + numeroRetirado + " foi atendido com sucesso");
            System.out.println("Lista atualizada de números para serem atendidos: " + numeros);
        }


    }

}
