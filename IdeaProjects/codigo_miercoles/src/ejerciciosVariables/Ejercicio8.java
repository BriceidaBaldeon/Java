package ejerciciosVariables;

//La temperatura en grados Fahrenheit se puede
//convertir a grados Celsius restando 32 y multiplicando por 5/9.
//        Por ejemplo, para convertir 50 grados Fahrenheit a grados Celsius,
//el cálculo sería (50-32) * 5/9 = 10. Imprime en la consola el
//resultado de convertir 290 grados Fahrenheit a grados Celsius.


import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.printf("Ingrese la temperatura en grados Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        double celsius = (fahrenheit - 32) * 5.0 / 9.0;

        System.out.println("La temperatura en grados Celsius es: " + celsius);
    }
}
