package ar.edu.unq.poo2.tp2.Empleados;

import java.time.*;

import ar.edu.unq.poo2.tp2.EstadoCivil.EstadoCivil;
import ar.edu.unq.poo2.tp2.ReciboHaberes.ReciboHaberes;


public class Empleado {
    String nombre;
    String dirección;
    EstadoCivil estadoCivil;
    LocalDate fechaNac;
    double sueldoBasico;

    public int edad() {
        return Period.between(this.fechaNac, LocalDate.now()).getYears();
    }

    public double sueldoBasico() {
        return sueldoBasico;
    }

    public double sueldoBruto() {
        return 0;
    }

    public double sueldoNeto() {
        return this.sueldoBruto() - this.retenciones();
    }

    public double retenciones() {
        return this.obraSocial() + this.aportes();
    }

    public double obraSocial() {
        return (this.sueldoBruto() * 0.1);
    }

    public double aportes() {
        return this.sueldoBruto();
    }

    public ReciboHaberes generarRecibo() {
        return new ReciboHaberes(
                nombre,
                dirección,
                LocalDate.now().toString(),
                String.valueOf(this.sueldoBruto()),
                String.valueOf(this.sueldoNeto()),
                this.desgloce());
    }

    public String desgloce() {
        return "";
    }
}
