package ejerciciosCondicionales;

import java.util.Scanner;

//Escriba un programa que permita calcular el porcentaje de asistencia a clases de un estudiante.
// El programa debe recibir el número de clases a las que asistió el estudiante y el número total de clases.
// El porcentaje de asistencia se calcula como el cociente entre el número de clases a las que asistió el estudiante
// y el número total de clases, multiplicado por 100. En caso de que el porcentaje sea mayor o igual a 75,
// el programa debe imprimir "Asistencia suficiente". En caso contrario, debe imprimir "Asistencia insuficiente".
public class Ejercicios9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el número total de clases: ");
        int totalClases = sc.nextInt();

        System.out.print("Ingrese el número de clases asistidas: ");
        int clasesAsistidas = sc.nextInt();

        if (totalClases == 0) {
            System.out.println("El número total de clases no puede ser 0.");
        } else {
            double porcentajeAsistencia = ((double) clasesAsistidas / totalClases) * 100;

            System.out.printf("Porcentaje de asistencia: %.2f%%\n", porcentajeAsistencia);

            if (porcentajeAsistencia >= 75) {
                System.out.println("Asistencia suficiente");
            } else {
                System.out.println("Asistencia insuficiente");
            }
        }

    }
}
