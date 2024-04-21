package bibilioteca.dominio;

import java.util.ArrayList;
import java.util.List;

public abstract class Usuario {
    private final String nombre;
    private final String dni;
    private final String telefono;
    private final List<Articulo> articulos;

    public Usuario(String nombre, String dni, String telefono) {
        this.nombre = nombre;
        this.dni = dni;
        this.telefono = telefono;
        this.articulos = new ArrayList<>();
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

    public List<Articulo> getArticulos() {
        return articulos;
    }

    public abstract int getMembresia();

    public void prestarArticulo(Articulo articulo){
        articulos.add(articulo);
        articulo.prestar();
    }

    public void devolverArticulo(Articulo articulo){
        articulos.remove(articulo);
        articulo.devolver();
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
