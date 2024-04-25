package bibilioteca.dominio;

import java.io.*;

public class Prestamo {
    private final Articulo articulo;
    private final Usuario usuario;
    private final String inicio_prestamo;
    private String final_prestamo;

    public Prestamo(Articulo articulo, Usuario usuario, String inicio_prestamo, String final_prestamo) {
        this.articulo = articulo;
        this.usuario = usuario;
        this.inicio_prestamo = inicio_prestamo;
        this.final_prestamo = final_prestamo;
    }

    public String getArticulo() {
        return articulo.getTitulo();
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

    public void regitrar_prestamo() {
        FileWriter fichero = null;
        PrintWriter pw = null;
        try {
            fichero = new FileWriter("registro.txt", true);
            pw = new PrintWriter(fichero);
            pw.println(toString());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != fichero)
                    fichero.close();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    @Override
    public String toString() {
        String prestamo = "Información del prestamo:\n";
        prestamo += "- Articulo: " + getArticulo() + "\n";
        prestamo += "- Usuario: " + getUsuario() + "\n";
        prestamo += "- Inicio: " + getInicio_prestamo() + "\n";
        prestamo += "- Final: " + getFinal_prestamo() + "\n";
        return prestamo;
    }
}
