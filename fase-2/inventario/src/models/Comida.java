package models;

public class Comida implements Producto {
    private final String nombre;
    private final double precio;
    private final String fechaCaducidad;

    public Comida(String nombre, double precio, String fechaCaducidad) {
        this.nombre         = nombre;
        this.precio         = precio;
        this.fechaCaducidad = fechaCaducidad;
    }

    public String getFechaCaducidad() {
        return fechaCaducidad;
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
        return "Comida{nombre=" + nombre + ", precio=" + precio + ", caduca=" +
               fechaCaducidad + "}";
    }
}
