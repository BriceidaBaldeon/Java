package ejerciciosArraysLoops;

import java.util.Scanner;


//Tenemos 4 minutos y 4 libros para leer. Si empezamos a
// leer desde el primer libro que tiene un tiempo de 3 minutos,
// nos quedaran 1 minuto para leer el siguiente libro,
// por lo que solo podremos leer 2 libros en total.
// Si empezamos a leer desde el segundo libro que tiene un tiempo de 1 minuto,
// nos quedaran 3 minutos para leer el siguiente libro,
// al leer el libro 3 que tiene un tiempo de 2 minutos,
// nos quedaran 1 minuto para leer el siguiente libro, por lo que podremos leer 3 libros en total.


public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de libros: ");
        int n = sc.nextInt();

        System.out.print("Ingrese el tiempo disponible en minutos: ");
        int t = sc.nextInt();

        int[] tiempos = new int[n];

        System.out.println("Ingrese los tiempos de lectura de los libros:");
        for (int i = 0; i < n; i++) {
            tiempos[i] = sc.nextInt();
        }

        int maxLibros = 0;

        for (int ini = 0; ini < n; ini++) {
            int tiempoTotal = 0, librosLeidos = 0;

            for (int fin = ini; fin < n; fin++) {
                if (tiempoTotal + tiempos[fin] <= t) {
                    tiempoTotal += tiempos[fin];
                    librosLeidos++;
                } else {
                    break;
                }
            }

            maxLibros = Math.max(maxLibros, librosLeidos);
        }

        System.out.println("Máximo número de libros que puedes leer: " + maxLibros);
    }
}
