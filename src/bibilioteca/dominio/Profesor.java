package bibilioteca.dominio;

public class Profesor extends Usuario {

    public Profesor(String nombre, String dni, String telefono) {
        super(nombre, dni, telefono);
    }

    @Override
    public int getMembresia() {
        return 0;
    }
}
