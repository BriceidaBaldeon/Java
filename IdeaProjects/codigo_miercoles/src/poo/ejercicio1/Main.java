package poo.ejercicio1;


import poo.Persona;

//Cree un constructor que reciba los tres atributos y los asigne a los atributos de la clase.
//Crear una clase Main con un metodo
// que crea un objeto de tipo Doge imprime sus atributos.
public class Main {
    public static void main(String[] args) {
        Dog perro = new Dog("Labrador", "Negro", 3);


        perro.setBreed("Pitbull");
        perro.setAge(8);
        perro.setColor("Blanco");

        // Imprimir los atributos del perro
        System.out.println("La raza del perro es: " + perro.getBreed());
        System.out.println("Color: " + perro.getColor());
        System.out.println("Edad: " + perro.getAge() + " años");

        // Imprimir los atributos del perro
        System.out.println(Dog.descripcionMascota(perro));
    }

}
