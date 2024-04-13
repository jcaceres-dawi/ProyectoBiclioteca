package bibilioteca.dominio;

public class Libro {
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

    public boolean estaPrestado() {
        return estado_prestamo;
    }

    public void prestarLibro() {
        this.estado_prestamo = true;
    }

    public void devolverLibro() {
        this.estado_prestamo = false;
    }

}
