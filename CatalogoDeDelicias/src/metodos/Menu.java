/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

import java.util.HashMap;
import java.util.Map;
import csv.R_W;
import tdas.Platillo;
import tdas.Usuario;
import java.util.LinkedList;

/**
 *
 * @author Ramirez D
 */
public class Menu {

    public Map busquedaCategoria() {
        R_W rw = new R_W();
        LinkedList<Platillo> listaPlatillo = new LinkedList();
        Map<String, Integer> diccionarioCategorias = new HashMap<>();
        listaPlatillo.forEach((platillo) -> {
            if (diccionarioCategorias.containsKey(platillo.getCategoria())) {
                diccionarioCategorias.put(platillo.getCategoria(), diccionarioCategorias.get(platillo.getCategoria()) + 1);
            } else {
                diccionarioCategorias.put(platillo.getCategoria(), 1);
            }
        });
        return diccionarioCategorias;
    }

    public void listarCategoria(Map mapa) {
        //tu codigo de python
    }

    /*Mostar platillo seria con la funcioen en R_W devolver platillos
    de ahi lo imprimes nomas en la escena con las imagenes guardadas*/
 /*Agregar platillo ya esta, pero recibe un platilloasi que pilas*/
 /*Imprimi busqueda vos la hiciste igual prro :v*/
    public LinkedList buscarPlato(LinkedList platillos, String palabra) {
        LinkedList<Platillo> platos = new LinkedList();
        for (Platillo pla : platos) {
            if (pla.getNombre().contains(palabra) && pla.getDescripcion().contains(palabra)) {
                platos.add(pla);
            }
        }
        return platos;
    }
    /*NO SE QUE CARAJOS HICISTE EN EL PROGRAMA :v

    public LinkedList mostrarPlatos(String categoria, LinkedList listaPlatillos, Usuario usuario){

        if(usuario.getTipo().equals("Cliente")){

        }
    }*/
}
