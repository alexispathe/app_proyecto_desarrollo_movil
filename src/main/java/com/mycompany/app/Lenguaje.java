/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.app;

import java.util.ArrayList;

public class Lenguaje {
    private String nombre;
    private String requerimientos;

    public Lenguaje(String nombre, String requerimientos) {
        this.nombre = nombre;
        this.requerimientos = requerimientos;
    }

    // Getters y Setters

    public static ArrayList<Lenguaje> lenguajes = new ArrayList<>();

    public static void agregarLenguaje(String nombre, String requerimientos) {
        Lenguaje lenguaje = new Lenguaje(nombre, requerimientos);
        lenguajes.add(lenguaje);
    }

    public static void mostrarLenguajes() {
        for (Lenguaje lenguaje : lenguajes) {
            System.out.println("Nombre del Lenguaje: " + lenguaje.nombre);
        }
    }

    public static void mostrarLenguaje(int indice) {
        Lenguaje lenguaje = lenguajes.get(indice);
        System.out.println("Nombre del Lenguaje: " + lenguaje.nombre);
        System.out.println("Requerimientos: " + lenguaje.requerimientos);
    }
}

