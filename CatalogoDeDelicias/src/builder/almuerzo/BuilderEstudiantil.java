/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder.almuerzo;

import java.util.LinkedList;

/**
 *
 * @author Ramirez D
 */
public class BuilderEstudiantil extends BuilderAlmuerzo{

    @Override
    public void definirAlmuerzo() {
        almuerzo = new Almuerzo();
    }

    @Override
    public void buildSopa(String nombre, String descripcion, LinkedList imagenes) {
        almuerzo.setSopa(new Sopa(nombre, descripcion, imagenes));
    }

    @Override
    public void buildSegundo(String nombre, String descripcion, LinkedList imagenes) {
        almuerzo.setSegundo(new Segundo(nombre, descripcion, imagenes));
    }

    @Override
    public void buildPostre(boolean bool) {
        almuerzo.setPostre(false);
    }

    @Override
    public void buildBebida(boolean bool) {
        almuerzo.setBebida(false);
    }

    @Override
    public void buildPrecio() {
        almuerzo.setPrecio(2.00);
    }
    
}
