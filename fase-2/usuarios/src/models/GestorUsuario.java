package models;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GestorUsuario {
    private Map<Integer, Usuario> usuarios = new HashMap<>();

    public void addUsuario(Integer id, Usuario usuario) {
        usuarios.put(id, usuario);
    }

    public Stream<Usuario> ordenarUsuariosAlf() {
        return usuarios.values().stream().sorted(Comparator.comparing(u -> {
            String n = u.getNombre();
            return n == null ? "" : n.toLowerCase();
        }));
    }

    public Map<String, Long> contarUsuariosPorTipo() {
        return usuarios.values().stream().collect(Collectors.groupingBy(
            u -> u == null ? "null" : u.getClass().getSimpleName(),
            Collectors.counting()
        ));
    }
}