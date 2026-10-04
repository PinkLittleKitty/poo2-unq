package ar.edu.unq.poo2.tp6;

import ar.edu.unq.poo2.tp6.solicitudes.Solicitud;

public class Cliente {
    private String Nombre;
    private String Apellido;
    private String Direccion;
    private int edad;
    private int sueldoNetoMensual;

    public int Edad() {
        return edad;
    }

    public double sueldoNetoAnual() {
        return sueldoNetoMensual * 12;
    }
    public double sueldoNetoMensual() {
        return sueldoNetoMensual;
    }

    public void solicitarCrédito(Banco banco, Solicitud solicitud) {
        banco.registrarSolicitud(solicitud);
    }

    public void pagar(double montoSolicitado) {
    }
}
