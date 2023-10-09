/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.app;
import java.util.Scanner;

public class MenuOpcionesPaisaje {
    public static void opcionesPaisaje() {
        Scanner scanner = new Scanner(System.in);
        Paisaje.agregarPaisaje("Montañas");
        Paisaje.agregarPaisaje("Playa");

        while (true) {
            System.out.println("1. Mostrar paisajes");
            System.out.println("2. Mostrar información de un paisaje");
            System.out.println("3. Agregar un nuevo paisaje");
            System.out.println("4. Salir");
            int opcion = scanner.nextInt();

            if (opcion == 1) {
                Paisaje.mostrarPaisajes();
            } else if (opcion == 2) {
                System.out.println("Ingrese el índice del paisaje:");
                int indice = scanner.nextInt();
                Paisaje.mostrarPaisaje(indice);
            } else if (opcion == 3) {
                System.out.println("Ingrese el tipo de paisaje:");
                String tipoPaisaje = scanner.next();
                Paisaje.agregarPaisaje(tipoPaisaje);
            } else if (opcion == 4) {
                break;
            }
        }
    }
}
