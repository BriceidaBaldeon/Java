import miercoles.Estudiante;
import miercoles.Profesor;

public class Main {
    public static void main(String[] args) {

        System.out.println("  ***************  Estudiante *************** " );
        Estudiante estudiante = new Estudiante("Arnold", "Cubas", 18, 16.5f);
        estudiante.mostrarInfoEstudiante();
        estudiante.saludar("Briceida");

        System.out.println("  ***************  Profesor *************** " );
        Profesor profesor=new Profesor("Max","Rivera",30,1,10,3100.50f);
        profesor.descripcionProfesor();
        profesor.saludar("Maria");

    }
}