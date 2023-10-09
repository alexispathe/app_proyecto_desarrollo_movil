package com.mycompany.app;
import java.util.ArrayList;

public class Planeta {
    private String nombre;
    private double gravedad;
    private String caracteristicas;
    private String translacion;
    private double diametro;
    private double volumen;

    public Planeta(String nombre, double gravedad, String caracteristicas, String translacion, double diametro, double volumen) {
        this.nombre = nombre;
        this.gravedad = gravedad;
        this.caracteristicas = caracteristicas;
        this.translacion = translacion;
        this.diametro = diametro;
        this.volumen = volumen;
    }

    // Getters y Setters

    public static ArrayList<Planeta> planetas = new ArrayList<>();

    public static void agregarPlaneta(String nombre, double gravedad, String caracteristicas, String translacion, double diametro, double volumen) {
        Planeta planeta = new Planeta(nombre, gravedad, caracteristicas, translacion, diametro, volumen);
        planetas.add(planeta);
    }

    public static void mostrarPlanetas() {
        for (Planeta planeta : planetas) {
            System.out.println(planeta.nombre);
        }
    }

    public static void mostrarPlaneta(int indice) {
        Planeta planeta = planetas.get(indice);
        System.out.println("Nombre: " + planeta.nombre);
        System.out.println("Gravedad: " + planeta.gravedad);
        System.out.println("Características: " + planeta.caracteristicas);
        System.out.println("Translación: " + planeta.translacion);
        System.out.println("Diámetro: " + planeta.diametro);
        System.out.println("Volumen: " + planeta.volumen);
    }
}
