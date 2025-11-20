import models.*;

public class Main {
    public static void main(String[] args) {
        Inventario<Electronico> invElec = new Inventario<>();
        invElec.agregar(new Electronico("Smartphone", 699.99, "MarcaX"));
        invElec.agregar(new Electronico("Laptop", 1299.0, "MarcaY"));

        Inventario<Ropa> invRopa = new Inventario<>();
        invRopa.agregar(new Ropa("Camiseta", 19.99, "M"));
        invRopa.agregar(new Ropa("Chaqueta", 89.5, "L"));

        Inventario<Comida> invComida = new Inventario<>();
        invComida.agregar(new Comida("Leche", 1.2, "2025-12-01"));
        invComida.agregar(new Comida("Pan", 0.8, "2025-05-02"));

        System.out.println("=== Electrónicos ===");
        invElec.imprimir();

        System.out.println("\n=== Ropa ===");
        invRopa.imprimir();

        System.out.println("\n=== Comida ===");
        invComida.imprimir();

        Inventario<Producto> invMixto = new Inventario<>();
        invMixto.agregar(new Electronico("Auriculares", 59.99, "MarcaZ"));
        invMixto.agregar(new Ropa("Pantalones", 49.99, "S"));
        invMixto.agregar(new Comida("Queso", 4.5, "2025-09-10"));

        System.out.println("\n=== Mixto ===");
        invMixto.imprimir();
    }
}