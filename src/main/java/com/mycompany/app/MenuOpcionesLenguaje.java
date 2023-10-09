/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.app;
import java.util.Scanner;

public class MenuOpcionesLenguaje {
    public static void opcionesLenguaje() {
        Scanner scanner = new Scanner(System.in);
        Lenguaje.agregarLenguaje("Java", "JDK Installed");
        Lenguaje.agregarLenguaje("Python", "Interpreter Installed");

        while (true) {
            System.out.println("1. Mostrar lenguajes de programación");
            System.out.println("2. Mostrar información de un lenguaje");
            System.out.println("3. Agregar un nuevo lenguaje");
            System.out.println("4. Salir");
            int opcion = scanner.nextInt();

            if (opcion == 1) {
                Lenguaje.mostrarLenguajes();
            } else if (opcion == 2) {
                System.out.println("Ingrese el índice del lenguaje:");
                int indice = scanner.nextInt();
                Lenguaje.mostrarLenguaje(indice);
            } else if (opcion == 3) {
                System.out.println("Ingrese el nombre del lenguaje:");
                String nombre = scanner.next();
                System.out.println("Ingrese los requerimientos:");
                String requerimientos = scanner.next();
                Lenguaje.agregarLenguaje(nombre, requerimientos);
            } else if (opcion == 4) {
                break;
            }
        }
    }
}
