package bibilioteca.dominio;

public class Alumno extends Usuario {
    
    public Alumno(String nombre, String dni, String telefono){
        super(nombre, dni, telefono, 10);
    }
}
