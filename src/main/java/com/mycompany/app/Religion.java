/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.app;

import java.util.ArrayList;

public class Religion {
    private String nombre;

    public Religion(String nombre) {
        this.nombre = nombre;
    }

    // Getters y Setters

    public static ArrayList<Religion> religiones = new ArrayList<>();

    public static void agregarReligion(String nombre) {
        Religion religion = new Religion(nombre);
        religiones.add(religion);
    }

    public static void mostrarReligiones() {
        for (Religion religion : religiones) {
            System.out.println(religion.nombre);
        }
    }

    public static void mostrarReligion(int indice) {
        Religion religion = religiones.get(indice);
        System.out.println("Nombre de la Religión: " + religion.nombre);
    }
}
