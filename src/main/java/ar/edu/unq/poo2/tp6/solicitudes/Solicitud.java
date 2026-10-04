package ar.edu.unq.poo2.tp6.solicitudes;

import ar.edu.unq.poo2.tp6.Cliente;

public abstract class Solicitud {
    private Cliente clienteSolicitante;
    private double montoSolicitado;
    private int plazoMeses;

    public Cliente Cliente() {
        return clienteSolicitante;
    }

    public double montoSolicitado() {
        return montoSolicitado;
    }
    public double cuotaMensual() {
        return montoSolicitado / plazoMeses;
    }

    public abstract boolean esAceptable();

    public int plazoAños() {
        return plazoMeses / 12;
    }
}
