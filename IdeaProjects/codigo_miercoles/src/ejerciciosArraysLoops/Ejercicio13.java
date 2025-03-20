package ejerciciosArraysLoops;

//Crea un programa que imprima la tabla de multiplicar del 1 al 10.
public class Ejercicio13 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Tabla del " + i);
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%d x %d = %d" +
                        "\n", i, j, (i * j));
            }
            System.out.println(); // Espacio entre tablas
        }
    }
}
