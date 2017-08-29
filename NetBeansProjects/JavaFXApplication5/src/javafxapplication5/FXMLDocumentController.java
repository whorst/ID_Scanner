/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication5;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 *
 * @author Willy
 */


public class FXMLDocumentController implements Initializable {

    @FXML
    private Label label;

    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.exit(1);

    }
   
    @FXML
    private void handleYT(ActionEvent event) throws InterruptedException {
        try {
            new ProcessBuilder("/home/pi/Desktop/shScripts/YouTube").start();
            Thread.sleep(7);
            new ProcessBuilder("/home/pi/Desktop/shScripts/MP3").start();
            System.out.println("Script executed successfully");
            System.exit(2);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void handleMP3(ActionEvent event) {
        System.exit(1);

    }

    private void handleRadio(ActionEvent event) {
        System.exit(1);

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
