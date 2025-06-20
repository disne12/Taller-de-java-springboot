package com.example.demo.sumador.controller;

import com.example.demo.sumador.model.UsuarioRequest;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@RestController
@RequestMapping("/usuario")
public class DeleteController {

    // Simulamos una lista de usuarios
    private List<UsuarioRequest> usuarios = new ArrayList<>();

    // Constructor de la clase DeleteController
    public DeleteController() {
        // Agregamos algunos usuarios de ejemplo a la lista
        usuarios.add(new UsuarioRequest("Dinneidis", "1234"));
        usuarios.add(new UsuarioRequest("Paola", "5678"));
        usuarios.add(new UsuarioRequest("Yenis", "abcd"));
    }

    // Método DELETE para eliminar un usuario por su nombre
    @DeleteMapping("/eliminar/{usuario}")
    public String eliminarUsuario(@PathVariable String usuario) {
        // Usamos un iterador para evitar problemas al eliminar durante la iteración
        Iterator<UsuarioRequest> iterator = usuarios.iterator();
        while (iterator.hasNext()) {
            UsuarioRequest user = iterator.next();
            if (user.getUsuario().equalsIgnoreCase(usuario)) {
                iterator.remove();  // Eliminar el usuario de la lista
                return "Usuario " + usuario + " eliminado exitosamente.";
            }
        }
        return "Usuario " + usuario + " no encontrado.";
    }

    // Método para ver los usuarios actuales (para pruebas)
    @GetMapping("/listar")
    public List<UsuarioRequest> listarUsuarios() {
        return usuarios;
    }
}

