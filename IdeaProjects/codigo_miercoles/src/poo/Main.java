package poo;

public class Main {
    public static void main(String[] args) {

        Persona persona1=new Persona();

        persona1.setNombre("Briceida");
        persona1.setApellido("Baldeon");
        persona1.setEdad(19);

        // Imprimir los atributos del persona
        System.out.println(Persona.descripcionPersona(persona1));
    }
}
