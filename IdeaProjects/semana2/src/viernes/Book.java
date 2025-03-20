package viernes;


//Representa un libro en la biblioteca.
public class Book extends LibraryItem{
    private String author;

    public Book() {
    }

    public Book(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void showDetails(){
        super.showDetails();
        System.out.println(
                "El nombre del author es "+this.author
                        + "\n El titulo del libro es: " + getTitle()
                        + "\n Id es: " + getItemID()
        );
    }
}
