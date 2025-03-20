package lunes17;

//Representa una película disponible para renta.
public class Pelicula extends ArticuloAlquiler{
    private String director;
    private int duracion;
    private String clasificacion;
    private String genero;

    public Pelicula() {
    }

    public Pelicula(String nombreArticulo, int idArticulo, String director, int duracion, String clasificacion, String genero) {
        super(nombreArticulo, idArticulo);
        this.director = director;
        this.duracion = duracion;
        this.clasificacion = clasificacion;
        this.genero = genero;
    }

    public String getDirector() {
        return director;
    }

    public int getDuracion() {
        return duracion;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public String getGenero() {
        return genero;
    }

    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Director: " + director
                + ", Duración: " + duracion
                + " min, Clasificación: " + clasificacion
                + ", Género: " + genero);
    }
}

