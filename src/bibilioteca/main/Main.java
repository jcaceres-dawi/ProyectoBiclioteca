package bibilioteca.main;

import bibilioteca.dominio.Libro;
import bibilioteca.dominio.Usuario;

public class Main {
    public static void main(String[] args) {
        Libro ImperioFinal = new Libro("El Imperio Final", "Brandon Sanderson", "Fantasía", 2006);
        Libro PozoAscension = new Libro("EL Pozo De La Ascensión ", "Brandon Sanderson", "Fantasía", 2007);

     /*    System.out.println(ImperioFinal.toString());
        System.out.println(PozoAscension.toString()); */

        Usuario Juan = new Usuario("Juan", "12345678A", "123 45 67 89");
       /*  System.out.println(Juan.toString()); */

        Juan.prestarLibro(ImperioFinal);
        System.out.println(Juan.getLibros());
    }
}
