package ejerciciosArraysLoops;

public class Ejercicio6 {
    //Imprimir los numeros del 1 al 100, excepto los multiplos de 3 y 5.
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 != 0 && i % 5 != 0) {
                System.out.printf(i + " ");
            }
        }
    }
}
