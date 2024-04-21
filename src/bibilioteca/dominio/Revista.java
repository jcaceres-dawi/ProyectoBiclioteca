package bibilioteca.dominio;

public class Revista implements Articulo {
    private final String titulo;
    private final int año_publicacion;
    private boolean estado_prestamo;

    public Revista(String titulo, int año_publicacion) {
        this.titulo = titulo;
        this.año_publicacion = año_publicacion;
        this.estado_prestamo = false;
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

    @Override
    public String toString() {
        String revista = "Información de la revista:\n";
        revista += "- Título: " + getTitulo() + "\n";
        revista += "- Año Publicación: " + getAño_publicacion() + "\n";
        revista += "- Prestado: " + estaPrestado() + "\n";
        return revista;
    }

}
