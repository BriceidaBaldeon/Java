package clasesAbstractas.ejercicio;

public class Profesor extends Persona{
    private float salario;

    public Profesor(String nombre, int edad, float salario) {
        super(nombre, edad);
        this.salario = salario;
    }

    @Override
    public void printInfo() {
        System.out.println("El nombre del profesor es: " + nombre
                + "\n Edad: " + edad
                + "\n Salario: " + salario);
    }
}
