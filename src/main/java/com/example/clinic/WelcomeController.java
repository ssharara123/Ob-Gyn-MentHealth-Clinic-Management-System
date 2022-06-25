package com.example.clinic;
import Model.Doctor;
import Model.Staff;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.event.ActionEvent;
import java.io.IOException;
import database.Model_sqlite;

public class WelcomeController {


    @FXML
    private Button mental;
    @FXML
    private Button ObGyn;

    public void mental(ActionEvent event) throws IOException
    {
        Main q = new Main();
        q.changeScene("login.fxml");
    }

    public void ObGyn(ActionEvent event) throws IOException
    {
        Main q = new Main();
        q.changeScene("login.fxml");
    }



}
