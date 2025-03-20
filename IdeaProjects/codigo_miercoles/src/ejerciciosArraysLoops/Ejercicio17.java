package ejerciciosArraysLoops;

import java.util.Scanner;

//Dada una matriz de nx melementos. Debes encontrar el valor máximo de la matriz.


public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el número de filas (n): ");
        int n = sc.nextInt();
        System.out.print("Ingrese el número de columnas (m): ");
        int m = sc.nextInt();

        int[][] matriz = new int[n][m];
        int maximo = Integer.MIN_VALUE;

        System.out.println("Ingrese los elementos de la matriz:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matriz[i][j] = sc.nextInt();
                if (matriz[i][j] > maximo) {
                    maximo = matriz[i][j];
                }
            }
        }

        System.out.println("El valor máximo de la matriz es: " + maximo);
    }
}
