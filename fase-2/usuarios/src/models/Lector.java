package models;

import java.util.Set;

public class Lector extends Usuario {
    private Set<String> temasFavoritos;

    public Lector() {
    }

    public Lector(
        Integer id, String nombre, String email, Set<String> temasFavoritos) {
        super(id, nombre, email);
        this.temasFavoritos = temasFavoritos;
    }

    public Set<String> getTemasFavoritos() {
        return temasFavoritos;
    }

    public void setTemasFavoritos(Set<String> temasFavoritos) {
        this.temasFavoritos = temasFavoritos;
    }

    @Override
    public String toString() {
        return String.format(
            "%s{id=%d, nombre='%s', email='%s', temas=%s}", getTipo(), getId(),
            getNombre(), getEmail(), temasFavoritos
        );
    }
}