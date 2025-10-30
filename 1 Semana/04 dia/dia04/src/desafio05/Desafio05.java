package desafio05;

public class Desafio05 {
    public static void main(String[] args) {

        cancelaEstacionamento("Aberta");
        cancelaEstacionamento("Fechada");
        cancelaEstacionamento("Manutenção");
        cancelaEstacionamento("Atenção");

    }

    public static void cancelaEstacionamento(String status){

        switch (status){
            case "Aberta":
                System.out.println("A cancela está aberta, pode passar");
                break;
            case "Fechada":
                System.out.println("A cancela está fechada. Porfavor abra.");
                break;
            case "Manutenção":
                System.out.println("A cancela está em manutenção. Entrada proibida");
                break;
            default:
                System.out.println("Nenhuma opção valida");
        }



    }
}
