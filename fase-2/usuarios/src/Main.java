import models.Administrador;
import models.Editor;
import models.GestorUsuario;
import models.Lector;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        GestorUsuario gestor = getGestorUsuario();

        System.out.println("Usuarios ordenados alfabéticamente:");
        gestor.ordenarUsuariosAlf().forEach(u -> System.out.println(" - " + u));

        System.out.println("\nReporte: cantidad por tipo:");
        Map<String, Long> reporte = gestor.contarUsuariosPorTipo();
        reporte.forEach(
            (tipo, count) -> System.out.println(" - " + tipo + ": " + count));
    }

    private static GestorUsuario getGestorUsuario() {
        GestorUsuario gestor = new GestorUsuario();

        Administrador admin = new Administrador(1, "Ana", "ana@empresa.com", 5);

        Editor editor = new Editor(
            2, "Carlos", "carlos@empresa.com", List.of("Deportes", "Cultura"));

        Lector lector = new Lector(
            3, "Beatriz", "beatriz@correo.com",
                                   Set.of("Tecnología", "Ciencia")
        );

        gestor.addUsuario(admin.getId(), admin);
        gestor.addUsuario(editor.getId(), editor);
        gestor.addUsuario(lector.getId(), lector);
        return gestor;
    }
}