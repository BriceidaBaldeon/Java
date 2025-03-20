package viernes;

import java.util.ArrayList;

// Representa a un usuario de la biblioteca.
public class LibraryUser {
    private int userID;
    private String userName;
    ArrayList<LibraryItem> libraryItems;

    public LibraryUser() {
    }

    public LibraryUser(int userID, String userName) {
        this.userID = userID;
        this.userName = userName;
        this.libraryItems = new ArrayList<>();
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public ArrayList<LibraryItem> getLibraryItems() {
        return libraryItems;
    }

    public void setLibraryItems(ArrayList<LibraryItem> libraryItems) {
        this.libraryItems = libraryItems;
    }

    //    addItem(): Añadir nuevos elementos a la biblioteca.
    public void addItem(LibraryItem libraryItem)
    {
        this.libraryItems.add(libraryItem);
    }

    //    removeItem(): quitar nuevos elementos a la biblioteca.
    public boolean removeItem(LibraryItem libraryItem) {
        return libraryItems.remove(libraryItem);
    }

    public void showDetails(){
        System.out.println(
                "El id del usuario es: "+userID
                        + "\n El nombre del usuario es: " + userName
                        + "\n La lista de los libros prestados son " + libraryItems);
    }
}
