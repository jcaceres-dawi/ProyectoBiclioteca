package bibilioteca.main;

import bibilioteca.dominio.Alumno;
import bibilioteca.dominio.Genero;
import bibilioteca.dominio.Libro;
import bibilioteca.dominio.Prestamo;
import bibilioteca.dominio.Profesor;
import bibilioteca.dominio.Revista;

public class Main {
    public static void main(String[] args) {
        Libro ImperioFinal = new Libro("El Imperio Final", "Brandon Sanderson", Genero.FANTASIA, 2006);
        Libro PozoAscension = new Libro("EL Pozo De La Ascensión ", "Brandon Sanderson", Genero.FANTASIA, 2007);
        Revista RollingStone = new Revista("Rolling Stone", 2024);

        /*
         * System.out.println(ImperioFinal.toString());
         * System.out.println(PozoAscension.toString());
         */

        Alumno Juan = new Alumno("Juan", "12345678A", "123 45 67 89");
        System.out.println(Juan.toString());

        Profesor Xisco = new Profesor("Xisco", "87654321Z", "987 65 43 21");
        System.out.println(Xisco.toString());

        Juan.prestarArticulo(ImperioFinal);
        Juan.prestarArticulo(PozoAscension);
        Juan.prestarArticulo(RollingStone);
        System.out.println(Juan.getArticulos());

        Prestamo P1 = new Prestamo(ImperioFinal, Juan, "14/04/2024", "14/05/2024");
        System.out.println(P1.getFinal_prestamo());

        P1.actualizarFinal_prestamo("31/05/2024");
        System.out.println(P1.getFinal_prestamo());

        System.out.println(P1.toString());
        P1.regitrar_prestamo();

        Prestamo P2 = new Prestamo(PozoAscension, Juan, "17/04/2024", "17/05/2024");
        P2.regitrar_prestamo();

        Prestamo P3 = new Prestamo(RollingStone, Xisco, "21/04/2024", "21/05/2024");
        P3.regitrar_prestamo();
    }
}
