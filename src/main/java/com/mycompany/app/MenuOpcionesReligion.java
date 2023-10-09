/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.app;
import java.util.Scanner;

public class MenuOpcionesReligion {
    public static void opcionesReligion() {
        Scanner scanner = new Scanner(System.in);
        Religion.agregarReligion("Cristianismo");
        Religion.agregarReligion("Islam");

        while (true) {
            System.out.println("1. Mostrar religiones");
            System.out.println("2. Mostrar información de una religión");
            System.out.println("3. Agregar una nueva religión");
            System.out.println("4. Salir");
            int opcion = scanner.nextInt();

            if (opcion == 1) {
                Religion.mostrarReligiones();
            } else if (opcion == 2) {
                System.out.println("Ingrese el índice de la religión:");
                int indice = scanner.nextInt();
                Religion.mostrarReligion(indice);
            } else if (opcion == 3) {
                System.out.println("Ingrese el nombre de la religión:");
                String nombre = scanner.next();
                Religion.agregarReligion(nombre);
            } else if (opcion == 4) {
                break;
            }
        }
    }
}
