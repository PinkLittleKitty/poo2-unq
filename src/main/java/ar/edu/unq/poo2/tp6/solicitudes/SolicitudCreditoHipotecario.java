package ar.edu.unq.poo2.tp6.solicitudes;

import ar.edu.unq.poo2.tp6.Propiedad;

public class SolicitudCreditoHipotecario extends Solicitud {
    private Propiedad propiedadGarantia;

    @Override
    public boolean esAceptable() {
        return tieneSuficientesIngresosMensuales() && esMayorALaGarantia() && ;
    }
}
