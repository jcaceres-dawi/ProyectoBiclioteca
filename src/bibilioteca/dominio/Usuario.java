package bibilioteca.dominio;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private final String nombre;
    private final String dni;
    private final String telefono;
    private final List<Libro> libros;
    public final int membresia;

    public Usuario(String nombre, String dni, String telefono, int membresia) {
        this.nombre = nombre;
        this.dni = dni;
        this.telefono = telefono;
        this.libros = new ArrayList<>();
        this.membresia = membresia;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public String getTelefono() {
        return telefono;
    }

    public int getMembresia(){
        return membresia;
    }

    public void prestarLibro(Libro libro){
        libros.add(libro);
        libro.prestarLibro();
    }

    public void devolverLibro(Libro libro){
        libros.remove(libro);
        libro.devolverLibro();
    }

    @Override
    public String toString() {
        String usuario = "Información de usuario:\n";
        usuario += "- Nombre: " + getNombre() + "\n";
        usuario += "- Dni: " + getDni() + "\n";
        usuario += "- Teléfono: " + getTelefono() + "\n";
        usuario += "- Membresia: " + getMembresia() + "\n";
        return usuario;
    }
}
