package bibilioteca.dominio;

public class Revista extends Articulo {

    public Revista(String titulo, int año_publicacion) {
        super(titulo, año_publicacion, false);
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
