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
public class Platillo extends Plato{
    private String restaurante;
    private String categoria;
    private String ingredientes;
    private String servido;
    private String tipo;
    
    public Platillo(String nom, String rest, String cat, String ingr, LinkedList img, String descr, String ser, String tip) {
        super(nom, descr, img);
        restaurante = rest;
        categoria = cat;
        ingredientes = ingr;
        servido = ser;
        tipo = tip;
    }

    public String getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(String restaurante) {
        this.restaurante = restaurante;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public String getServido() {
        return servido;
    }

    public void setServido(String servido) {
        this.servido = servido;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    @Override
    public String toString(){
        String str = "";
        str += super.toString();
        str += "\nRestaurante: " + restaurante + "\nCategoria: " + categoria + "\nIngredientes:\n!" + ingredientes + "\nServido: " + servido + "\nTipo: " + tipo;
        return str;
    }
}
