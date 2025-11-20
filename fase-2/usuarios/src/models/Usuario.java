package models;

public class Usuario {
    private Integer id;
    private String  nombre;
    private String  email;

    public Usuario() {
    }

    public Usuario(Integer id, String nombre, String email) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTipo() {
        return this.getClass().getSimpleName();
    }

    @Override
    public String toString() {
        return String.format(
            "%s{id=%d, nombre='%s', email='%s'}", getTipo(),
            id, nombre, email
        );
    }
}