package bibilioteca.dominio;

public class Libro implements Prestable {
    private final String titulo;
    private final String autor;
    private final String genero;
    private final int año_publicacion;
    private boolean estado_prestamo;

    public Libro(String titulo, String autor, String genero, int año_publicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.año_publicacion = año_publicacion;
        this.estado_prestamo = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getGenero() {
        return genero;
    }

    public int getAño_publicacion() {
        return año_publicacion;
    }

    public boolean estaPrestado() {
        return estado_prestamo;
    }

    @Override
    public void prestar() {
        this.estado_prestamo = true;
    }

    @Override
    public void devolver() {
        this.estado_prestamo = false;
    }

    @Override
    public String toString() {
        String libro = "Información del libro:\n";
        libro += "- Título: " + getTitulo() + "\n";
        libro += "- Autor: " + getAutor() + "\n";
        libro += "- Género: " + getGenero() + "\n";
        libro += "- Año Publicación: " + getAño_publicacion() + "\n";
        libro += "- Prestado: " + estaPrestado() + "\n";
        return libro;
    }
}
