package src;

public class Compra implements Comparable<Compra>{
private String descricao;
private double valor;

    public Compra(String descricao, double saldo) {
        this.descricao = descricao;
        this.valor = saldo;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }


    @Override
    public String toString() {
        return "Compra: descricao = " + descricao +
                "valor =" + valor;
    }

    @Override
    public int compareTo(Compra outraCompra) {
        return Double.valueOf(this.valor).compareTo(Double.valueOf(outraCompra.valor));
    }
}
