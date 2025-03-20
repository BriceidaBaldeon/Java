package ejercicios;

public class Ejercicio5 {
    //Números del 1 al 100 excepto múltiplos de 3
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
