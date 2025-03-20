package clasesAbstractas.ejercicio;

public class Alumno extends Persona{
    private float promedio;

    public Alumno(String nombre, int edad, float promedio) {
        super(nombre, edad);
        this.promedio = promedio;
    }

    @Override
    public void printInfo() {
        System.out.println("El nombre del Alumno: " + nombre
                + "\n Edad: " + edad
                + "\n Promedio: " + promedio);
    }
}
