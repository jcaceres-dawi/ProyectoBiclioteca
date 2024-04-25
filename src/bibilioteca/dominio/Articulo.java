package bibilioteca.dominio;

public class Articulo implements Prestable {
    private final String titulo;
    private final int año_publicacion;
    private boolean estado_prestamo;

    public Articulo(String titulo, int año_publicacion, boolean estado_prestamo) {
        this.titulo = titulo;
        this.año_publicacion = año_publicacion;
        this.estado_prestamo = estado_prestamo;
    }

    public String getTitulo() {
        return titulo;
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
}
