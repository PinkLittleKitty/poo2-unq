package ar.edu.unq.poo2.tp5;

public class Impuesto extends Factura {
    private double tasaDeServicio;

    public Impuesto(Agencia agencia, double tasaDeServicio) {
        super(agencia);
        this.tasaDeServicio = tasaDeServicio;
    }

    @Override
    public double getMonto() {
        return tasaDeServicio;
    }
}
