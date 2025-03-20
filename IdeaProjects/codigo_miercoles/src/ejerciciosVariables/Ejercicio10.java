package ejerciciosVariables;

import java.util.Scanner;

//Ahora realice el ejercicio 9 pero permitiendo
// al usuario ingresar el tipo de cambio.
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de dólares a convertir: ");
        float dolares = sc.nextFloat();

        System.out.print("Ingrese el tipo de cambio: ");
        float tipoCambio = sc.nextFloat();

        float soles = dolares * tipoCambio;

        System.out.println("La cantidad de soles es: " + soles);

    }
}
