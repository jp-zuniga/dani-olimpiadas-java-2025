package models;

public class Electronico implements Producto {
    private final String nombre;
    private final double precio;
    private final String marca;

    public Electronico(String nombre, double precio, String marca) {
        this.nombre = nombre;
        this.precio = precio;
        this.marca  = marca;
    }

    public String getMarca() {
        return marca;
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
        return "Electronico{nombre=" + nombre + ", precio=" + precio +
               ", marca=" + marca + "}";
    }
}