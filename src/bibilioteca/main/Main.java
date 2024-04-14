package bibilioteca.main;

import bibilioteca.dominio.Libro;
import bibilioteca.dominio.Prestamo;
import bibilioteca.dominio.Usuario;

public class Main {
    public static void main(String[] args) {
        Libro ImperioFinal = new Libro("El Imperio Final", "Brandon Sanderson", "Fantasía", 2006);
        Libro PozoAscension = new Libro("EL Pozo De La Ascensión ", "Brandon Sanderson", "Fantasía", 2007);

        /*
         * System.out.println(ImperioFinal.toString());
         * System.out.println(PozoAscension.toString());
         */

        Usuario Juan = new Usuario("Juan", "12345678A", "123 45 67 89");
        /* System.out.println(Juan.toString()); */

        Juan.prestarLibro(ImperioFinal);
        System.out.println(Juan.getLibros());

        Prestamo P1 = new Prestamo(ImperioFinal, Juan, "14/04/2024", "14/05/2024");
        System.out.println(P1.getFinal_prestamo());

        P1.actualizarFinal_prestamo("31/05/2024");
        System.out.println(P1.getFinal_prestamo());

        System.out.println(P1.toString());
    }
}
