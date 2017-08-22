/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
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
    @FXML
    private Button salir;
    @FXML
    private Button addRest;
    @FXML
    private Button listRest;
    @FXML
    private Button addStaff;
    @FXML
    private Button addUser;

    public void mostrarUsuario() {
        String name = WordUtils.capitalizeFully(Main.getACTUAL_USER().getNombre());
        String rest = WordUtils.capitalizeFully(Main.getACTUAL_USER().getRestaurante());
        nombre.setText(name);
        restaurante.setText(rest);
        privilegios.setText(Main.getACTUAL_USER().getTipo());
    }

    public void changeWindow(ActionEvent event) throws IOException {
        Button b = ((Button) event.getSource());
        String fxml;
        if (b.equals(salir)) {
            fxml = "FXMLLogin.fxml";
        } else if (b.equals(addRest)) {
            fxml = "FXMLAddRestaurant.fxml";
        } else if (b.equals(addUser)) {
            fxml = "FXMLAddUser.fxml";
        } else if (b.equals(addStaff)) {
            fxml = "FXMLAddStaff.fxml";
        } else {
            fxml = "FXMLListRestaurant.fxml";
        }
        Parent root = FXMLLoader.load(getClass().getResource(fxml));
        Stage stage = new Stage();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Catálogo de Delicias");
        stage.show();
        ((Node) (nombre)).getScene().getWindow().hide();
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        this.mostrarUsuario();
    }

}
