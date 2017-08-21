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
public class Restaurante {
    private String nombre;
    private String pago;
    private LinkedList<Usuario> staff;
    private LinkedList<Usuario> admin;

    public Restaurante(String nombre, String pago) {
        this.nombre = nombre;
        this.pago = pago;
        this.staff = new LinkedList<Usuario>();
        this.admin = new LinkedList<Usuario>();
    }
    
    public void añadirAdmin(Usuario administrador){
        if(!admin.contains(administrador)) admin.add(administrador);
        else System.out.println("Administrador ya existe en este restaurante");
    }
    
    public void añadirAsistente(Usuario asistente){
        if(!staff.contains(asistente)) staff.add(asistente);
        else System.out.println("Asistente ya existe en este restaurante");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPago() {
        return pago;
    }

    public void setPago(String pago) {
        this.pago = pago;
    }

    public LinkedList getStaff() {
        return staff;
    }

    public void setStaff(LinkedList staff) {
        this.staff = staff;
    }

    public LinkedList getAdmin() {
        return admin;
    }

    public void setAdmin(LinkedList admin) {
        this.admin = admin;
    }
    
    
    
    
}
