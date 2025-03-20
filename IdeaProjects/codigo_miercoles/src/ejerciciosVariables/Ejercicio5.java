package ejerciciosVariables;


import java.util.Scanner;

//Calcule el área de un triángulo de 5 metros de base por 10 metros de altura.
// Luego imprima en la consola el resultado.
// Use la siguiente fórmula para calcular el área de un triángulo: area = (base * altura) / 2
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float areaTriangulo=0;

        System.out.printf("Ingrese la base:");
        float base = sc.nextFloat();

        System.out.printf("Ingrese la altura:");
        float altura = sc.nextFloat();

        areaTriangulo=(base*altura)/2;

        System.out.println("El area del triangulo es: "+areaTriangulo);
    }
}
