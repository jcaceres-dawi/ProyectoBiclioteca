# Enunciado del Proyecto de Biblioteca

El proyecto tiene como objetivo desarrollar un sistema de gestión para una biblioteca, permitiendo registrar préstamos de libros y revistas, dar de alta nuevos usuarios y artículos en el catálogo de la biblioteca, y registrar la información de los préstamos realizados.

## Clases y Funcionalidades

### Clase Usuario:

- Se ha creado la clase `Usuario`, que representa a los usuarios de la biblioteca. Cada usuario tiene un nombre, un número de DNI, un número de teléfono y una lista de artículos que ha tomado prestados.
- Los usuarios pueden ser de dos tipos: Alumnos y Profesores.
- Los usuarios pueden prestar y devolver artículos.
- Se ha definido una membresía para los usuarios, con diferenciación entre alumnos y profesores.

### Clase Articulo:

- Se ha creado la clase `Articulo`, que representa los artículos disponibles en la biblioteca. Cada artículo tiene un título, un año de publicación y un estado de préstamo que indica si el artículo está prestado o no.
- Se ha implementado la interfaz `Prestable`, que define los métodos `prestar()` y `devolver()`. La clase `Articulo` implementa esta interfaz para permitir el préstamo y la devolución de artículos.

### Clase Libro:

- Se ha creado la clase `Libro`, que representa los libros disponibles en la biblioteca. Cada libro tiene un autor, un género (representado como un enum), y extiende la clase `Articulo`.
- Se ha sobrescrito el método `toString()` para proporcionar una representación en forma de cadena de texto de un libro.

### Clase Revista:

- Se ha creado la clase `Revista`, que representa las revistas disponibles en la biblioteca, y extiende la clase `Articulo`.
- Se ha sobrescrito el método `toString()` para proporcionar una representación en forma de cadena de texto de una revista.

### Clase Prestamo:

- Se ha creado la clase `Prestamo`, que representa un préstamo de un artículo a un usuario. Cada préstamo contiene información sobre el artículo prestado, el usuario que lo tomó prestado, y la fecha de inicio y fin del préstamo.
- Se ha implementado el método `actualizarFinal_prestamo()` para permitir la actualización de la fecha de devolución prevista de un préstamo.

## Clases Alumno y Profesor:

- Se han creado las clases `Alumno` y `Profesor`, que representan a los usuarios de tipo alumno y profesor, respectivamente.

El sistema permite la gestión de usuarios, artículos y préstamos en la biblioteca, proporcionando un entorno organizado y eficiente para el control de los recursos y la experiencia de los usuarios al interactuar con la biblioteca.
