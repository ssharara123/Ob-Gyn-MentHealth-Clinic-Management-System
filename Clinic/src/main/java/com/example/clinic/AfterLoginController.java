package com.example.clinic;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class AfterLoginController
{
    @FXML
    private Button logout;

    @FXML
    private Button add;

    @FXML
    private Button update;

    public void addPatient(ActionEvent event) throws IOException
    {
        Main o = new Main();
        o.changeScene("newPatient.fxml");
    }

    public void updatePatient(ActionEvent event) throws IOException
    {
        Main p = new Main();
        p.changeScene("update_patient.fxml");
    }

    public void userLogout(ActionEvent event) throws IOException
    {
        Main m = new Main();
        m.changeScene("login.fxml");
    }
}
