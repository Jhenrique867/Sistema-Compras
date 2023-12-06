package src;

import java.util.ArrayList;
import java.util.List;

public class CartaoDeCrédito {

    private double limite;
    private double saldo;
    private List<Compra> compras;


    public CartaoDeCrédito(double limite, double saldo, List<Compra> compras) {
        this.limite = limite;
        this.saldo = limite;
        this.compras = new ArrayList<>();
    }

    public double getLimite() {
        return limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<Compra> getCompras() {
        return compras;
    }
}
