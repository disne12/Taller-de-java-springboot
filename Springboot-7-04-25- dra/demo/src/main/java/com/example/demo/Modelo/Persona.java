package com.example.demo.Modelo;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;
@Document(collection = "personas")
public class Persona {

    @Id
    private String id;
    private String nombre;
    private String telefono;
    private String direccion;

    public void persona() {}

    public void persona(String nombre, String direccion, String id, String telefono ) {
        this.nombre = nombre;
        this.id = id;
        this.direccion = direccion ;
        this.telefono = telefono;
    }

    // Getters y setters
    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}

