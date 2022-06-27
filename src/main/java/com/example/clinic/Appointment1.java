package com.example.clinic;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class Appointment1
{
    @FXML
    private Button mentalhealth;

    @FXML
    private Button obGyn;

    public void docsMentalHealth(ActionEvent event) throws IOException
    {
        Main o = new Main();
        o.changeScene("docList_mentalHealth.fxml");
    }

    public void docsObGyn(ActionEvent event) throws IOException
    {
        Main o = new Main();
        o.changeScene("docList_obGyn.fxml");
    }
}
