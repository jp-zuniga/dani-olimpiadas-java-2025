package models;

import java.util.List;

public class Editor extends Usuario {
    private List<String> seccionesAsignadas;

    public Editor() {
    }

    public Editor(
        Integer id, String nombre, String email,
        List<String> seccionesAsignadas
    ) {
        super(id, nombre, email);
        this.seccionesAsignadas = seccionesAsignadas;
    }

    public List<String> getSeccionesAsignadas() {
        return seccionesAsignadas;
    }

    public void setSeccionesAsignadas(List<String> seccionesAsignadas) {
        this.seccionesAsignadas = seccionesAsignadas;
    }

    @Override
    public String toString() {
        return String.format(
            "%s{id=%d, nombre='%s', email='%s', secciones=%s}", getTipo(),
            getId(), getNombre(), getEmail(), seccionesAsignadas
        );
    }
}