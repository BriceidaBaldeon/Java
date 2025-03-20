package ejerciciosCondicionales;

//
//Para un número entero n, determinar si es múltiplo de 3 o de 5.
//En caso de ser múltiplo de 3, imprimir "Múltiplo de 3",
//en caso de ser múltiplo de 5, imprimir "Múltiplo de 5",
//en caso de ser múltiplo de ambos, imprimir "Múltiplo de 3 y 5",
//en caso de no ser múltiplo de ninguno, imprimir "No es múltiplo de 3 ni de 5".


import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero =sc.nextInt();

        if (numero % 3 == 0 && numero % 5 == 0) {
            System.out.println("Múltiplo de 3 y 5");
        } else if (numero % 3 == 0) {
            System.out.println("Múltiplo de 3");
        } else if (numero % 5 == 0) {
            System.out.println("Múltiplo de 5");
        } else {
            System.out.println("No es múltiplo de 3 ni de 5");
        }
    }
}
