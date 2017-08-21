/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

import csv.R_W;
import tdas.Usuario;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author Ramirez D
 */
public class Login {
    
    public boolean login(String usuario, String pass, LinkedList<Usuario> listaU){
        for(Usuario usu: listaU){
            if(usu.getNombre().equals(usuario) && usu.getContraseña().equals(pass)) return true;
        }
        return false;
    }
    
    public Usuario buscarUsuario(String nombre, LinkedList<Usuario> listaU){
        for(Usuario usu: listaU){
            if(usu.getNombre().equals(nombre)) return usu;
        }
        return null;
    }
    
    public void iniciarSesion() throws IOException{
        R_W rw = new R_W();
        LinkedList<Usuario> usuarios = rw.devolverUsuarios();
        System.out.println("..Iniciando sesion..");
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Ingrese su usuario por favor: ");
            String usuario = sc.nextLine();
            System.out.println("Ingrese su contrasñea por favor: ");
            String pass = sc.nextLine();
            if(!login(usuario, pass, usuarios)) break;
            else System.out.println("Error al iniciar sesion, datos invalidos");
        }
    }
    
}
