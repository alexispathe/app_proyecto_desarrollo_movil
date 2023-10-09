package com.mycompany.app;
import java.util.Scanner;

public class MenuOpcionesPlaneta {
    public static void opcionesPlaneta() {
        Scanner scanner = new Scanner(System.in);
        Planeta.agregarPlaneta("Tierra", 9.81, "Habitado por seres vivos", "365 días", 12742, 108321);
        Planeta.agregarPlaneta("Marte", 3.71, "Posible vida en el pasado", "687 días", 6779, 16318);

        while (true) {
            System.out.println("1. Mostrar planetas");
            System.out.println("2. Mostrar información de un planeta");
            System.out.println("3. Agregar un nuevo planeta");
            System.out.println("4. Salir");
            int opcion = scanner.nextInt();

            if (opcion == 1) {
                Planeta.mostrarPlanetas();
            } else if (opcion == 2) {
                System.out.println("Ingrese el índice del planeta:");
                int indice = scanner.nextInt();
                Planeta.mostrarPlaneta(indice);
            } else if (opcion == 3) {
                System.out.println("Ingrese el nombre del planeta:");
                String nombre = scanner.next();
                System.out.println("Ingrese la gravedad:");
                double gravedad = scanner.nextDouble();
                System.out.println("Ingrese las características:");
                String caracteristicas = scanner.next();
                System.out.println("Ingrese el período de translación:");
                String translacion = scanner.next();
                System.out.println("Ingrese el diámetro:");
                double diametro = scanner.nextDouble();
                System.out.println("Ingrese el volumen:");
                double volumen = scanner.nextDouble();
                Planeta.agregarPlaneta(nombre, gravedad, caracteristicas, translacion, diametro, volumen);
            } else if (opcion == 4) {
                break;
            }
        }
    }
}
