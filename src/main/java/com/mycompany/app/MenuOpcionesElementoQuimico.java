/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.app;
import java.util.Scanner;

public class MenuOpcionesElementoQuimico {
    public static void opcionesElementoQuimico() {
        Scanner scanner = new Scanner(System.in);
        ElementoQuimico.agregarElementoQuimico("Hidrógeno");
        ElementoQuimico.agregarElementoQuimico("Oxígeno");

        while (true) {
            System.out.println("1. Mostrar elementos químicos");
            System.out.println("2. Mostrar información de un elemento químico");
            System.out.println("3. Agregar un nuevo elemento químico");
            System.out.println("4. Salir");
            int opcion = scanner.nextInt();

            if (opcion == 1) {
                ElementoQuimico.mostrarElementosQuimicos();
            } else if (opcion == 2) {
                System.out.println("Ingrese el índice del elemento químico:");
                int indice = scanner.nextInt();
                ElementoQuimico.mostrarElementoQuimico(indice);
            } else if (opcion == 3) {
                System.out.println("Ingrese el nombre del elemento químico:");
                String nombre = scanner.next();
                ElementoQuimico.agregarElementoQuimico(nombre);
            } else if (opcion == 4) {
                break;
            }
        }
    }
}
