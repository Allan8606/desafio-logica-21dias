public class Main {


    public static class Conta {
        String banco, agencia;
        int saldo;

        public Conta(String banco, String agencia, int saldo) {
            this.banco = banco;
            this.agencia = agencia;
            this.saldo = saldo;
        }
    }


    public static void imprimirSaldoTotal(Conta[] contas) {
        int saldoTotal = 0;
        for (int i = 0; i < contas.length; i++) {
            saldoTotal += contas[i].saldo;
        }
        System.out.println("Saldo total: R$" + saldoTotal);
    }
    public static int mostrarSaldoPorConta(Conta[] contas, String nomeBancoBuscado) {
        int saldoTotal = 0;
        for (Conta conta : contas) {
            if (conta.banco.equals(nomeBancoBuscado)) {
                saldoTotal += conta.saldo;
            }
        }
        return saldoTotal;
    }






    public static void main(String[] args) {
        Conta[] saldoContas = {
                new Conta("Banco 01", "Agencia 01", 1000),
                new Conta("Banco 01", "Agencia 01", 1000),
                new Conta("Banco 02", "Agencia 02", 2500),
                new Conta("Banco 03", "Agencia 03", 3000),
                new Conta("Banco 04", "Agencia 04", 4000),
                new Conta("Banco 04", "Agencia 04", 1000),
                new Conta("Banco 05", "Agencia 05", 5000),
                new Conta("Banco 06", "Agencia 06", 6000),
                new Conta("Banco 07", "Agencia 07", 7000),
                new Conta("Banco 08", "Agencia 08", 8000),
                new Conta("Banco 09", "Agencia 09", 9000),
                new Conta("Banco 10", "Agencia 10", 10000)
        };

        System.out.println(saldoContas[5].saldo);

       var conta01 = mostrarSaldoPorConta(saldoContas, "Banco 01");
       System.out.println("O saldo total do Banco 01 é R$ " + conta01);

        var conta02 = mostrarSaldoPorConta(saldoContas, "Banco 02");
        System.out.println("O saldo total do Banco 02 é R$ " + conta02);

        var conta04 = mostrarSaldoPorConta(saldoContas, "Banco 04");
        System.out.println("O saldo total do Banco 04 é R$ " + conta04);


        imprimirSaldoTotal(saldoContas);
    }
}
