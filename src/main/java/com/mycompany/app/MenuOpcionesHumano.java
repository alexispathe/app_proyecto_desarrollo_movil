/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.app;

import java.util.Scanner;

public class MenuOpcionesHumano {
    public static void opcionesHumano() {
        Scanner scanner = new Scanner(System.in);
        Humano.agregarHumano("Juan", "Nadar", "Masculino", "Sistema circulatorio", 4);
        Humano.agregarHumano("Ana", "Bailar", "Femenino", "Sistema respiratorio", 4);

        while (true) {
            System.out.println("1. Mostrar humanos");
            System.out.println("2. Mostrar información de un humano");
            System.out.println("3. Agregar un nuevo humano");
            System.out.println("4. Salir");
            int opcion = scanner.nextInt();

            if (opcion == 1) {
                Humano.mostrarHumanos();
            } else if (opcion == 2) {
                System.out.println("Ingrese el índice del humano:");
                int indice = scanner.nextInt();
                Humano.mostrarHumano(indice);
            } else if (opcion == 3) {
                System.out.println("Ingrese el nombre:");
                String nombre = scanner.next();
                System.out.println("Ingrese los pasatiempos:");
                String pasatiempos = scanner.next();
                System.out.println("Ingrese el género:");
                String genero = scanner.next();
                System.out.println("Ingrese el sistema de órganos:");
                String organos = scanner.next();
                System.out.println("Ingrese el número de extremidades:");
                int extremidades = scanner.nextInt();
                Humano.agregarHumano(nombre, pasatiempos, genero, organos, extremidades);
            } else if (opcion == 4) {
                break;
            }
        }
    }
}

