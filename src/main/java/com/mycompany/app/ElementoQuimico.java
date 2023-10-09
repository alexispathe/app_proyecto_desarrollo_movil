/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.app;

import java.util.ArrayList;

public class ElementoQuimico {
    private String nombre;

    public ElementoQuimico(String nombre) {
        this.nombre = nombre;
    }

    // Getters y Setters

    public static ArrayList<ElementoQuimico> elementosQuimicos = new ArrayList<>();

    public static void agregarElementoQuimico(String nombre) {
        ElementoQuimico elementoQuimico = new ElementoQuimico(nombre);
        elementosQuimicos.add(elementoQuimico);
    }

    public static void mostrarElementosQuimicos() {
        for (ElementoQuimico elementoQuimico : elementosQuimicos) {
            System.out.println(elementoQuimico.nombre);
        }
    }

    public static void mostrarElementoQuimico(int indice) {
        ElementoQuimico elementoQuimico = elementosQuimicos.get(indice);
        System.out.println("Nombre: " + elementoQuimico.nombre);
    }
}
