/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder.almuerzo;

import tdas.Plato;
import java.util.LinkedList;

/**
 *
 * @author Ramirez D
 */
public class Sopa extends Plato{
    
    public Sopa(){
        super();
    }
    
    public Sopa(String nombre, String descripcion, LinkedList imagenes){
        super(nombre, descripcion, imagenes);
    }
}
