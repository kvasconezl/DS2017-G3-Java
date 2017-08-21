package tdas;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ramirez D
 */
public class Usuario {
    private String nombre;
    private String contraseña;
    private String restaurante;
    private String tipo;
    
    public Usuario(String nom, String pass, String tip, String rest){
        nombre = nom;
        contraseña = pass;
        tipo = tip;
        restaurante = rest;
    }
    
    @Override
    public String toString(){
        String str = "Nombre: " + nombre + "\nContraseña: " + contraseña + "\nTipo: " + tipo;
        if(!"none".equals(this.restaurante)){
            str += "\nRestaurante: " + restaurante;
        }
        return str;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(String restaurante) {
        this.restaurante = restaurante;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
}
