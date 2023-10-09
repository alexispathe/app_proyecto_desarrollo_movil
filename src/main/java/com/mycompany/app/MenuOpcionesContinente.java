/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.app;
import java.util.Scanner;

public class MenuOpcionesContinente {
    public static void opcionesContinente() {
        Scanner scanner = new Scanner(System.in);
        Continente.agregarContinente("América");
        Continente.agregarContinente("Asia");

        while (true) {
            System.out.println("1. Mostrar continentes");
            System.out.println("2. Mostrar información de un continente");
            System.out.println("3. Agregar un nuevo continente");
            System.out.println("4. Salir");
            int opcion = scanner.nextInt();

            if (opcion == 1) {
                Continente.mostrarContinentes();
            } else if (opcion == 2) {
                System.out.println("Ingrese el índice del continente:");
                int indice = scanner.nextInt();
                Continente.mostrarContinente(indice);
            } else if (opcion == 3) {
                System.out.println("Ingrese el nombre del continente:");
                String nombre = scanner.next();
                Continente.agregarContinente(nombre);
            } else if (opcion == 4) {
                break;
            }
        }
    }
}
