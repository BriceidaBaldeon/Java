package viernes;


//Representa un DVD en la biblioteca.
public class DVD extends LibraryItem{
    private String director;
    private short duration;

    public DVD() {
    }


    public DVD(int itemID,String title , boolean isDisponible, String director, short duration) {
        super(itemID ,title , isDisponible);
        this.director = director;
        this.duration = duration;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public short getDuration() {
        return duration;
    }

    public void setDuration(short duration) {
        this.duration = duration;
    }

    @Override
    public void showDetails(){
        super.showDetails();
        System.out.println(
                "El nombre del director es "+this.director
               +"\n La duracion del DVD es de "+this.duration
        );
    }
}
