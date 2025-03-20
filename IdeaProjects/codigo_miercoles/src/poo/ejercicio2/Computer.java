package poo.ejercicio2;

import java.util.Scanner;

//Crea una clase Computercon los siguientes atributos:
//
//brandde tipoString
//modelde tipoString
//ramde tipoint
//storagede tipoint
//Cree un constructor que reciba los cuatro atributos y los asigne a los atributos de la clase.
//
//Crear métodos para poder imprimir la información de la computadora.
//Cree métodos para poder aumentar la memoria ram y el almacenamiento.
public class Computer {

    String brand="";
    String model="";
    int ram=0;
    int storage=0;

    Scanner scanner=new Scanner(System.in);

    public Computer() {
    }

    public Computer(String brand, String model, int ram, int storage) {
        this.brand = brand;
        this.model = model;
        this.ram = ram;
        this.storage = storage;
    }



    //informacion de la computadora
    public void infoComputadora(){
        System.out.println("Marca de la computadora: " + brand);
        System.out.println("Modelo de la computadora: " + model);
        System.out.println("Memoria RAM: " + ram + " GB");
        System.out.println("Almacenamiento de la computadora: " + storage + " GB");
    }

    //  aumentar la RAM
    public void actualizarRam(int extraRam) {
        if (extraRam > 0) {
            this.ram += extraRam;
            System.out.println("Memoria RAM aumentada a " + ram + "GB.");
        } else {
            System.out.println("Cantidad no válida para aumentar la RAM.");
        }
    }

    // aumentar almacenamiento
    public void actualizarAlmacenamiento(int almacenamientoExtra) {
        if (almacenamientoExtra > 0) {
            this.storage += almacenamientoExtra;
            System.out.println("El almacenamiento fue aumentado a " + storage + " GB.");
        } else {
            System.out.println("Ingrese una cantidad válida para aumentar el almacenamiento.");
        }
    }

}
