/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.app;

import java.util.Scanner;

public class MenuOpcionesComputadora {
    public static void opcionesComputadora() {
        Scanner scanner = new Scanner(System.in);
        Computadora.agregarComputadora("Windows", "Dell", "8 GB RAM, 256 GB SSD", "Mouse, Keyboard", "Processor, Motherboard");
        Computadora.agregarComputadora("MacOS", "Apple", "16 GB RAM, 512 GB SSD", "Magic Mouse, Magic Keyboard", "Apple M1 Chip");

        while (true) {
            System.out.println("1. Mostrar computadoras");
            System.out.println("2. Mostrar información de una computadora");
            System.out.println("3. Programar en una computadora");
            System.out.println("4. Agregar una nueva computadora");
            System.out.println("5. Salir");
            int opcion = scanner.nextInt();

            if (opcion == 1) {
                Computadora.mostrarComputadoras();
            } else if (opcion == 2) {
                System.out.println("Ingrese el índice de la computadora:");
                int indice = scanner.nextInt();
                Computadora.mostrarComputadora(indice);
            } else if (opcion == 3) {
                System.out.println("Ingrese el lenguaje de programación:");
                String lenguaje = scanner.next();
                System.out.println("Ingrese el índice de la computadora:");
                int indice = scanner.nextInt();
                Computadora computadora = Computadora.computadoras.get(indice);
                computadora.programar(lenguaje);
            } else if (opcion == 4) {
                System.out.println("Ingrese el sistema operativo:");
                String sistemaOperativo = scanner.next();
                System.out.println("Ingrese la marca:");
                String marca = scanner.next();
                System.out.println("Ingrese las características:");
                String caracteristicas = scanner.next();
                System.out.println("Ingrese los accesorios:");
                String accesorios = scanner.next();
                System.out.println("Ingrese los componentes:");
                String componentes = scanner.next();
                Computadora.agregarComputadora(sistemaOperativo, marca, caracteristicas, accesorios, componentes);
            } else if (opcion == 5) {
                break;
            }
        }
    }
}
