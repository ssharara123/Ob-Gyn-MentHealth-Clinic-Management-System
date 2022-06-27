package com.example.clinic;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;


public class doctorController {
    @FXML
    private Button view;
    @FXML
    private Button check;
    @FXML
    private Button back;
    @FXML
    private Button update;

    public void checkAppointment(ActionEvent event) throws IOException
    {
        Main t = new Main();
        t.changeScene("appointmentList.fxml");
    }

    public void view(ActionEvent event) throws IOException
    {
        Main t = new Main();
        t.changeScene("searchPatient.fxml");
    }

    public void logout(ActionEvent event) throws IOException
    {
        Main x = new Main();
        x.changeScene("login.fxml");
    }

    public void update(ActionEvent event) throws IOException
    {
        Main k = new Main();
        k.changeScene("searchPatient.fxml");
    }

}
