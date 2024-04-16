# Enunciado del ejercicio:

El ejercicio consiste en la implementación de un sistema de gestión de préstamos de libros para una biblioteca. El sistema incluye la definición de clases y la utilización de interfaces y clases abstractas para mejorar la modularidad y la reutilización del código.

## Clase Usuario:

- Se ha creado la clase `Usuario`, que representa a los usuarios de la biblioteca. Cada usuario tiene un nombre, un número de DNI, un número de teléfono y una lista de libros que ha tomado prestados.
- Los usuarios pueden ser de dos tipos: Alumnos y Profesores.
- Los usuarios pueden prestar y devolver libros.
- Se ha definido una membresía que varía según el tipo de usuario.

## Clase Libro:

- Se ha creado la clase `Libro`, que representa los libros disponibles en la biblioteca. Cada libro tiene un título, un autor, un género, un año de publicación y un estado de préstamo que indica si el libro está prestado o no.
- Se ha implementado la interfaz `Prestable`, que define los métodos `prestar()` y `devolver()`. La clase `Libro` implementa esta interfaz para permitir el préstamo y la devolución de libros.
- Se ha sobrescrito el método `toString()` para proporcionar una representación en forma de cadena de texto de un libro.

## Clase Prestamo:

- Se ha creado la clase `Prestamo`, que representa un préstamo de un libro a un usuario. Cada préstamo contiene información sobre el libro prestado, el usuario que lo tomó prestado, la fecha de inicio del préstamo y la fecha de devolución prevista.
- Se ha implementado el método `actualizarFinal_prestamo()` para permitir la actualización de la fecha de devolución prevista de un préstamo.
- Se ha sobrescrito el método `toString()` para proporcionar una representación en forma de cadena de texto de un préstamo.

## Clase Profesor:

- Se ha creado la clase `Profesor`, que representa a los profesores que pueden utilizar la biblioteca.

## Clase Alumno:

- Se ha creado la clase `Alumno`, que representa a los alumnos que pueden utilizar la biblioteca.

El sistema permite la gestión de usuarios, libros y préstamos, facilitando así el control de los recursos de la biblioteca y mejorando la experiencia de los usuarios al interactuar con la biblioteca.
