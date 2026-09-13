package ar.edu.unq.poo2.tp5;

public class Servicio extends Factura {
    private Double costoPorUnidad;
    private int unidadesConsumidas;

    public Servicio(Agencia agencia, Double costoPorUnidad, int unidadesConsumidas) {
        super(agencia);
        this.costoPorUnidad = costoPorUnidad;
        this.unidadesConsumidas = unidadesConsumidas;
    }

    @Override
    public double getMonto() {
        return costoPorUnidad * unidadesConsumidas;
    }
}
