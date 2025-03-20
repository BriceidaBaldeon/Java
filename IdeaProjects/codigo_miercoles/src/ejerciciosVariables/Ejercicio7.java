package ejerciciosVariables;

//Calcule el área de un cuadrado de 5 metros de lado.
//        Luego imprima en la consola el resultado.
//        Use la siguiente fórmula para calcular el área de un cuadrado: area = lado * lado

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el valor del lado del cuadrado: ");
        double lado = sc.nextDouble();

        double area = lado * lado;

        System.out.println("El área del cuadrado es: " + area);
    }
}
