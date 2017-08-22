/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import org.apache.commons.lang3.text.WordUtils;

/**
 * FXML Controller class
 *
 * @author Kevin Vásconez
 */
public class FXMLAdminMenuController implements Initializable {

    @FXML
    private Label nombre;
    @FXML
    private Label restaurante;
    @FXML
    private Label privilegios;
    private String fxml;

    public void mostrarUsuario() {
        String name = WordUtils.capitalizeFully(Main.getACTUAL_USER().getNombre());
        String rest = WordUtils.capitalizeFully(Main.getACTUAL_USER().getRestaurante());
        nombre.setText(name);
        restaurante.setText(rest);
        privilegios.setText(Main.getACTUAL_USER().getTipo());
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        this.mostrarUsuario();
    }

}
