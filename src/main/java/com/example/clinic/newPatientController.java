package com.example.clinic;

import database.Model_sqlite;
import Model.Patient;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.io.IOException;

public class newPatientController
{
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
        q.changeScene("afterLogin.fxml");
    }

    public void newConfirm(ActionEvent event) throws IOException {

        Model_sqlite model = new Model_sqlite();
        Main r = new Main();
        try {
            Patient patient=new Patient(id.getText());
            patient.setName(name.getText());
            patient.setBloodGroup(blood_group.getText());
            patient.setContactNo(contact.getText());
            patient.setSex(sex.getText());
            patient.setWeight(weight.getText());
            patient.setDateOfBirth(DoB.getText());
            patient.setMedication(medicine.getText());
            if (model.information_add(patient.getName(),patient.getDateOfBirth(),patient.getSex(),patient.getWeight(),patient.getBloodGroup(),patient.getMedication(),patient.getContactNo(),patient.getId())) {
                System.out.println("added");
            }
        }catch(Exception e)
        {
            System.out.println("Problem in information add!");
        }
    }

}




