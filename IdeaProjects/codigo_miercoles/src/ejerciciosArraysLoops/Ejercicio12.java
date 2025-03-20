package ejerciciosArraysLoops;

import java.util.Scanner;

//Crea un programa que cuente cuantas veces aparece una letra específica en una cadena.


public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una cadena: ");
        String cadena = scanner.nextLine();

        System.out.print("Ingrese la letra a buscar: ");
        char letra = scanner.next().charAt(0);

        int contador = 0;
        for (char c : cadena.toCharArray()) {
            if (c == letra) {
                contador++;
            }
        }

        System.out.println("La letra '" + letra + "' aparece " + contador + " veces.");
    }
}
