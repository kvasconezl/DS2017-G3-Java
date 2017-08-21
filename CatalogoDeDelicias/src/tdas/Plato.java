/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdas;

import java.util.LinkedList;

/**
 *
 * @author Ramirez D
 */
public abstract class Plato {

    private String nombre;
    private String descripcion;
    private LinkedList imagenes;

    public Plato() {

    }

    public Plato(String nom, String descr, LinkedList img) {
        nombre = nom;
        descripcion = descr;
        imagenes = img;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\nDescripcion: " + descripcion;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getDescripcion() {
        return this.descripcion;
    }
}
