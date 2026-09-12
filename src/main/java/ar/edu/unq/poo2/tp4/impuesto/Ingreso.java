package ar.edu.unq.poo2.tp4.impuesto;

public class Ingreso {
    private String mes;
    private String concepto;
    private double monto;

    public Ingreso(String mes, String concepto, double monto) {
        this.mes = mes;
        this.concepto = concepto;
        this.monto = monto;
    }

    public double getMonto() {
        return monto;
    }

    public double getMontoImponible() {
        return monto;
    }
}
