package viernes;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppLibrary {
    public static void main(String[] args) {
        Library biblioteca = new Library("Sistema Biblioteca");
        Scanner scanner = new Scanner(System.in);


//         Crear el nuevo ítem y agregarlo a la lista
//        biblioteca.addItem("1984", 1, true);
//        biblioteca.addItem("Orgullo y Prejuicio", 2, false);
//        biblioteca.showAllItems();
        int opcion;
        do {
            System.out.println("\n--- Menú ---");
            System.out.println("1. Agregar usuario");
            System.out.println("2. Agregar ítem");
            System.out.println("3. Mostrar usuarios");
            System.out.println("4. Mostrar ítems");
            System.out.println("5. Realizar préstamo");
            System.out.println("6. Realizar devolución");
            System.out.println("7. Eliminar usuario");
            System.out.println("8. Eliminar ítem");
            System.out.println("9. Salir");
            System.out.print("Ingrese la opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el ID del usuario: ");
                    int userId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Ingrese el nombre del usuario: ");
                    String userName = scanner.nextLine();
                    biblioteca.agregarUsuario(new LibraryUser(userId, userName));
                    break;
                case 2:
                    System.out.println("Seleccione el tipo de ítem:");
                    System.out.println("1. Libro");
                    System.out.println("2. DVD");
                    int tipoItem = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Ingrese el ID del ítem: ");
                    int itemId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Ingrese el título del ítem: ");
                    String title = scanner.nextLine();

                    System.out.print("¿Está disponible? (Sí/No): ");
                    String disponibilidadInput = scanner.nextLine().trim().toLowerCase();
                    boolean isDisponible = disponibilidadInput.equals("sí") || disponibilidadInput.equals("si");

                    if (tipoItem == 1) {
                        System.out.print("********LIBRO*********");
                        System.out.print("\nIngrese el autor: ");
                        String autor = scanner.nextLine();
                        System.out.print("Ingrese el número de páginas: ");
                        int numPaginas = scanner.nextInt();
                        scanner.nextLine();

                        LibraryItem nuevoLibro = new Book(autor);
                        biblioteca.addItem(itemId,title,isDisponible);

                    } else if (tipoItem == 2) {
                        System.out.print("********DVD*********");
                        System.out.print("Ingrese el director: ");
                        String director = scanner.nextLine();
                        System.out.print("Ingrese la duración en minutos: ");
                        short duracion = scanner.nextShort();
                        LibraryItem nuevoDVD = new DVD(itemId, title, true, director, duracion);
                        biblioteca.libraryItems.add(nuevoDVD);
                        System.out.println("DVD agregado exitosamente.");
                    } else {
                        System.out.println("Opción inválida. No se agregó ningún ítem.");
                    }
                    break;
                case 3:
                    biblioteca.mostrarUsuarios();
                    break;
                case 4:
                    biblioteca.showAllItems();
                    break;
                case 5:
                    System.out.print("Ingrese el ID del usuario: ");
                    int userIdPrestamo = scanner.nextInt();
                    System.out.print("Ingrese el ID del ítem: ");
                    int itemIdPrestamo = scanner.nextInt();
                    biblioteca.loanItem(itemIdPrestamo, userIdPrestamo);
                    break;
                case 6:
                    System.out.print("Ingrese el ID del usuario: ");
                    int userIdDevolucion = scanner.nextInt();
                    System.out.print("Ingrese el ID del ítem: ");
                    int itemIdDevolucion = scanner.nextInt();
                    biblioteca.returnItem(itemIdDevolucion, userIdDevolucion);
                    break;
                case 7:
                    System.out.print("Ingrese el ID del usuario a eliminar: ");
                    int userIdEliminar = scanner.nextInt();
                    biblioteca.eliminarUsuario(userIdEliminar);
                    break;
                case 8:
                    System.out.print("Ingrese el ID del ítem a eliminar: ");
                    int itemIdEliminar = scanner.nextInt();
                    biblioteca.eliminarElemento(itemIdEliminar);
                    break;
                case 9:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 9);

        scanner.close();
    }
}
