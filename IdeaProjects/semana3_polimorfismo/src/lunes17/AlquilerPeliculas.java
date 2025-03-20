package lunes17;

import java.util.ArrayList;
import java.util.Objects;

//Representa el sistema de renta de películas
// y maneja todos los ítems de renta.
public class AlquilerPeliculas {
    private ArrayList<ArticuloAlquiler> articulos;
    private ArrayList<Cliente> clientes;


    public AlquilerPeliculas() {
        this.articulos = new ArrayList<>(); // Inicialización correcta
        this.clientes = new ArrayList<>(); // Inicialización correcta
    }

    public ArrayList<ArticuloAlquiler> getArticulos() {
        return articulos;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    //agregar articulos
    public void agregarArticulo(ArticuloAlquiler articulo) {
        articulos.add(articulo);
    }

    //registrar clientes
    public void registrarCliente(Cliente cliente) {
   clientes.add(cliente);
    }

    //***************************************************

    //alquilar o prestar pelicula
    public boolean prestarPelicula(int idArticulo, int idCliente) {
        Cliente clienteEncontrado = buscarUsuario(idCliente);
        ArticuloAlquiler articuloEncontrado = buscarArticulo(idArticulo);

        if (Objects.isNull(clienteEncontrado) || Objects.isNull(articuloEncontrado)) {
            System.out.println("Usuario o artículo no presente");
            return false;
        }

        //verificamos si el articulo esta disponible
        if (articuloEncontrado.isDisponible()) {
            System.out.println("Alquiler realizado con éxito");
            clienteEncontrado.agregarPelicula((Pelicula) articuloEncontrado);
            articuloEncontrado.setDisponible(false);
            return true;
        } else {
            System.out.println("Artículo no disponible");
            return false;
        }
    }


    //devolver o retornar pelicula
    public boolean devolverArticulo(int idArticulo, int idCliente) {
        Cliente clienteEncontrado = buscarUsuario(idCliente);
        ArticuloAlquiler articuloEncontrado = buscarArticulo(idArticulo);

        if (Objects.isNull(clienteEncontrado) || Objects.isNull(articuloEncontrado)) {
            System.out.println("Cliente o artículo no presente");
            return false;
        }

        //verificamos si el articulo esta disponible
        if (clienteEncontrado.devolverPelicula(articuloEncontrado)) {
            articuloEncontrado.setDisponible(true);
            System.out.println("Devolución realizada con éxito");
            return true;
        } else {
            System.out.println("El cliente no tiene alquilado este artículo");
            return false;
        }

    }


    //****************METODOS DE BUSQUEDA****************************************
    // Buscar un cliente
    private Cliente buscarUsuario(int idCliente) {
        for (Cliente cliente : clientes) {
            if (cliente.getIdCliente() == idCliente) {
                return cliente;
            }
        }
        return null; // Si no se encuentra el usuario
    }

    // Buscar un artículo
    private ArticuloAlquiler buscarArticulo(int idArticulo) {
        for (ArticuloAlquiler articulo : articulos) {
            if (articulo.getIdArticulo() == idArticulo) {
                return articulo;
            }
        }
        return null; // Si no se encuentra el artículo
    }

}
