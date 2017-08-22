/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csv;

import tdas.Usuario;
import tdas.Platillo;
import com.csvreader.CsvReader;
import com.opencsv.*;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;

/**
 *
 * @author Ramirez D
 */
public class R_W {

    public LinkedList devolverUsuarios() throws IOException {

        LinkedList<Usuario> usuarios = new LinkedList<>();
        try {
            CsvReader usuarios_import = new CsvReader("src/resources/usuarios.csv", ';');
            usuarios_import.readHeaders();

            while (usuarios_import.readRecord()) {
                usuarios.add(new Usuario(usuarios_import.get(0), usuarios_import.get(1),
                        usuarios_import.get(2), usuarios_import.get(3)));
            }

            usuarios_import.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return usuarios;
    }

    public void guardarUsuario(Usuario usuario) throws IOException {
        LinkedList usuarios = devolverUsuarios();
        usuarios.add(usuario);
        CSVWriter csvOutput = new CSVWriter(new FileWriter("usuarios.csv", true), ',', '"', "\r\n");

        csvOutput.writeAll(usuarios, false);
        csvOutput.close();
    }

    public LinkedList devolverPlatillos() throws IOException {
        LinkedList<Platillo> platillos = new LinkedList<>();
        try {
            CsvReader platillos_import = new CsvReader("platillos.csv");
            platillos_import.readHeaders();

            while (platillos_import.readRecord()) {
                LinkedList<String> img = new LinkedList<>();
                img.add(platillos_import.get(4));
                platillos.add(new Platillo(platillos_import.get(0), platillos_import.get(1), platillos_import.get(2),
                        platillos_import.get(3), img, platillos_import.get(5),
                        platillos_import.get(6), platillos_import.get(7)));
            }

            platillos_import.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return platillos;
    }

    public void guardarPlatillo(Platillo platillo) throws IOException {
        LinkedList platillos = devolverPlatillos();
        platillos.add(platillo);
        CSVWriter csvOutput = new CSVWriter(new FileWriter("platillos.csv", true), ',', '"', "\r\n");

        csvOutput.writeAll(platillos, false);
        csvOutput.close();
    }

}
