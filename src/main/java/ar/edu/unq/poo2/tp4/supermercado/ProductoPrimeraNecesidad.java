package ar.edu.unq.poo2.tp4.supermercado;

public class ProductoPrimeraNecesidad extends Producto {
    private double descuento;
    public ProductoPrimeraNecesidad(String nombre, Double precio, Boolean preciosCuidados) {
        super(nombre, precio, preciosCuidados);
        this.descuento = 10;
    }

    public ProductoPrimeraNecesidad(String nombre, Double precio) {
        super(nombre, precio);
        this.descuento = 10;
    }

    public ProductoPrimeraNecesidad(String nombre, Double precio, Boolean preciosCuidados, double descuento) {
        super(nombre, precio, preciosCuidados);
        this.setPorcentajeDescuento(descuento);
    }

    public ProductoPrimeraNecesidad(String nombre, Double precio, double descuento) {
        super(nombre, precio);
        this.descuento = descuento;
    }

    @Override
    public Double getPrecio() {
        double factor = 1.0 - (this.descuento / 100);
        return super.getPrecio() * factor;
    }

    private void setPorcentajeDescuento(Double descuento) {
        if (descuento < 0 || descuento > 100) {
            throw new IllegalArgumentException("El porcentaje de descuento tiene que ser entre 0 y 100");
        } else {
            this.descuento = descuento;
        }
    }
}
