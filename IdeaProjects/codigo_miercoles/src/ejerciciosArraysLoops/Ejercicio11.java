package ejerciciosArraysLoops;

import java.util.Scanner;

//Buscar un valor en el arreglo
public class Ejercicio11 {
    public static void main(String[] args) {
        int[] arreglo = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número a buscar: ");
        int numero = scanner.nextInt();
        boolean encontrado = false;

        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == numero) {
                System.out.println("Número encontrado en la posición: " + i);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("No encontrado");
        }

    }
}
