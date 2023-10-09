/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.app;

import java.util.ArrayList;

public class AdoptarAnimal {
    private String nombre;
    private String tipoAnimal;

    public AdoptarAnimal(String nombre, String tipoAnimal) {
        this.nombre = nombre;
        this.tipoAnimal = tipoAnimal;
    }

    // Getters y Setters

    public static ArrayList<AdoptarAnimal> adopciones = new ArrayList<>();

    public static void agregarAdopcion(String nombre, String tipoAnimal) {
        AdoptarAnimal adopcion = new AdoptarAnimal(nombre, tipoAnimal);
        adopciones.add(adopcion);
    }

    public static void mostrarAdopciones() {
        for (AdoptarAnimal adopcion : adopciones) {
            System.out.println("Nombre: " + adopcion.nombre + ", Tipo de Animal: " + adopcion.tipoAnimal);
        }
    }

    public static void mostrarAdopcion(int indice) {
        AdoptarAnimal adopcion = adopciones.get(indice);
        System.out.println("Nombre: " + adopcion.nombre);
        System.out.println("Tipo de Animal: " + adopcion.tipoAnimal);
    }
}
