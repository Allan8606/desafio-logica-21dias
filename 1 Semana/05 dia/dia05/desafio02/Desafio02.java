package desafio02;

public class Desafio02 {
    public static void main(String[] args) {

        for (int contagem = 10; contagem > 0; contagem--){
            if (contagem <= 3){
                System.out.println("Atenção: " + contagem);
            }else {
                System.out.println(contagem);
            }
        }
        System.out.println("Lançamento do foguete!");


    }
}
