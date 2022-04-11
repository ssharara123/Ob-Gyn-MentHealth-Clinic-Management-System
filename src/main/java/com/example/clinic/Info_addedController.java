package com.example.clinic;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.io.IOException;

public class Info_addedController {
    @FXML
    private Button back;
    @FXML
    private Label add_info;
    public void go_back(ActionEvent event) throws IOException
    {
        Main t=new Main();
        t.changeScene("afterLogin.fxml");
    }

}
