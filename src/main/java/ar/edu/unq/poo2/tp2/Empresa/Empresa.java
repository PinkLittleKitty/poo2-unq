package ar.edu.unq.poo2.tp2.Empresa;

import ar.edu.unq.poo2.tp2.Empleados.Empleado;
import ar.edu.unq.poo2.tp2.ReciboHaberes.ReciboHaberes;

import java.util.List;

public class Empresa {
    String nombre;
    String CUIT;
    List<Empleado> empleados;
    List<ReciboHaberes> recibos;

    void liquidación() {
        for (Empleado empleado : empleados) {
            recibos.add(empleado.generarRecibo());
        }
    }

    public double totalSueldosNetos() {
        return empleados.stream().mapToDouble(emp -> emp.sueldoNeto()).sum();
    }

    public double totalSueldosBrutos() {
        return empleados.stream().mapToDouble(emp -> emp.sueldoBruto()).sum();
    }

    public double totalRetenciones() {
        return empleados.stream().mapToDouble(emp -> emp.retenciones()).sum();
    }
}