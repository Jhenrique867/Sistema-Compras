package src;

public class Compra {
private String descricao;
private double saldo;

    public Compra(String descricao, double saldo) {
        this.descricao = descricao;
        this.saldo = saldo;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getSaldo() {
        return saldo;
    }
}
