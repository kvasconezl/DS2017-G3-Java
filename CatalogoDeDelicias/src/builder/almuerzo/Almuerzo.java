/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder.almuerzo;

/**
 *
 * @author Ramirez D
 */
public class Almuerzo {
    
    private Sopa sopa;
    private Segundo segundo;
    private boolean postre;
    private boolean bebida;
    private double precio = 0;

    public Almuerzo(){
        
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public Sopa getSopa() {
        return sopa;
    }

    public void setSopa(Sopa sopa) {
        this.sopa = sopa;
    }

    public Segundo getSegundo() {
        return segundo;
    }

    public void setSegundo(Segundo segundo) {
        this.segundo = segundo;
    }

    public boolean isPostre() {
        return postre;
    }

    public void setPostre(boolean postre) {
        this.postre = postre;
    }

    public boolean isBebida() {
        return bebida;
    }

    public void setBebida(boolean bebida) {
        this.bebida = bebida;
    }
   
    
    
}
