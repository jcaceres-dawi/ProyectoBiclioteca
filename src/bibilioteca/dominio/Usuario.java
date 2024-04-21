package bibilioteca.dominio;

import java.util.ArrayList;
import java.util.List;

public abstract class Usuario {
    private final String nombre;
    private final String dni;
    private final String telefono;
    private final List<Libro> libros;

    public Usuario(String nombre, String dni, String telefono) {
        this.nombre = nombre;
        this.dni = dni;
        this.telefono = telefono;
        this.libros = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public String getTelefono() {
        return telefono;
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public abstract int getMembresia();

    public void prestarLibro(Libro libro){
        libros.add(libro);
        libro.prestar();
    }

    public void devolverLibro(Libro libro){
        libros.remove(libro);
        libro.devolver();
    }
}
