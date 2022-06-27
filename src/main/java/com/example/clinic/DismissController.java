package com.example.clinic;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class DismissController {
    @FXML
    private Button dismissbutton;
    @FXML
    private TextField nameField;
    @FXML
    private TextField Idfield;
    @FXML
    private Label wrongInfo;
    @FXML
    private Button back;

    public void goBack(ActionEvent event) throws IOException
    {
        Main o = new Main();
        o.changeScene("appointmentList.fxml");
    }
    public void dismissApp(ActionEvent event) throws IOException
    {
        //ekhane oi doctor er table e jodi input kora patient er name ar id pawa jay,
        // taile wrong info Label e set text dibi "Appointment Dismissed!", ar oi entry delete kore dibi
        // ar na pawa gele lekhbi "Appointment not found!"
    }


}
