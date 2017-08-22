/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import tdas.Usuario;

/**
 *
 * @author Ramirez D
 */
public class Main extends Application {

    private static Usuario ACTUAL_USER;

    public static Usuario getACTUAL_USER() {
        return ACTUAL_USER;
    }

    public static void setACTUAL_USER(Usuario ACTUAL_USER) {
        Main.ACTUAL_USER = ACTUAL_USER;
    }

    @Override
    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLLogin.fxml"));

        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.setTitle("Catálogo de Delicias");
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
