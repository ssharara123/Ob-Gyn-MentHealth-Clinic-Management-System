package com.example.clinic;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.io.IOException;

public class DocListObGyn extends Main
{
    @FXML
    private Button sneha;
    @FXML
    private Button maliha;
    @FXML
    private Button dilara;
    @FXML
    private Button back;
    @FXML
    private TextField Name;
    @FXML
    private TextField ID;
    @FXML
    private TextField Date;

    public void chooseSneha(ActionEvent event) throws IOException
    {

        super.changeScene("appointment2.fxml");
    }
    public void chooseMaliha(ActionEvent event) throws IOException
    {
        super.changeScene("appointment2.fxml");
    }

    public void chooseDilara(ActionEvent event) throws IOException
    {
        super.changeScene("appointment2.fxml");
    }

    public void goBack(ActionEvent event) throws IOException
    {
        super.changeScene("appointment1.fxml");
    }


}
