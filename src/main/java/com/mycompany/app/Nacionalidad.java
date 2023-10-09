/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.app;

import java.util.ArrayList;

public class Nacionalidad {
    private String nombre;

    public Nacionalidad(String nombre) {
        this.nombre = nombre;
    }

    // Getters y Setters

    public static ArrayList<Nacionalidad> nacionalidades = new ArrayList<>();

    public static void agregarNacionalidad(String nombre) {
        Nacionalidad nacionalidad = new Nacionalidad(nombre);
        nacionalidades.add(nacionalidad);
    }

    public static void mostrarNacionalidades() {
        for (Nacionalidad nacionalidad : nacionalidades) {
            System.out.println(nacionalidad.nombre);
        }
    }

    public static void mostrarNacionalidad(int indice) {
        Nacionalidad nacionalidad = nacionalidades.get(indice);
        System.out.println("Nombre de la Nacionalidad: " + nacionalidad.nombre);
    }
}
