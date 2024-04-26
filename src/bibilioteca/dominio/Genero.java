package bibilioteca.dominio;

public enum Genero {
    FICCION,
    NOVELA,
    TERROR,
    CIENCIA_FICCION,
    FANTASIA,
    DRAMA,
    POESIA,
    ENSAYO,
    HISTORIA,
    OTRO;

    public static void imprimirGeneros() {
        System.out.println("Géneros disponibles:");
        for (Genero genero : Genero.values()) {
            System.out.println((genero.ordinal() + 1) + ". " + genero.name());
        }
    }
}
