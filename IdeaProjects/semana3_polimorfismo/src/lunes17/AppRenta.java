package lunes17;

import java.util.Scanner;

public class AppRenta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AlquilerPeliculas alquiler = new AlquilerPeliculas();


        // Instanciar varias películas
        Pelicula pelicula1 = new Pelicula("Inception", 1, "Christopher Nolan", 148, "PG-13", "Ciencia Ficción");
        Pelicula pelicula2 = new Pelicula("Titanic", 2, "James Cameron", 195, "PG-13", "Romance");
        Pelicula pelicula3 = new Pelicula("The Matrix", 3, "Lana Wachowski, Lilly Wachowski", 136, "R", "Acción");

        // Añadir películas a la colección de ítems del alquiler de renta
        alquiler.agregarArticulo(pelicula1);
        alquiler.agregarArticulo(pelicula2);
        alquiler.agregarArticulo(pelicula3);

        // Registrar clientes en el alquiler
        Cliente cliente1 = new Cliente(101, "Juan Pérez");
        Cliente cliente2 = new Cliente(102, "María López");

        alquiler.registrarCliente(cliente1);
        alquiler.registrarCliente(cliente2);

        // Interfaz de consola
        while (true) {
            System.out.println("\n--- Sistema de Alquiler de Películas ---");
            System.out.println("1. Rentar película");
            System.out.println("2. Devolver película");
            System.out.println("3. Mostrar detalles de películas");
            System.out.println("4. Mostrar detalles de clientes");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese ID del cliente: ");
                    int idClienteAlquiler = scanner.nextInt();
                    System.out.print("Ingrese ID de la película: ");
                    int idPeliculaAlquiler = scanner.nextInt();
                    alquiler.prestarPelicula(idPeliculaAlquiler, idClienteAlquiler);
                    break;
                case 2:
                    System.out.print("Ingrese ID del cliente: ");
                    int idClienteDevolucion = scanner.nextInt();
                    System.out.print("Ingrese ID de la película: ");
                    int idPeliculaDevolucion = scanner.nextInt();
                    alquiler.devolverArticulo(idPeliculaDevolucion, idClienteDevolucion);
                    break;
                case 3:
                    System.out.println("\n--- Películas Disponibles ---");
                    for (ArticuloAlquiler articulo : alquiler.getArticulos()) { // Usa el getter correspondiente
                        articulo.mostrarDetalles();
                    }
                    break;
                case 4:
                    System.out.println("\n--- Clientes Registrados ---");
                    for (Cliente cliente : alquiler.getClientes()) { // Usa el getter correspondiente
                        cliente.mostrarDetallesCliente();
                    }
                    break;
                case 5:
                    System.out.println("Saliendo del sistema...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        }

    }
}
