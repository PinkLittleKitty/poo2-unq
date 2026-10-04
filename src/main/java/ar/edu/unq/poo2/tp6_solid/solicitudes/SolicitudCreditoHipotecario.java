package ar.edu.unq.poo2.tp6_solid.solicitudes;

import ar.edu.unq.poo2.tp6_solid.Propiedad;

public class SolicitudCreditoHipotecario extends Solicitud {
    private Propiedad propiedadGarantia;

    @Override
    public boolean esAceptable() {
        return tieneSuficientesIngresosMensuales() && esMayorALaGarantia() && esMayorDe65AlTerminar();
    }

    private boolean esMayorDe65AlTerminar() {
        return Cliente().Edad() + plazoAños() <= 65;
    }

    private boolean esMayorALaGarantia() {
        return montoSolicitado() <= propiedadGarantia.valorFiscal();
    }

    private boolean tieneSuficientesIngresosMensuales() {
        return this.cuotaMensual() <= Cliente().sueldoNetoMensual() * 0.5;
    }
}
