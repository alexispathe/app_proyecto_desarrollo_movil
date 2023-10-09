/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.app;

import java.util.Scanner;

public class MenuOpcionesClima {
    public static void opcionesClima() {
        Scanner scanner = new Scanner(System.in);
        Clima.agregarClima("Tropical");
        Clima.agregarClima("Árido");

        while (true) {
            System.out.println("1. Mostrar climas");
            System.out.println("2. Mostrar información de un clima");
            System.out.println("3. Agregar un nuevo clima");
            System.out.println("4. Salir");
            int opcion = scanner.nextInt();

            if (opcion == 1) {
                Clima.mostrarClimas();
            } else if (opcion == 2) {
                System.out.println("Ingrese el índice del clima:");
                int indice = scanner.nextInt();
                Clima.mostrarClima(indice);
            } else if (opcion == 3) {
                System.out.println("Ingrese el nombre del clima:");
                String nombre = scanner.next();
                Clima.agregarClima(nombre);
            } else if (opcion == 4) {
                break;
            }
        }
    }
}

