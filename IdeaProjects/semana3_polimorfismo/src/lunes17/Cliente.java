package lunes17;

import java.util.ArrayList;

//Representa a un cliente del sistema de renta.
import java.util.ArrayList;

public class Cliente {
    private int idCliente;
    private String nombre;
    private ArrayList<Pelicula> peliculasAlquiladas;

    public Cliente() {
    }

    public Cliente(int idCliente, String nombre) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.peliculasAlquiladas = new ArrayList<>();
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Pelicula> getPeliculasAlquiladas() {
        return peliculasAlquiladas;
    }

    public void setPeliculasAlquiladas(ArrayList<Pelicula> peliculasAlquiladas) {
        this.peliculasAlquiladas = peliculasAlquiladas;
    }

    public void agregarPelicula(Pelicula pelicula) {
        peliculasAlquiladas.add(pelicula);
    }

    public boolean devolverPelicula(ArticuloAlquiler articuloAlquiler) {
        return peliculasAlquiladas.remove(articuloAlquiler);
    }

    public void mostrarDetallesCliente() {
        System.out.println("Cliente: " + getNombre()
                + " (ID: " + idCliente + ")");
        System.out.println("Películas rentadas:");
        for (Pelicula pelicula : peliculasAlquiladas) {
            System.out.println("- " + pelicula.getNombreArticulo());
        }
    }


}

