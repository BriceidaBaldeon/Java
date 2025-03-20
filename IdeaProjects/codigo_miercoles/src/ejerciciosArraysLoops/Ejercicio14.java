package ejerciciosArraysLoops;

//Dado un número entero n, realizar las siguientes operaciones:

//Si n es par, dividirlo entre 2.
//Si n es impar, multiplicarlo por 3 y sumar 1.
//Repetir el proceso hasta que n sea 1.

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número entero: ");
        int n = sc.nextInt();

        while (n != 1) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = n * 3 + 1;
            }
            System.out.println(n);
        }
    }
}
