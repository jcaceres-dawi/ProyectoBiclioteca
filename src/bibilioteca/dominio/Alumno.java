package bibilioteca.dominio;

public class Alumno extends Usuario {

    private final int membresia;

    public Alumno(String nombre, String dni, String telefono) {
        super(nombre, dni, telefono);
        this.membresia = 10;
    }

    @Override
    public int getMembresia() {
        return membresia;
    }

}
