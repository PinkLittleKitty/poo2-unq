package ar.edu.unq.poo2.tp4.supermercado;

public class Producto {
    private String nombre;
    private Double precio;
    private Boolean preciosCuidados;

    public Producto(String nombre, Double precio, Boolean preciosCuidados) {
        this.nombre = nombre;
        this.precio = precio;
        this.preciosCuidados = preciosCuidados;
    }

    public Producto(String nombre, Double precio) {
        this.nombre = nombre;
        this.precio = precio;
        this.preciosCuidados = false;
    }

    public String getNombre() {
        return nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public Boolean esPrecioCuidado() {
        return preciosCuidados;
    }

    public void aumentarPrecio(Double precio) {
        this.precio += precio;
    }
}
