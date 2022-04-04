package com.example.helloworldjavafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class AfterLogin
{
    @FXML
    private Button logout;

    @FXML
    private Button add;

    @FXML
    private Button update;

    public void addPatient(ActionEvent event) throws IOException
    {
        HelloApplication o = new HelloApplication();
        o.changeScene("newPatient.fxml");
    }

    public void updatePatient(ActionEvent event) throws IOException
    {
        HelloApplication p = new HelloApplication();
        p.changeScene("update_patient.fxml");
    }

    public void userLogout(ActionEvent event) throws IOException
    {
        HelloApplication m = new HelloApplication();
        m.changeScene("hello-view.fxml");
    }
}
