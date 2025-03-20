package poo.ejercicio2;

public class App2 {

    public static void main(String[] args) {

        Computer pc = new Computer("HP", "Lenovo", 16, 512);

        System.out.println("Información de la computadora:");
        pc.infoComputadora();

        System.out.println("---- ********************* ----" +
                "\nActualizando memoria RAM y almacenamiento...");
        pc.actualizarAlmacenamiento(8);
        pc.actualizarAlmacenamiento(512);

        System.out.println("---- ********************* ----" +
                "\nInformación después de la actualización:");
        pc.infoComputadora();
    }
}
