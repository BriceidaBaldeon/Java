package viernes;

import java.util.ArrayList;
import java.util.Objects;

//Gestiona la colección de artículos de la biblioteca.
public class Library {
    String nombre;
    ArrayList<LibraryItem> libraryItems;
    ArrayList<LibraryUser> libraryUsers;


    public Library(String nombre) {
        this.nombre = nombre;
        this.libraryItems = new ArrayList<>();
        this.libraryUsers = new ArrayList<>();
    }

    // ADDITEM : Agregar un item validando que no esté repetido
    public void addItem(int itemID, String title, boolean isDisponible) {
        for (LibraryItem item : libraryItems) {
            if (item.getItemID() == itemID) {
                System.out.println("Error: Ya existe un ítem con el ID " + itemID);
                return;
            }
        }

        LibraryItem nuevoItem = new LibraryItem(itemID,title , isDisponible);
        libraryItems.add(nuevoItem);
        System.out.println(" * Ítem agregado correctamente: " + nuevoItem.getTitle());
    }

    // AGREGAR USUARIO : Agregar un usuario validando que no esté repetido
    public boolean agregarUsuario(LibraryUser user) {

        if (buscarUsuario(user.getUserID()) != null) {//verifica que el usuario no se repita
            System.out.println("Error --> El usuario con ID " + user.getUserID() + " ya se encuentra registrado.");
            return false;
        }

        libraryUsers.add(user);
        System.out.println("Usuario agregado exitosamente: " + user.getUserName());
        return true;
    }

    //MOSTRARUSUARIOS :  Usuarios de la biblioteca
    public void mostrarUsuarios() {
        if (libraryUsers.isEmpty()) {
            System.out.println("No hay usuarios en la biblioteca.");
        }
        System.out.println("Usuarios en la biblioteca:");
        for (LibraryUser user : libraryUsers) {
            System.out.println("ID: " + user.getUserID() + ", Nombre: " + user.getUserName());
        }
    }

    //SHOWALLITEMS :  Muestra los items de la biblioteca
    public void showAllItems() {
        if (libraryItems.isEmpty()) {
            System.out.println("No hay ítems en la biblioteca.");
        } else {
            int i = 1;
            System.out.println("Lista de ítems en la biblioteca:");
            for (LibraryItem item : libraryItems) {
                System.out.println("* "+i+" "+ item.toString());
                 i++;
            }
        }
    }

    // - LOANITEM(): Prestar un ítem a un usuario.
    public boolean loanItem(int idItem, int idUser) {
        LibraryUser userFound = buscarUsuario(idUser);
        LibraryItem libraryItem = buscarItem(idItem);

        if (Objects.isNull(userFound) || Objects.isNull(libraryItem)) {    // Verificar si el usuario o el ítem no existen
            System.out.println("Usuario o item no presente");
            return false;
        }

        if (libraryItem.isDisponible()) {  // Verificar disponibilidad del ítem
            System.out.println("Préstamo realizado con éxito");
            userFound.addItem(libraryItem);
            libraryItem.setDisponible(false); // Cambia estado del libro a false porque ya esta prestado
            return true;
        } else {
            System.out.println("Item no disponible");
            return false;
        }
    }

    // -  RETURNITEM(): Devolver un artículo a la biblioteca.*
    public boolean returnItem(int idItem, int idUser) {
        LibraryUser userFound = buscarUsuario(idUser);
        LibraryItem libraryItem = buscarItem(idItem);

        if (Objects.isNull(userFound) || Objects.isNull(libraryItem)) {         // Verificar si el usuario o el ítem no existen
            System.out.println("Usuario o item no presente");
            return false;
        }

        if (libraryItem.isDisponible()) { // Verificar disponibilidad del ítem
            System.out.println("Préstamo realizado con éxito");
            userFound.addItem(libraryItem);
            libraryItem.setDisponible(true); // Cambia estado del libro a true porque ya esta disponible en la biblioteca
            return true;
        } else {
            System.out.println("Item no disponible");
            return false;
        }
    }

    //******** ELIMINAR ITEM --> el item no esta prestado para ser eliminado
    public boolean eliminarElemento(int idItem) {
        LibraryItem itemEncontrado = buscarItem(idItem);

        if (Objects.isNull(itemEncontrado)) {//valida que el item se encuentre en la biblioteca
            System.out.println("El artículo no existe en la biblioteca.");
            return false;
        }

        if (!itemEncontrado.isDisponible()) {//disponibilidad
            System.out.println("No se puede eliminar el artículo porque está prestado.");
            return false;
        }

        libraryItems.remove(itemEncontrado);
        System.out.println("Artículo eliminado con éxito.");
        return true;
    }

    //******* ELIMINAR USUARIO --> el usuario no debe tener articulo prestado para ser eliminado
    public boolean eliminarUsuario(int idUsuario) {
        LibraryUser usuarioEncontrado = buscarUsuario(idUsuario);

        if (Objects.isNull(usuarioEncontrado)) {//verifica si el usuario existe
            System.out.println("El usuario no se encuentra registrado en la biblioteca.");
            return false;
        }

        if (!usuarioEncontrado.getLibraryItems().isEmpty()) {//valida que el usuario no tenga articulos prestados
            System.out.println("No se puede eliminar el usuario porque tiene artículos prestados.");
            return false;
        }

        libraryUsers.remove(usuarioEncontrado);//elimina el usuario
        System.out.println("Usuario eliminado con éxito.");
        return true;
    }

    //*********************METODOS DE BUSQUEDA ********************//
    //Busqueda user
    private LibraryUser buscarUsuario(int idUser) {
        for (LibraryUser user : libraryUsers) {
            if (user.getUserID() == idUser) {
                return user;
            }
        }
        return null; // Usuario no encontrado
    }

    //Busqueda item
    private LibraryItem buscarItem(int idItem) {
        for (LibraryItem item : libraryItems) {
            if (item.getItemID() == idItem) {
                return item;
            }
        }
        return null; // Artículo no encontrado
    }

}
