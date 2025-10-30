package desafio04;

//Um cliente possui uma conta em uma loja com um certo saldo para compras e uma condição que indica se a conta está ativa ou não. Sua tarefa é escrever um código que determine se o cliente pode fazer compras com sua conta.
//As condições para poder comprar são: a conta precisa estar ativa (ou seja, o cliente não deve estar inativo) e o saldo deve ser maior que 500. Use a condição ternária para isso.

public class Desafio04 {
    public static void main(String[] args) {

        cliente(true, 400);
        cliente(false, 800);
        cliente(true, 600);
    }

    public static void cliente(boolean statusConta, double saldoConta){

        String status = (statusConta && saldoConta > 500) ? "Cliente pode fazer compras" : "Cliente não pode fazer compras";

        System.out.println(status);

    }
}
