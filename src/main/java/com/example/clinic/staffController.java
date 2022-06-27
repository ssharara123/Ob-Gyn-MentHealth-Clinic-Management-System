package com.example.clinic;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class staffController extends Main{
    @FXML
    private Button logout;

    @FXML
    private Button add;

    @FXML
    private Button update;

    @FXML
    private Button appointment;

    public void addPatient(ActionEvent event) throws IOException {
        super.changeScene("newPatient.fxml");
    }

    public void updatePatient(ActionEvent event) throws IOException {
        super.changeScene("searchPatient.fxml");
    }

    public void userLogout(ActionEvent event) throws IOException {
        super.changeScene("login.fxml");
    }

    public void appointment(ActionEvent event) throws IOException {
        super.changeScene("appointment1.fxml");
    }

}
