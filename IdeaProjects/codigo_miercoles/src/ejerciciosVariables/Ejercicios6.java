package ejerciciosVariables;

import java.util.Scanner;

//Calcule el área de un círculo de 5 metros de radio.
// Luego imprima en la consola el resultado.
// Use la siguiente fórmula para calcular el área de un círculo: area = pi * radio * radio
public class Ejercicios6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double resultado=0;

        System.out.printf("Ingrese el radio:");
        float radio = sc.nextFloat();

        resultado=Math.PI * Math.pow(radio,2);
    }
}
