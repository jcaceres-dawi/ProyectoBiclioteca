package bibilioteca.dominio;

public class Prestamo {
    private final Libro libro;
    private final Usuario usuario;
    private final String inicio_prestamo;
    private String final_prestamo;

    public Prestamo(Libro libro, Usuario usuario, String inicio_prestamo, String final_prestamo) {
        this.libro = libro;
        this.usuario = usuario;
        this.inicio_prestamo = inicio_prestamo;
        this.final_prestamo = final_prestamo;
    }

    public String getLibro() {
        return libro.getTitulo();
    }

    public String getUsuario() {
        return usuario.getNombre();
    }

    public String getInicio_prestamo() {
        return inicio_prestamo;
    }

    public String getFinal_prestamo() {
        return final_prestamo;
    }

    public void actualizarFinal_prestamo(String final_prestamo) {
        this.final_prestamo = final_prestamo;
    }

    @Override
    public String toString() {
        String prestamo = "Información del prestamo:\n";
        prestamo += "- Libro: " + getLibro() + "\n";
        prestamo += "- Usuario: " + getUsuario() + "\n";
        prestamo += "- Inicio: " + getInicio_prestamo() + "\n";
        prestamo += "- Final: " + getFinal_prestamo() + "\n";
        return prestamo;
    }
}
