/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.app;
import java.util.ArrayList;

public class Paisaje {
    private String tipoPaisaje;

    public Paisaje(String tipoPaisaje) {
        this.tipoPaisaje = tipoPaisaje;
    }

    // Getters y Setters

    public static ArrayList<Paisaje> paisajes = new ArrayList<>();

    public static void agregarPaisaje(String tipoPaisaje) {
        Paisaje paisaje = new Paisaje(tipoPaisaje);
        paisajes.add(paisaje);
    }

    public static void mostrarPaisajes() {
        for (Paisaje paisaje : paisajes) {
            System.out.println(paisaje.tipoPaisaje);
        }
    }

    public static void mostrarPaisaje(int indice) {
        Paisaje paisaje = paisajes.get(indice);
        System.out.println("Tipo de Paisaje: " + paisaje.tipoPaisaje);
    }
}
