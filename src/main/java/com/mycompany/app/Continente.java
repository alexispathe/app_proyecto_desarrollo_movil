/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.app;

import java.util.ArrayList;

public class Continente {
    private String nombre;

    public Continente(String nombre) {
        this.nombre = nombre;
    }

    // Getters y Setters

    public static ArrayList<Continente> continentes = new ArrayList<>();

    public static void agregarContinente(String nombre) {
        Continente continente = new Continente(nombre);
        continentes.add(continente);
    }

    public static void mostrarContinentes() {
        for (Continente continente : continentes) {
            System.out.println(continente.nombre);
        }
    }

    public static void mostrarContinente(int indice) {
        Continente continente = continentes.get(indice);
        System.out.println("Nombre: " + continente.nombre);
    }
}
