package ejerciciosVariables;

import java.util.Scanner;

//La conversion de dolares a sol se puede hacer multiplicando la cantidad de dolares
//por el tipo de cambio.
//Por ejemplo, para convertir 50 dolares a soles, el cálculo sería 50 * 3.5 = 175.
//Escriba un programa que permita al usuario ingresar la cantidad de dolares que desea
//convertir a soles y luego imprima en la consola el resultado.
public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de dólares a convertir: ");
        double dolares = sc.nextDouble();

        double tipoCambio = 3.65;
        double soles = dolares * tipoCambio;

        System.out.println("La cantidad de soles es: " + soles);
    }
}
