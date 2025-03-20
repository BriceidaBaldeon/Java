package ejerciciosArraysLoops;

//Encuentras una matriz de n x m elementos.
//Cada elemento de la matriz es un número entero
//positivo uno consecutivo del anterior.
//De acuerdo a la forma en que se encuentran los elementos
//tendremos dos tipos de enumeración:


import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el número de filas (n): ");
        int n = sc.nextInt();
        System.out.print("Ingrese el número de columnas (m): ");
        int m = sc.nextInt();

        int[][] matrizFilas = new int[n][m];
        int[][] matrizColumnas = new int[n][m];

        //  fila
        int num = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrizFilas[i][j] = num++;
            }
        }

        // columna
        num = 1;
        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n; i++) {
                matrizColumnas[i][j] = num++;
            }
        }

        // imprimir
        System.out.println("\nMatriz por FILAS:");
        imprimirMatriz(matrizFilas);

        System.out.println("\nMatriz por COLUMNAS:");
        imprimirMatriz(matrizColumnas);

        sc.close();
    }

    // mostramos la matriz
    public static void imprimirMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int num : fila) {
                System.out.printf("%4d", num);
            }
            System.out.println();
        }
    }
    }

