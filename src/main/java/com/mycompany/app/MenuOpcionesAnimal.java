/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.app;
import java.util.Scanner;

public class MenuOpcionesAnimal {
    public static void opcionesAnimal() {
        Scanner scanner = new Scanner(System.in);
        Animal.agregarAnimal("León", "Mamífero", 4, "Sistema digestivo");
        Animal.agregarAnimal("Águila", "Ave", 2, "Sistema respiratorio");

        while (true) {
            System.out.println("1. Mostrar animales");
            System.out.println("2. Mostrar información de un animal");
            System.out.println("3. Agregar un nuevo animal");
            System.out.println("4. Salir");
            int opcion = scanner.nextInt();

            if (opcion == 1) {
                Animal.mostrarAnimales();
            } else if (opcion == 2) {
                System.out.println("Ingrese el índice del animal:");
                int indice = scanner.nextInt();
                Animal.mostrarAnimal(indice);
            } else if (opcion == 3) {
                System.out.println("Ingrese el tipo de animal:");
                String tipoAnimal = scanner.next();
                System.out.println("Ingrese la clasificación:");
                String clasificacion = scanner.next();
                System.out.println("Ingrese el número de extremidades:");
                int extremidades = scanner.nextInt();
                System.out.println("Ingrese el sistema de órganos:");
                String organos = scanner.next();
                Animal.agregarAnimal(tipoAnimal, clasificacion, extremidades, organos);
            } else if (opcion == 4) {
                break;
            }
        }
    }
}
