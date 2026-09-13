package ar.edu.unq.poo2.tp5;

public abstract class Producto implements Registrable {
    private String nombre;
    protected double precioBase;
    private int stock;

    public Producto(String nombre, double precioBase, int stock) {
        this.nombre = nombre;
        this.precioBase = precioBase;
        this.stock = stock;
    }

    public void decrementarStock() {
        if (this.stock > 0) {
            this.stock--;
        } else {
            throw new IllegalStateException("No hay suficiente stock para " + this.nombre);
        }
    }

    public abstract double getPrecio();

    public int getStock() {
        return stock;
    }

    @Override
    public double getMonto() {
        return this.getPrecio();
    }

    @Override
    public void registrar() {
        this.decrementarStock();
    }
}
