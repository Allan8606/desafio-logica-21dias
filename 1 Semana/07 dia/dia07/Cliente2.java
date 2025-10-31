public class Cliente2 extends Cliente1 {


    private String nome;
    private double saldo;

    public Cliente2(String nome, double saldo, String nome1, double saldo1) {
        super(nome, saldo);
        this.nome = nome1;
        this.saldo = saldo1;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
