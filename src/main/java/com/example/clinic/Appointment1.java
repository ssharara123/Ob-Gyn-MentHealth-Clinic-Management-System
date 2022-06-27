package com.example.clinic;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class Appointment1 extends Main
{
    @FXML
    private Button mentalhealth;

    @FXML
    private Button obGyn;
    @FXML
    private Button back;

    public void docsMentalHealth(ActionEvent event) throws IOException
    {
        super.changeScene("docList_mentalHealth.fxml");
    }

    public void docsObGyn(ActionEvent event) throws IOException
    {
        super.changeScene("docList_obGyn.fxml");
    }
    public void Back(ActionEvent e) throws IOException
    {
        super.changeScene("afterLogin.fxml");
    }

}
