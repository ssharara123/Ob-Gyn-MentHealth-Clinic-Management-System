package com.example.clinic;

import Model.Patient;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
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
        private Button update;
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

        @FXML
        private Label updateLabel;


    public void goBack(ActionEvent event) throws IOException
    {
        Main q = new Main();
        q.changeScene("doctor.fxml");
    }



    @Override
    public void initialize(URL location, ResourceBundle resources) {

        name.setText(Model_sqlite.getInstance().getPatient().getName());
        DoB.setText(Model_sqlite.getInstance().getPatient().getDateOfBirth());
        sex.setText(Model_sqlite.getInstance().getPatient().getSex());
        weight.setText(Model_sqlite.getInstance().getPatient().getWeight());
        blood_group.setText(Model_sqlite.getInstance().getPatient().getBloodGroup());
        medicine.setText(Model_sqlite.getInstance().getPatient().getMedication());
        contact.setText(Model_sqlite.getInstance().getPatient().getContactNo());
        id.setText(Model_sqlite.getInstance().getPatient().getId());


    }
    public void Update(ActionEvent event) throws IOException {

        Model_sqlite model = new Model_sqlite();
        //Main r = new Main();
        try {
            Patient patient=new Patient();
            patient.setName(name.getText());
            patient.setBloodGroup(blood_group.getText());
            patient.setContactNo(contact.getText());
            patient.setSex(sex.getText());
            patient.setWeight(weight.getText());
            patient.setDateOfBirth(DoB.getText());
            patient.setMedication(medicine.getText());
            patient.setId(id.getText());
            if (model.information_update(patient.getName(),patient.getDateOfBirth(),patient.getSex(),patient.getWeight(),patient.getBloodGroup(),patient.getMedication(),patient.getContactNo(),patient.getId(), patient.getSymptoms(), patient.getHistory())) {
                updateLabel.setText("Update Successful!");
            }
        }catch(Exception e)
        {
            System.out.println("Problem in update!");
        }
    }
}
