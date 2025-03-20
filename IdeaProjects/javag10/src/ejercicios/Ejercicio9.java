package ejercicios;

//Sumar los valores de un arreglo
public class Ejercicio9 {
    public static void main(String[] args) {
        int[] arreglo = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int suma = 0;
        for (int num : arreglo) {
            suma += num;
        }
        System.out.println("Suma total: " + suma);
    }

}
