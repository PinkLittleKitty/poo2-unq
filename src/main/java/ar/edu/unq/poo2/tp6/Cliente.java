package ar.edu.unq.poo2.tp6;

public class Cliente {
    private String Nombre;
    private String Apellido;
    private String Direccion;
    private int edad;
    private int sueldoNetoMensual;

    public double sueldoNetoAnual() {
        return sueldoNetoMensual * 12;
    }

    public void solicitarCrédito(Banco banco, Solicitud solicitud) {
        banco.registrarSolicitud(solicitud);
    }
}
