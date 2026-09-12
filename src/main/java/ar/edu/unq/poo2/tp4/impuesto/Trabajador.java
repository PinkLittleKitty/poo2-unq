package ar.edu.unq.poo2.tp4.impuesto;

import java.util.ArrayList;
import java.util.List;

public class Trabajador {
    private List<Ingreso> ingresoPercibidoAnual = new ArrayList<>();

    public Trabajador(List<Ingreso> ingresoPercibidoAnual) {
        this.ingresoPercibidoAnual = ingresoPercibidoAnual;
    }

    public double getTotalPercibido() {
        return ingresoPercibidoAnual.stream().mapToDouble(Ingreso::getMonto).sum();
    }

    public double getMontoImponible() {
        return ingresoPercibidoAnual.stream().mapToDouble(Ingreso::getMontoImponible).sum();
    }

    public double getImpuestoAPagar() {
        return this.getMontoImponible() * 0.02;
    }
}
