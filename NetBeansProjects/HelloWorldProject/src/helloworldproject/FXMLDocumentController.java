/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldproject;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import java.io.IOException;
import java.awt.Desktop;
import java.io.File;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import javafx.scene.Scene;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.control.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import org.omg.CORBA.portable.InputStream;


/**
 *
 * @author Willy
 */
public class FXMLDocumentController implements Initializable {
                final WebView browser = new WebView();
        final WebEngine webEngine = browser.getEngine();

        
        
        

    
    @FXML
    private Label label;
    
    
    
    
    @FXML
    private void handleButtonActionYouTube(ActionEvent event) {
                System.out.println("Library!");

    }
    

    
    @FXML
    private void handleButtonActionLibrary(ActionEvent event) {
        System.out.println("Library!");
    }
    
    @FXML
    private void handleButtonActionRadio(ActionEvent event) {
        System.out.println("Radio!");
    }  

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
