/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.app;

import java.util.Scanner;

public class MenuOpcionesTipoMetal {
    public static void opcionesTipoMetal() {
        Scanner scanner = new Scanner(System.in);
        TipoMetal.agregarTipoMetal("Hierro");
        TipoMetal.agregarTipoMetal("Cobre");

        while (true) {
            System.out.println("1. Mostrar tipos de metal");
            System.out.println("2. Mostrar información de un tipo de metal");
            System.out.println("3. Agregar un nuevo tipo de metal");
            System.out.println("4. Salir");
            int opcion = scanner.nextInt();

            if (opcion == 1) {
                TipoMetal.mostrarTipoMetales();
            } else if (opcion == 2) {
                System.out.println("Ingrese el índice del tipo de metal:");
                int indice = scanner.nextInt();
                TipoMetal.mostrarTipoMetal(indice);
            } else if (opcion == 3) {
                System.out.println("Ingrese el nombre del tipo de metal:");
                String nombre = scanner.next();
                TipoMetal.agregarTipoMetal(nombre);
            } else if (opcion == 4) {
                break;
            }
        }
    }
}
