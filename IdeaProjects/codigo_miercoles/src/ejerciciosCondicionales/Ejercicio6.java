package ejerciciosCondicionales;

import java.util.Scanner;

//Escriba un programa que determine la elegibilidad para la admision a un programa
//universitario basado en el siguiente criterio:
//Nota en matemáticas mayor o igual a 65.
//Nota en física mayor o igual a 55.
//Nota en química mayor o igual a 50.
//O el total de las notas en física y matemáticas debe ser mayor o igual a 140.
//El programa debe imprimir "Admitido" si el estudiante cumple
//con los requisitos, en caso contrario, debe imprimir "No admitido".
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la nota en Matemáticas: ");
        int matematicas = sc.nextInt();

        System.out.print("Ingrese la nota en Física: ");
        int fisica = sc.nextInt();

        System.out.print("Ingrese la nota en Química: ");
        int quimica = sc.nextInt();

        if ((matematicas >= 65 && fisica >= 55 && quimica >= 50) ||
                (matematicas + fisica >= 140)) {
            System.out.println("Admitido");
        } else {
            System.out.println("No admitido");
        }
    }
}
