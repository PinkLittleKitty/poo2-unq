package ar.edu.unq.poo2.tp2.empleados;

public class EmpleadoContratado extends Empleado {
    String numeroContrato;
    String medioDePago;

    @Override
    public double sueldoBruto() {
        return this.sueldoBasico();
    }

    @Override
    public double sueldoNeto() {
        return this.sueldoBruto() - 50;
    }

    @Override
    public String desgloce() {
        return "Gastos Administrativos Contracturales: " + 50;
    }
}