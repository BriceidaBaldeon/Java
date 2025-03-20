package ejerciciosCondicionales;

import java.util.Scanner;

//Escriba un programa que reciba un año y determine si es bisiesto.
//Un año es bisiesto si es divisible por 4, excepto aquellos divisibles por 100 pero no por 400.


public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un año: ");
        int anio = sc.nextInt();

        if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
            System.out.println(anio + " es un año bisiesto.");
        } else {
            System.out.println(anio + " no es un año bisiesto.");
        }
    }
}
