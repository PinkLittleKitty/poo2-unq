package ar.edu.unq.poo2.tp5;

public abstract class Factura implements Registrable {
    protected Agencia agencia;

    public Factura(Agencia agencia) {
        this.agencia = agencia;
    }

    @Override
    public void registrar() {
        agencia.registrarPago(this);
    }

    @Override
    public abstract double getMonto();
}
