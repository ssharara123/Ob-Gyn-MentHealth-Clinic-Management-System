package com.example.clinic;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import database.Model_sqlite;
import javafx.event.ActionEvent;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class viewController implements Initializable {
        @FXML
        private Button back;

        @FXML
        private Button confirm;
        @FXML
        private TextField name;
        @FXML
        private TextField DoB;
        @FXML
        private TextField sex;
        @FXML
        private TextField weight;
        @FXML
        private TextField blood_group;
        @FXML
        private TextField medicine;
        @FXML
        private TextField contact;
        @FXML
        private TextField id;


    public void goBack(ActionEvent event) throws IOException
    {
        Main q = new Main();
        q.changeScene("doctor.fxml");
    }



    @Override
    public void initialize(URL location, ResourceBundle resources) {

        name.setText(Model_sqlite.getInstance().getPatient().getName());
        sex.setText(Model_sqlite.getInstance().getPatient().getSex());
        weight.setText(Model_sqlite.getInstance().getPatient().getWeight());
        blood_group.setText(Model_sqlite.getInstance().getPatient().getBloodGroup());
        medicine.setText(Model_sqlite.getInstance().getPatient().getMedication());
        contact.setText(Model_sqlite.getInstance().getPatient().getContactNo());
        id.setText(Model_sqlite.getInstance().getPatient().getId());






    }
}
