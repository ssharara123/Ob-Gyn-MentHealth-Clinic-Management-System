package com.example.clinic;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.io.IOException;


public class appointmentController {

    @FXML
    private Button back;
    @FXML
    private Button confirm;
    @FXML
    private DatePicker setDate;
    @FXML
    private ChoiceBox doctor_list;
    @FXML
    private RadioButton new_p;
    @FXML
    private RadioButton recur_p;
    @FXML
    private TextField name;

    ObservableList<String> doctor = FXCollections.observableArrayList();

    public void initialize()
    {
        doctor_list.setItems(doctor);
        doctor_list.setValue("Choose Doctor");
    }

    public void back(ActionEvent event) throws IOException {
        Main p = new Main();
        p.changeScene("afterLogin.fxml");
    }








}
