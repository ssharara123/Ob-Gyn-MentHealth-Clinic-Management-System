package com.example.clinic;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.io.IOException;

public class DocListMentalHealth {
    @FXML
    private Button fatema;
    @FXML
    private Button faisal;
    @FXML
    private Button rehnuma;
    @FXML
    private Button back;
    @FXML
    private TextField Name;
    @FXML
    private TextField ID;
    @FXML
    private TextField Date;

    public void chooseFatema(ActionEvent event) throws IOException
    {
        // Dr. Fatema Kabir er table e patient entry add korbi
        Main o = new Main();
        o.changeScene("appointment2.fxml");
    }
    public void chooseFaisal(ActionEvent event) throws IOException
    {
        // Dr. Faisal Khan er table e patient entry add korbi
        Main o = new Main();
        o.changeScene("appointment2.fxml");
    }

    public void chooseRehnuma(ActionEvent event) throws IOException
    {
        // Dr. Rehnuma Bushra er table e patient entry add korbi
        Main o = new Main();
        o.changeScene("appointment2.fxml");
    }

    public void goBack(ActionEvent event) throws IOException
    {
        Main o = new Main();
        o.changeScene("appointment1.fxml");
    }
}
