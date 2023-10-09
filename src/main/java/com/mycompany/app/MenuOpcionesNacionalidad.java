/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.app;

import java.util.Scanner;

public class MenuOpcionesNacionalidad {
    public static void opcionesNacionalidad() {
        Scanner scanner = new Scanner(System.in);
        Nacionalidad.agregarNacionalidad("Estadounidense");
        Nacionalidad.agregarNacionalidad("Francesa");

        while (true) {
            System.out.println("1. Mostrar nacionalidades");
            System.out.println("2. Mostrar información de una nacionalidad");
            System.out.println("3. Agregar una nueva nacionalidad");
            System.out.println("4. Salir");
            int opcion = scanner.nextInt();

            if (opcion == 1) {
                Nacionalidad.mostrarNacionalidades();
            } else if (opcion == 2) {
                System.out.println("Ingrese el índice de la nacionalidad:");
                int indice = scanner.nextInt();
                Nacionalidad.mostrarNacionalidad(indice);
            } else if (opcion == 3) {
                System.out.println("Ingrese el nombre de la nacionalidad:");
                String nombre = scanner.next();
                Nacionalidad.agregarNacionalidad(nombre);
            } else if (opcion == 4) {
                break;
            }
        }
    }
}
