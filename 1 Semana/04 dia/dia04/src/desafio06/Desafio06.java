package desafio06;

public class Desafio06 {

    public static void main(String[] args) {

        sistemaPVD("Alimentos", 250.75);
        sistemaPVD("Eletônicos", 500.75);
        sistemaPVD("Roupas", 215.85);
        sistemaPVD("Livros", 500);
        sistemaPVD("Alumínio", 221);


    }

    public static void sistemaPVD(String tipoProduto, double precoProduto){


        double precoComDesconto = 0;


        switch (tipoProduto){
            case "Alimentos":
                precoComDesconto = precoProduto - (precoProduto * 0.05);
                System.out.println("O produto com o desconto ficou R$: " + precoComDesconto);
                break;

            case "Eletônicos":
                precoComDesconto = precoProduto - (precoProduto * 0.1);
                System.out.println("O produto com o desconto ficou R$: " + precoComDesconto);
                break;

            case "Roupas":
                precoComDesconto = precoProduto - (precoProduto * 0.2);
                System.out.println("O produto com o desconto ficou R$: " + precoComDesconto);
                break;

            case "Livros":
                precoComDesconto = precoProduto - (precoProduto * 0.5);
                System.out.println("O produto com o desconto ficou R$: " + precoComDesconto);
                break;

            default:
                System.out.println("Infelizmente para essa categoria não tem desconto");
        }


    }
}
