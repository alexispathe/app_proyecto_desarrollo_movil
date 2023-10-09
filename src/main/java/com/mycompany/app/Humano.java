/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.app;
import java.util.ArrayList;

public class Humano {
    private String nombre;
    private String pasatiempos;
    private String genero;
    private String organos;
    private int extremidades;

    public Humano(String nombre, String pasatiempos, String genero, String organos, int extremidades) {
        this.nombre = nombre;
        this.pasatiempos = pasatiempos;
        this.genero = genero;
        this.organos = organos;
        this.extremidades = extremidades;
    }

    // Getters y Setters

    public static ArrayList<Humano> humanos = new ArrayList<>();

    public static void agregarHumano(String nombre, String pasatiempos, String genero, String organos, int extremidades) {
        Humano humano = new Humano(nombre, pasatiempos, genero, organos, extremidades);
        humanos.add(humano);
    }

    public static void mostrarHumanos() {
        for (Humano humano : humanos) {
            System.out.println("Nombre: " + humano.nombre);
        }
    }

    public static void mostrarHumano(int indice) {
        Humano humano = humanos.get(indice);
        System.out.println("Nombre: " + humano.nombre);
        System.out.println("Pasatiempos: " + humano.pasatiempos);
        System.out.println("Género: " + humano.genero);
        System.out.println("Órganos: " + humano.organos);
        System.out.println("Extremidades: " + humano.extremidades);
    }

    public void vivir() {
        System.out.println("La persona sigue viva.");
    }

    public void mover() {
        System.out.println("La persona se está moviendo.");
    }

    public void correr() {
        System.out.println("La persona está corriendo.");
    }

    public void dormir() {
        System.out.println("La persona está durmiendo.");
    }

    public void caminar() {
        System.out.println("La persona está caminando.");
    }

    public void descansar() {
        System.out.println("La persona está descansando.");
    }

    public void respirar() {
        System.out.println("La persona está respirando.");
    }

    public void envejecer() {
        System.out.println("La persona está envejeciendo.");
    }

    public void beber() {
        System.out.println("La persona está bebiendo agua.");
    }

    public void disfrutar() {
        System.out.println("La persona está disfrutando la vida.");
    }

    public void trabajar() {
        System.out.println("La persona está trabajando.");
    }

    public void inventar() {
        System.out.println("La persona está inventando cosas para la humanidad.");
    }

    public void morir() {
        System.out.println("La persona ha fallecido.");
    }
}

