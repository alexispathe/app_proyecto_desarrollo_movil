/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.app;

import java.util.ArrayList;

public class Clima {
    private String nombre;

    public Clima(String nombre) {
        this.nombre = nombre;
    }

    // Getters y Setters

    public static ArrayList<Clima> climas = new ArrayList<>();

    public static void agregarClima(String nombre) {
        Clima clima = new Clima(nombre);
        climas.add(clima);
    }

    public static void mostrarClimas() {
        for (Clima clima : climas) {
            System.out.println(clima.nombre);
        }
    }

    public static void mostrarClima(int indice) {
        Clima clima = climas.get(indice);
        System.out.println("Nombre: " + clima.nombre);
    }
}
