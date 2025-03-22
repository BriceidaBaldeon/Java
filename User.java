package viernes;

import java.util.ArrayList;

// Representa a un usuario de la biblioteca.
public class User {
    private int userID;
    private String userName;
    ArrayList<Item> Items;

    public User() {
    }

    public User(int userID, String userName) {
        this.userID = userID;
        this.userName = userName;
        this.Items = new ArrayList<>();
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

    public ArrayList<Item> getLibraryItems() {
        return Items;
    }

    public void setLibraryItems(ArrayList<Item> Items) {
        this.Items = Items;
    }

    //    addItem(): Añadir nuevos elementos a la biblioteca.
    public void addItem(Item item)
    {
        this.Items.add(item);
    }

    //    removeItem(): quitar nuevos elementos a la biblioteca.
    public boolean removeItem(Item item) {
        return Items.remove(item);
    }

    public void showDetails(){
        System.out.println(
                "El id del usuario es: "+userID
                        + "\n El nombre del usuario es: " + userName
                        + "\n La lista de los libros prestados son " + Items);
    }
}
