package ar.edu.unq.poo2.tp2.Empleados;

import java.time.LocalDate;

public class EmpleadoTemporal extends Empleado{
    LocalDate fechaDesignación;
    int cantHorasExtra;

    @Override
    public double sueldoBruto() {
        return this.sueldoBasico() + this.horasExtra();
    }

    @Override
    public double obraSocial() {
        return super.obraSocial() + this.viejoTax();
    }

    @Override
    public double aportes() {
        return super.aportes() * 0.1 + (cantHorasExtra * 5);
    }

    @Override
    public String desgloce() {
        return super.desgloce() +
                "Horas Extra: " + this.horasExtra() + "\n" +
                "Obra Social: " + this.obraSocial() + "\n" +
                "Aportes: " + this.aportes() + "\n" +
                "Retenciones: " + this.retenciones();
    }

    public double viejoTax() {
        if (this.edad() > 50) {
            return 25;
        } else {
            return 0;
        }
    }

    public double horasExtra() {
        return this.cantHorasExtra * 40;
    }
}