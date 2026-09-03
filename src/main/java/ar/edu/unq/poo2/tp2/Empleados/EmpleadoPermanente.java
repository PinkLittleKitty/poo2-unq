package ar.edu.unq.poo2.tp2.Empleados;

public class EmpleadoPermanente extends Empleado {
    int cantHijos;
    int antiguedad;

    @Override
    public double sueldoBruto() {
        return this.sueldoBasico() + this.bonoFamiliar();
    }

    @Override
    public double obraSocial() {
        return super.obraSocial() + (cantHijos * 20);
    }

    @Override
    public double aportes() {
        return super.aportes() * 0.15;
    }

    public double bonoFamiliar() {
        return (cantHijos * 150) + estadoCivil.bono();
    }

    public double bonoAntiguedad() {
        return antiguedad * 50;
    }

    @Override
    public String desgloce() {
        return super.desgloce() +
                "Bono Familiar: " + this.bonoFamiliar() + "\n" +
                "Bono Antiguedad: " + this.bonoAntiguedad() + "\n" +
                "Obra Social: " + this.obraSocial() + "\n" +
                "Aportes: " + this.aportes() + "\n" +
                "Retenciones: " + this.retenciones();
    }
}