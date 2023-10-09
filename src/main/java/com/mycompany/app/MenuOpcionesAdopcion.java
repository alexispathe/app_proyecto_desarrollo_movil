/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.app;

import java.util.Scanner;

public class MenuOpcionesAdopcion {
    public static void opcionesAdopcion() {
        Scanner scanner = new Scanner(System.in);
        AdoptarAnimal.agregarAdopcion("Max", "Perro");
        AdoptarAnimal.agregarAdopcion("Whiskers", "Gato");

        while (true) {
            System.out.println("1. Mostrar adopciones de animales");
            System.out.println("2. Mostrar información de una adopción");
            System.out.println("3. Agregar una nueva adopción");
            System.out.println("4. Salir");
            int opcion = scanner.nextInt();

            if (opcion == 1) {
                AdoptarAnimal.mostrarAdopciones();
            } else if (opcion == 2) {
                System.out.println("Ingrese el índice de la adopción:");
                int indice = scanner.nextInt();
                AdoptarAnimal.mostrarAdopcion(indice);
            } else if (opcion == 3) {
                System.out.println("Ingrese el nombre del animal:");
                String nombre = scanner.next();
                System.out.println("Ingrese el tipo de animal:");
                String tipoAnimal = scanner.next();
                AdoptarAnimal.agregarAdopcion(nombre, tipoAnimal);
            } else if (opcion == 4) {
                break;
            }
        }
    }
}
