package bibilioteca.dominio;

public class Libro extends Articulo {
    private final String autor;
    private final Genero genero;

    public Libro(String titulo, String autor, Genero genero, int año_publicacion) {
        super(titulo, año_publicacion, false);
        this.autor = autor;
        this.genero = genero;
    }

    public String getAutor() {
        return autor;
    }

    public Genero getGenero() {
        return genero;
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
