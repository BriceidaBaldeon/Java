package ejerciciosVariables;

import java.util.Scanner;

//Calcule el área de un rectángulo de 5 metros de ancho por 10 metros de largo.
// Luego imprima en la consola el resultado.
// Use la siguiente fórmula para calcular el área de un rectángulo: area = ancho * largo
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el ancho del rectángulo: ");
        float ancho = sc.nextFloat();

        System.out.print("Ingrese el largo del rectángulo: ");
        float largo = sc.nextFloat();

        double area = ancho * largo;

        System.out.println("El área del rectángulo es: " + area + " metros cuadrados");
    }
}
