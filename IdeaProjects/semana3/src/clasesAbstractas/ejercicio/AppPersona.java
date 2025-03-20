package clasesAbstractas.ejercicio;

import java.util.Scanner;

public class AppPersona {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("*************** Alumno ***********************");

        // alumno
        System.out.print("Ingrese el nombre del alumno: ");
        String nombreAlumno = scanner.next();

        System.out.print("Ingrese la edad del alumno: ");
        int edadAlumno = scanner.nextInt();

        System.out.print("Ingrese el promedio del alumno: ");
        float promedio = scanner.nextFloat();

        Alumno alumno = new Alumno(nombreAlumno, edadAlumno, promedio);

        System.out.println("*************** Profesor ***********************");
        // profesor
        System.out.print("Ingrese el nombre del profesor: ");
        String nombreProfesor = scanner.next();

        System.out.print("Ingrese la edad del profesor: ");
        int edadProfesor = scanner.nextInt();

        System.out.print("Ingrese el salario del profesor: ");
        float salario = scanner.nextFloat();
        Profesor profesor = new Profesor(nombreProfesor, edadProfesor, salario);

        System.out.println("*************** Datos ***********************");
        alumno.printInfo();
        profesor.printInfo();

    }
}
