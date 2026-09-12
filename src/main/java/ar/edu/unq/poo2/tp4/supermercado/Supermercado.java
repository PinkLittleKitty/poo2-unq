package ar.edu.unq.poo2.tp4.supermercado;

import java.util.ArrayList;
import java.util.List;

public class Supermercado {
    private String nombre;
    private String dirección;
    private List<Producto> productos = new ArrayList<>();

    public Supermercado(String Nombre, String Direccion) {
        this.nombre = Nombre;
        this.dirección = Direccion;
    }

    public String getName() {
        return nombre;
    }

    public String getDireccion() {
        return dirección;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public Integer getCantidadDeProductos() {
        return productos.size();
    }

    public Double getPrecioTotal() {
        return productos.stream().mapToDouble(Producto::getPrecio).sum();
    }
}
