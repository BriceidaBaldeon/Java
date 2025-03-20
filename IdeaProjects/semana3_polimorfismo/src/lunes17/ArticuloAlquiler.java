package lunes17;

//Clase base para ítems en el sistema de renta.
public class ArticuloAlquiler {
    private String nombreArticulo;
    private int idArticulo;
    private boolean isDisponible;

    public ArticuloAlquiler() {
    }

    public ArticuloAlquiler(String nombreArticulo, int idArticulo) {
        this.nombreArticulo = nombreArticulo;
        this.idArticulo = idArticulo;
        this.isDisponible = true;
    }

    public String getNombreArticulo() {
        return nombreArticulo;
    }

    public void setNombreArticulo(String nombreArticulo) {
        this.nombreArticulo = nombreArticulo;
    }

    public int getIdArticulo() {
        return idArticulo;
    }

    public void setIdArticulo(int idArticulo) {
        this.idArticulo = idArticulo;
    }

    public boolean isDisponible() {
        return isDisponible;
    }

    public void setDisponible(boolean disponible) {
        this.isDisponible = disponible;
    }

    public void mostrarDetalles() {
        System.out.println("- Artículo: " + nombreArticulo
                + "\n- ID: " + idArticulo
                + "\n- Disponible: " + isDisponible);
    }
}
