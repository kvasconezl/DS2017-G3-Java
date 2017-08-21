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
public class Cajera {
    private BuilderAlmuerzo builder;
    
    public BuilderAlmuerzo getBuilderAlmuerzo(){
        return builder;
    }
    
    public void setBuilderAlmuerzo(BuilderAlmuerzo almuerzo){
        builder = almuerzo;
    }
    
    public void generarPedido(String nombreS, String descripcionS, LinkedList segundo, String nombreSo, String descripcionSo, LinkedList sopa, boolean bebida, boolean postre){
        builder.definirAlmuerzo();
        builder.buildSegundo(nombreS, descripcionS, segundo);
        builder.buildSopa(nombreSo, descripcionSo, sopa);
        builder.buildBebida(bebida);
        builder.buildPostre(postre);
    }
}

