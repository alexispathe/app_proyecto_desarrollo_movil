package com.mycompany.app;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Opciones de Planeta");
            System.out.println("2. Opciones de Continente");
            System.out.println("3. Opciones de Clima");
            System.out.println("4. Opciones de Paisaje");
            System.out.println("5. Opciones de Nacionalidad");
            System.out.println("6. Opciones de Religion");
            System.out.println("7. Opciones de Animal");
            System.out.println("8. Opciones de Humano");
            System.out.println("9. Opciones de Adopciones de Animales");
            System.out.println("10. Opciones de Computadoras");
            System.out.println("11. Opciones de Lenguajes de Programación");
            System.out.println("12. Salir");

            int opcion = scanner.nextInt();

            if (opcion == 1) {
                MenuOpcionesPlaneta.opcionesPlaneta();
            } else if (opcion == 2) {
                MenuOpcionesContinente.opcionesContinente();
            } else if (opcion == 3) {
                MenuOpcionesClima.opcionesClima();
            } else if (opcion == 4) {
                MenuOpcionesPaisaje.opcionesPaisaje();
            } else if (opcion == 5) {
                MenuOpcionesNacionalidad.opcionesNacionalidad();
            } else if (opcion == 6) {
                MenuOpcionesReligion.opcionesReligion();
            } else if (opcion == 7) {
                MenuOpcionesAnimal.opcionesAnimal();
            } else if (opcion == 8) {
                MenuOpcionesHumano.opcionesHumano();
            } else if (opcion == 9) {
                MenuOpcionesAdopcion.opcionesAdopcion();
            } else if (opcion == 10) {
                MenuOpcionesComputadora.opcionesComputadora();
            } else if (opcion == 11) {
                MenuOpcionesLenguaje.opcionesLenguaje();
            } else if (opcion == 12) {
                System.out.println("Hasta luego!");
                System.exit(0);
            } else {
                System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
            }
        }
    }
}
