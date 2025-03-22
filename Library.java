package viernes;

import java.util.ArrayList;
import java.util.Objects;

//Gestiona la colección de artículos de la biblioteca.
//briceida
public class Library {
    String name;
    ArrayList<Item> items;
    ArrayList<User> users;


    public Library(String name) {
        this.name = name;
        this.items = new ArrayList<>();
        this.users = new ArrayList<>();
    }

    // ADDITEM : Agregar un item validando que no esté repetido
    public void addItem(int itemID, String title, boolean isDisponible) {
        for (Item item : items) {
            if (item.getId() == itemID) {
                System.out.println("Error: Ya existe un ítem con el ID " + itemID);
                return;
            }
        }

        Item nuevoItem = new Item(itemID,title , isDisponible);
        items.add(nuevoItem);
        System.out.println(" * Ítem agregado correctamente: " + nuevoItem.getTitle());
    }

    // AGREGAR USUARIO : Agregar un usuario validando que no esté repetido
    public void addUser(User user) {

        if (searchUser(user.getUserID()) != null) {//verifica que el usuario no se repita
            System.out.println("Error --> El usuario con ID " + user.getUserID() + " ya se encuentra registrado.");
            return;
        }

        users.add(user);
        System.out.println("Usuario agregado exitosamente: " + user.getUserName());
    }

    //MOSTRARUSUARIOS :  Usuarios de la biblioteca
    public void showUsers() {
        if (users.isEmpty()) {
            System.out.println("No hay usuarios en la biblioteca.");
        }
        System.out.println("Usuarios en la biblioteca:");
        for (User user : users) {
            System.out.println("ID: " + user.getUserID() + ", Nombre: " + user.getUserName());
        }
    }

    //SHOWALLITEMS :  Muestra los items de la biblioteca
    public void showItems() {
        if (items.isEmpty()) {
            System.out.println("No hay ítems en la biblioteca.");
        } else {
            int i = 1;
            System.out.println("Lista de ítems en la biblioteca:");
            for (Item item : items) {
                System.out.println("* "+i+" "+ item.toString());
                 i++;
            }
        }
    }

    // - LOANITEM(): Prestar un ítem a un usuario.
    public boolean loanItem(int idItem, int idUser) {
        User userFound = searchUser(idUser);
        Item itemFound = searchItem(idItem);

        if (Objects.isNull(userFound) || Objects.isNull(itemFound)) {    // Verificar si el usuario o el ítem no existen
            System.out.println("Usuario o item no presente");
            return false;
        }

        if (itemFound.isAvailable()) {
            System.out.println("Préstamo realizado con éxito");
            userFound.addItem(itemFound);
            itemFound.setAvailable(false); // Cambia estado del libro a false porque ya esta prestado
            return true;
        } else {
            System.out.println("Item no disponible");
            return false;
        }
    }

    // -  RETURNITEM(): Devolver un artículo a la biblioteca.*
    public boolean returnItem(int idItem, int idUser) {
        User userFound = searchUser(idUser);
        Item item = searchItem(idItem);

        if (Objects.isNull(userFound) || Objects.isNull(item)) {
            System.out.println("Usuario o item no presente");
            return false;
        }

        if (!item.isAvailable()) {
            System.out.println("Retorno realizado con éxito");
            userFound.addItem(item);
            item.setAvailable(true); // Cambia estado del libro a true porque ya esta disponible en la biblioteca
            return true;
        } else {
            System.out.println("Nose puede devolver" +
                    "\nPorque el item se encuentra disonible en la biblioteca");
            return false;
        }
    }

    //******** ELIMINAR ITEM --> el item no esta prestado para ser eliminado
    public boolean deleteItem(int idItem) {
        Item itemFound = searchItem(idItem);

        if (Objects.isNull(itemFound)) {//valida que el item se encuentre en la biblioteca
            System.out.println("El artículo no existe en la biblioteca.");
            return false;
        }

        if (!itemFound.isAvailable()) {//disponibilidad
            System.out.println("No se puede eliminar el artículo porque está prestado.");
            return false;
        }

        items.remove(itemFound);
        System.out.println("Artículo eliminado con éxito.");
        return true;
    }

    //******* ELIMINAR USUARIO --> el usuario no debe tener articulo prestado para ser eliminado
    public boolean deleteUser(int idUsuario) {
        User userFound = searchUser(idUsuario);

        if (Objects.isNull(userFound)) {//verifica si el usuario existe
            System.out.println("El usuario no se encuentra registrado en la biblioteca.");
            return false;
        }

        if (!userFound.getLibraryItems().isEmpty()) {//valida que el usuario no tenga articulos prestados
            System.out.println("No se puede eliminar el usuario porque tiene artículos prestados.");
            return false;
        }

        users.remove(userFound);//elimina el usuario
        System.out.println("Usuario eliminado con éxito.");
        return true;
    }

    //*********************METODOS DE BUSQUEDA ********************//
    private User searchUser(int idUser) {
        for (User user : users) {
            if (user.getUserID() == idUser) {
                return user;
            }
        }
        return null;
    }

    private Item searchItem(int idItem) {
        for (Item item : items) {
            if (item.getId() == idItem) {
                return item;
            }
        }
        return null; // Artículo no encontrado
    }

}
