package ar.edu.unq.poo2.tp6.solicitudes;

import ar.edu.unq.poo2.tp6.Cliente;

public abstract class Solicitud {
    private Cliente clienteSolicitante;
    private double montoSolicitado;
    private int plazoMeses;

    public Cliente Cliente() {
        return clienteSolicitante;
    }

    public double MontoSolicitado() {
        return montoSolicitado;
    }
    public double cuotaMensual() {
        return montoSolicitado / plazoMeses;
    }

    public abstract boolean esAceptable();
}
