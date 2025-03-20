package clasesAbstractas;
import java.lang.module.FindException;
import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Ingrese el color del triángulo: ");
        String color = scanner.next();

        System.out.print("Ingrese la altura del triángulo: ");
        float altura = scanner.nextFloat();

        System.out.print("Ingrese la base del triángulo: ");
        float base = scanner.nextFloat();


        Triangulo triangulo = new Triangulo(color, altura, base);


        System.out.println("El área del triángulo es: " + triangulo.area());
        System.out.println("El perímetro del triángulo es: " + triangulo.perimetro());
        triangulo.printColor();

    }

}