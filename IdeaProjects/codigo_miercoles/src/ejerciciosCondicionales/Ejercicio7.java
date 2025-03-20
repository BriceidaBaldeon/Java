package ejerciciosCondicionales;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la temperatura en grados centígrados: ");
        int temperatura = sc.nextInt();

        if (temperatura < 0) {
            System.out.println("Congelado");
        } else if (temperatura >= 0 && temperatura <= 10) {
            System.out.println("Muy frío");
        } else if (temperatura <= 20) {
            System.out.println("Frío");
        } else if (temperatura <= 30) {
            System.out.println("Normal");
        } else if (temperatura <= 40) {
            System.out.println("Caliente");
        } else {
            System.out.println("Muy caliente");
        }
    }
}
