package ejercicios;

public class Ejercicio10 {
    public static void main(String[] args) {
        int[] arreglo = {15, 3, 42, 7, 99, 23, 55, 88, 12, 67};
        int max = arreglo[0];
        for (int num : arreglo) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("El mayor valor es: " + max);
    }
}
