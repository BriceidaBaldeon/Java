package miercoles;

public class Estudiante extends Persona{
    private float promedio;

    public Estudiante() {
    }

    public Estudiante(float promedio) {
        this.promedio = promedio;
    }

    public Estudiante(String nombre, String apellido, int edad, float promedio) {
        super(nombre, apellido, edad);
        this.promedio = promedio;
    }

    public float getPromedio() {
        return promedio;
    }

    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }

    public void mostrarInfoEstudiante() {
        System.out.println("° El estudiante " + getNombre() + " tiene un promedio de " + promedio);
    }
}
