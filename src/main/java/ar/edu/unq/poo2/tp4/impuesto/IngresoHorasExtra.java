package ar.edu.unq.poo2.tp4.impuesto;

public class IngresoHorasExtra extends Ingreso {
    private double horasExtra;

    public IngresoHorasExtra(String mes, String concepto, double monto, double horasExtra) {
        super(mes, concepto, monto);
        this.horasExtra = horasExtra;
    }

    @Override
    public double getMontoImponible() {
        return 0;
    }
}
