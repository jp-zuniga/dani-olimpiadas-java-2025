package models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Inventario<T extends Producto> {
    private final List<T> productos = new ArrayList<>();

    public void agregar(T producto) {
        productos.add(producto);
    }

    public List<T> listar() {
        return Collections.unmodifiableList(productos);
    }

    public void imprimir() {
        if (productos.isEmpty()) {
            System.out.println("Inventario vacío.");
            return;
        }
        for (T p : productos) {
            System.out.println(p);
        }
    }
}