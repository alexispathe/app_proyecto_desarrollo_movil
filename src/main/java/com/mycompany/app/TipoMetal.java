/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.app;

import java.util.ArrayList;

public class TipoMetal {
    private String nombre;

    public TipoMetal(String nombre) {
        this.nombre = nombre;
    }

    // Getters y Setters

    public static ArrayList<TipoMetal> tiposMetales = new ArrayList<>();

    public static void agregarTipoMetal(String nombre) {
        TipoMetal tipoMetal = new TipoMetal(nombre);
        tiposMetales.add(tipoMetal);
    }

    public static void mostrarTipoMetales() {
        for (TipoMetal tipoMetal : tiposMetales) {
            System.out.println(tipoMetal.nombre);
        }
    }

    public static void mostrarTipoMetal(int indice) {
        TipoMetal tipoMetal = tiposMetales.get(indice);
        System.out.println("Nombre: " + tipoMetal.nombre);
    }
}

