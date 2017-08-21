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
public abstract class BuilderAlmuerzo {
    protected Almuerzo almuerzo;

    public Almuerzo getAlmuerzo() {
        return almuerzo;
    }
   
    public abstract void definirAlmuerzo();
    public abstract void buildSopa(String nombre, String descripcion, LinkedList imagenes);
    public abstract void buildSegundo(String nombre, String descripcion, LinkedList imagenes);
    public abstract void buildPostre(boolean bool);
    public abstract void buildBebida(boolean bool);
    public abstract void buildPrecio();
    
}
