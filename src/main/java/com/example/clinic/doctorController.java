package com.example.clinic;

import com.example.database.Model_sqlite;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class doctorController extends Main implements Initializable {
   
    @FXML
    private Button check;
    @FXML
    private Button back;
    @FXML
    private Button update;
    @FXML
    private TextField doctorName;
    @FXML
    private TextField DoctorDegree;
    @FXML
    private TextField department;
    @Override
    public void initialize(URL location, ResourceBundle resources)
    {
        System.out.println(Model_sqlite.getInstance().get_doctor().getName());
        doctorName.setText(Model_sqlite.getInstance().get_doctor().getName());
        DoctorDegree.setText(Model_sqlite.getInstance().get_doctor().getDegree());
        department.setText(Model_sqlite.getInstance().get_doctor().getDepartment());


    }
    public void check(ActionEvent e) throws IOException
    {

        super.changeScene("tableview.fxml");
    }



    public void logout(ActionEvent event) throws IOException
    {
        super.changeScene("login.fxml");
    }

    public void update(ActionEvent event) throws IOException
    {
        super.changeScene("searchPatient.fxml");
    }

}
