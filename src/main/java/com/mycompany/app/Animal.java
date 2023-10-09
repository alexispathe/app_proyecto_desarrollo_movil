/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.app;
import java.util.ArrayList;

public class Animal {
    private String tipoAnimal;
    private String clasificacion;
    private int extremidades;
    private String organos;

    public Animal(String tipoAnimal, String clasificacion, int extremidades, String organos) {
        this.tipoAnimal = tipoAnimal;
        this.clasificacion = clasificacion;
        this.extremidades = extremidades;
        this.organos = organos;
    }

    // Getters y Setters

    public static ArrayList<Animal> animales = new ArrayList<>();

    public static void agregarAnimal(String tipoAnimal, String clasificacion, int extremidades, String organos) {
        Animal animal = new Animal(tipoAnimal, clasificacion, extremidades, organos);
        animales.add(animal);
    }

    public static void mostrarAnimales() {
        for (Animal animal : animales) {
            System.out.println("Tipo de Animal: " + animal.tipoAnimal);
        }
    }

    public static void mostrarAnimal(int indice) {
        Animal animal = animales.get(indice);
        System.out.println("Tipo de Animal: " + animal.tipoAnimal);
        System.out.println("Clasificación: " + animal.clasificacion);
        System.out.println("Extremidades: " + animal.extremidades);
        System.out.println("Órganos: " + animal.organos);
    }

    public void vivir() {
        System.out.println("El animal sigue vivo.");
    }

    public void mover() {
        System.out.println("El animal se está moviendo.");
    }

    public void correr() {
        System.out.println("El animal está corriendo.");
    }

    public void dormir() {
        System.out.println("El animal está durmiendo.");
    }

    public void caminar() {
        System.out.println("El animal está caminando.");
    }

    public void descansar() {
        System.out.println("El animal está descansando.");
    }

    public void respirar() {
        System.out.println("El animal está respirando.");
    }

    public void envejecer() {
        System.out.println("El animal está envejeciendo.");
    }

    public void beber() {
        System.out.println("El animal está bebiendo agua.");
    }

    public void disfrutar() {
        System.out.println("El animal está disfrutando la vida.");
    }

    public void trabajar() {
        System.out.println("El animal está trabajando en conseguir comida.");
    }

    public void inventar() {
        System.out.println("El animal está inventando una forma de conseguir comida.");
    }

    public void morir() {
        System.out.println("El animal ha fallecido.");
    }
}
