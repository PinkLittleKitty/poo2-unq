package ar.edu.unq.poo2.tp5;

public class Caja {
    private double total = 0;

    public void registrarItem(Registrable item) {
        this.total += item.getMonto();
        item.registrar();
    }

    public double getTotal() {
        return this.total;
    }
}
