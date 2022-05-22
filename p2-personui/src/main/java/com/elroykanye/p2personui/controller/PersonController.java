/**
 * Sample Skeleton for 'person-view.fxml' Controller Class
 */

package com.elroykanye.p2personui.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class PersonController implements Initializable {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="deleteButton"
    private Button deleteButton; // Value injected by FXMLLoader

    @FXML // fx:id="newButton"
    private Button newButton; // Value injected by FXMLLoader

    @FXML // fx:id="updateButton"
    private Button updateButton; // Value injected by FXMLLoader

    @FXML // This method is called by the FXMLLoader when initialization is complete
    public void initialize(URL url, ResourceBundle resources) {
        assert deleteButton != null : "fx:id=\"deleteButton\" was not injected: check your FXML file 'person-view.fxml'.";
        assert newButton != null : "fx:id=\"newButton\" was not injected: check your FXML file 'person-view.fxml'.";
        assert updateButton != null : "fx:id=\"updateButton\" was not injected: check your FXML file 'person-view.fxml'.";

    }

}
