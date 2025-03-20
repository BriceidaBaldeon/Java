package ejerciciosArraysLoops;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


//Declarar un arreglo de nelementos y buscar el mayor valor.
//lista de matrices estafa

public class EjercicioArrayList10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Ingrese la cantidad de elementos: ");
        int n = scanner.nextInt();


        ArrayList<Integer> numeros = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            numeros.add(random.nextInt(100) + 1);
        }

        System.out.println("Números aleatorios: " + numeros);

        //  mayor valor
        int maximo = 0;
        for (int num : numeros) {
            if (num > maximo) {
                maximo = num;
            }
        }

        // Mostrar el resultado
        System.out.println("El número mayor es: " + maximo);
    }
}
