package ejerciciosArraysLoops;

//Como objetivo este año, te propones leer la
//mayor cantidad de libros posibles. Hoy, tienes t minutos para leer.
//Tomas n libros de la biblioteca, cada uno con un tiempo de lectura a .
//¿Cuál es la mayor cantidad de libros que puedes leer en t minutos?

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de libros: ");
        int n = sc.nextInt();

        System.out.print("Ingrese el tiempo disponible en minutos: ");
        int t = sc.nextInt();

        int[] tiempos = new int[n];

        System.out.println("Ingrese los tiempos de lectura de cada libro:");
        for (int i = 0; i < n; i++) {
            tiempos[i] = sc.nextInt();
        }

        Arrays.sort(tiempos);

        int librosLeidos = 0, tiempoUsado = 0;


        for (int tiempo : tiempos) {
            if (tiempoUsado + tiempo <= t) {
                tiempoUsado += tiempo;
                librosLeidos++;
            } else {
                break;
            }
        }

        System.out.println("La mayor cantidad de libros que puedes leer es: " + librosLeidos);
    }
}
