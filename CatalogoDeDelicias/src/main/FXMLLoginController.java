/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import csv.R_W;
import java.io.IOException;
import java.net.URL;
import java.util.LinkedList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import metodos.Login;
import tdas.Usuario;
import static metodos.Login.login;
import static metodos.Login.buscarUsuario;

/**
 * FXML Controller class
 *
 * @author Kevin Vásconez
 */
public class FXMLLoginController implements Initializable {

    @FXML
    private TextField username;
    @FXML
    private PasswordField password;
    @FXML
    private Label status;
    R_W rw = new R_W();

    public void verificarCredenciales(ActionEvent event) throws IOException {
        LinkedList<Usuario> usuarios = rw.devolverUsuarios();
        if (!Login.login(username.getText(), password.getText(), usuarios)) {
            status.setText("Usuario o contraseña incorrectos.");
        } else {
            Usuario user = Login.buscarUsuario(username.getText(), usuarios);
            if (user.getTipo().equals("admin")) {
                this.changeWindow("admin");
            } else if (user.getTipo().equals("staff")) {
                this.changeWindow("staff");
            } else if (user.getTipo().equals("cliente")) {
                this.changeWindow("user");
            }
        }
    }

    public void changeWindow(String tipo) throws IOException {
        ((Node) (status)).getScene().getWindow().hide();
        String fxml = (tipo.equals("admin")) ? "FXMLAdminMenu.fxml"
                : ((tipo.equals("staff")) ? "FXMLStaffMenu.fxml" : "FXMLUserMenu.fxml");
        Parent root = FXMLLoader.load(getClass().getResource(fxml));
        Stage stage = new Stage();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Catálogo de Delicias");
        stage.show();
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }

}
