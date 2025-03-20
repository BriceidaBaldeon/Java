package ejercicios;

import com.sun.tools.javac.Main;

//Imprimir un arreglo en orden inverso
public class Ejercicio8 {
    public static void main(String[] args) {
        int[] arreglo = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        for (int i = arreglo.length - 1; i >= 0; i--) {
            System.out.print(arreglo[i] + " ");
        }
    }
}
