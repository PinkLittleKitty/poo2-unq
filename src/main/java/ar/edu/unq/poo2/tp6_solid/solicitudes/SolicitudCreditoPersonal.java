package ar.edu.unq.poo2.tp6_solid.solicitudes;

public class SolicitudCreditoPersonal extends Solicitud {
    @Override
    public boolean esAceptable() {
        return tieneSuficientesIngresosAnuales() && tieneSuficientesIngresosMensuales();
    }

    private boolean tieneSuficientesIngresosMensuales() {
        return this.cuotaMensual() <= Cliente().sueldoNetoMensual() * 0.7;
    }

    private boolean tieneSuficientesIngresosAnuales() {
        return this.Cliente().sueldoNetoAnual() >= 15000;
    }
}
