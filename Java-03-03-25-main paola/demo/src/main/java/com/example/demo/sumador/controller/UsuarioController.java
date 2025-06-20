package com.example.demo.sumador.controller;

import com.example.demo.sumador.model.UsuarioRequest;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    // Método PUT para actualizar usuario y contraseña
    @PutMapping("/actualizar")
    public String actualizarUsuario(@RequestBody UsuarioRequest usuarioRequest) {
        // Obtenemos los valores de usuario y contraseña
        String usuario = usuarioRequest.getUsuario();
        String contrasena = usuarioRequest.getContrasena();
        System.out.println(contrasena);
        // En una aplicación real, aquí deberíamos actualizar los datos en la base de datos.
        // Este es solo un ejemplo sencillo, por lo que solo devolvemos un mensaje.
        return "Usuario actualizado: " + usuario + ", Contraseña: " + contrasena;
    }
}

