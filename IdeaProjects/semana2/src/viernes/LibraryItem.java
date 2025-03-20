package viernes;

//Clase base para artículos en la biblioteca.
public class LibraryItem {
    private int itemID;
    private String title;
    private boolean isDisponible;

    public LibraryItem() {
    }

    public LibraryItem(int itemID,String title , boolean isDisponible) {
        this.title = title;
        this.itemID = itemID;
        this.isDisponible = isDisponible;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getItemID() {
        return itemID;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    public boolean isDisponible() {
        return isDisponible;
    }

    public void setDisponible(boolean disponible) {
        isDisponible = disponible;
    }

    public void showDetails(){
        System.out.println(
                "El id del autor es: "+itemID
               + "\nEl titulo del libro es: " + title
               + "\nEl libro se encuentra disponible? " + isDisponible);
    }
}
