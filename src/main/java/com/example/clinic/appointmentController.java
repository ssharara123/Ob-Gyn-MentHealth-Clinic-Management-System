package com.example.clinic;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import database.Model_sqlite;
import heirarchy.Patient;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import org.w3c.dom.Text;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Calendar;
import java.util.ResourceBundle;


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


}
