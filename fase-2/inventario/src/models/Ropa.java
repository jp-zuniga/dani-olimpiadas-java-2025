package models;

public class Ropa implements Producto {
    private final String nombre;
    private final double precio;
    private final String talla;

    public Ropa(String nombre, double precio, String talla) {
        this.nombre = nombre;
        this.precio = precio;
        this.talla  = talla;
    }

    public String getTalla() {
        return talla;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Ropa{nombre=" + nombre + ", precio=" + precio + ", talla=" +
               talla + "}";
    }
}