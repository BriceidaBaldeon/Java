package poo.ejercicio1;

//Ejercicio 1
//Crea una clase Dogcon los siguientes atributos:
//
//breed de tipoString
//age de tipoint
//colorde tipoString
public class Dog {
    private String breed="";
    private String color="";
    private int age=0;

    public Dog() {
    }

    public Dog(String breed, String color, int age) {
        this.breed = breed;
        this.color = color;
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static String descripcionMascota(Dog perro) {
        return "La raza del perro es: " + perro.getBreed() + "\n" +
                "Color: " + perro.getColor() + "\n" +
                "Edad: " + perro.getAge() + " años";
    }
}
