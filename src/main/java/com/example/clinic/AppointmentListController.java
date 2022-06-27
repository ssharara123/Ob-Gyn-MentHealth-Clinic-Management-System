package com.example.clinic;

import Model.Doctor;
import Model.Staff;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.Label;
import javafx.event.ActionEvent;
import java.io.IOException;
import database.Model_sqlite;

import java.io.IOException;

public class AppointmentListController {
    @FXML
    private Label name1;
    @FXML
    private Label name2;
    @FXML
    private Label name3;
    @FXML
    private Label name4;
    @FXML
    private Label name5;
    @FXML
    private Label name6;
    @FXML
    private Label name7;
    @FXML
    private Label name8;
    @FXML
    private Label name9;
    @FXML
    private Label name10;
    @FXML
    private Label date1;
    @FXML
    private Label date2;
    @FXML
    private Label date3;
    @FXML
    private Label date4;
    @FXML
    private Label date5;
    @FXML
    private Label date6;
    @FXML
    private Label date7;
    @FXML
    private Label date8;
    @FXML
    private Label date9;
    @FXML
    private Label date10;
    @FXML
    private Label ID1;
    @FXML
    private Label ID2;
    @FXML
    private Label ID3;
    @FXML
    private Label ID4;
    @FXML
    private Label ID5;
    @FXML
    private Label ID6;
    @FXML
    private Label ID7;
    @FXML
    private Label ID8;
    @FXML
    private Label ID9;
    @FXML
    private Label ID10;
    @FXML
    private Button back;
    @FXML
    private Button dismiss;

    public void goBack(ActionEvent event) throws IOException
    {
        Main o = new Main();
        o.changeScene("doctor.fxml");
    }

    public void dismissApp(ActionEvent event) throws IOException
    {
        Main o = new Main();
        o.changeScene("dismiss.fxml");
    }
    //ekhane name1 Label setText diye oi doctor er table e first row te jei patient ase tar naam dibi database theke
    //emne date1 hoilo first row er date, ID1 first row er ID.
    //10ta entryr jonno 10 ta kore naam, date ar ID. By default kisu dekhabe na.


}
