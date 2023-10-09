/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.app;

import java.util.ArrayList;

public class Computadora {
    private String sistemaOperativo;
    private String marca;
    private String caracteristicas;
    private String accesorios;
    private String componentes;

    public Computadora(String sistemaOperativo, String marca, String caracteristicas, String accesorios, String componentes) {
        this.sistemaOperativo = sistemaOperativo;
        this.marca = marca;
        this.caracteristicas = caracteristicas;
        this.accesorios = accesorios;
        this.componentes = componentes;
    }

    // Getters y Setters

    public static ArrayList<Computadora> computadoras = new ArrayList<>();

    public static void agregarComputadora(String sistemaOperativo, String marca, String caracteristicas,
                                         String accesorios, String componentes) {
        Computadora computadora = new Computadora(sistemaOperativo, marca, caracteristicas, accesorios, componentes);
        computadoras.add(computadora);
    }

    public static void mostrarComputadoras() {
        for (Computadora computadora : computadoras) {
            System.out.println("Sistema Operativo: " + computadora.sistemaOperativo);
        }
    }

    public static void mostrarComputadora(int indice) {
        Computadora computadora = computadoras.get(indice);
        System.out.println("Sistema Operativo: " + computadora.sistemaOperativo);
        System.out.println("Marca: " + computadora.marca);
        System.out.println("Características: " + computadora.caracteristicas);
        System.out.println("Accesorios: " + computadora.accesorios);
        System.out.println("Componentes: " + computadora.componentes);
    }

    public void programar(String lenguaje) {
        System.out.println("Estás programando en " + lenguaje);
    }
}
