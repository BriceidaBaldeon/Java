package viernes;

//Clase base para artículos en la biblioteca.
public class Item {
    private int id;
    private String title;
    private boolean isAvailable;

    public Item() {
    }

    public Item(int id, String title , boolean isAvailable) {
        this.title = title;
        this.id = id;
        this.isAvailable = isAvailable;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }


    public void showDetails(){
        System.out.println(
                "El id del autor es: "+ id
               + "\nEl titulo del libro es: " + title
               + "\nEl libro se encuentra disponible? " + isAvailable);
    }

    @Override
    public String toString() {
        return title + ", " + id + ", " + isAvailable;
    }
}

