package com.example.clinic;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Appointment2 extends Main{
    @FXML
    private Button home;

    public void goHome(ActionEvent event) throws IOException
    {

        super.changeScene("afterLogin.fxml");
    }
}
