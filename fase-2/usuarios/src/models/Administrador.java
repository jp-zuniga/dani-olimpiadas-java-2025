package models;

public class Administrador extends Usuario {
    private int nivelDeAcceso;

    public Administrador() {
    }

    public Administrador(
        Integer id, String nombre, String email, int nivelDeAcceso) {
        super(id, nombre, email);
        this.nivelDeAcceso = nivelDeAcceso;
    }

    public int getNivelDeAcceso() {
        return nivelDeAcceso;
    }

    public void setNivelDeAcceso(int nivelDeAcceso) {
        this.nivelDeAcceso = nivelDeAcceso;
    }

    @Override
    public String toString() {
        return String.format(
            "%s{id=%d, nombre='%s', email='%s', nivelDeAcceso=%d}", getTipo(),
            getId(), getNombre(), getEmail(), nivelDeAcceso
        );
    }
}
