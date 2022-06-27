package com.example.clinic;

import com.example.database.Model_sqlite;
import com.example.Model.Patient;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class updatePatientController {
    @FXML
    private TextField p_name;
    @FXML
    private TextField p_id;
    @FXML
    private Button search;
    @FXML
    private Button back;
    @FXML
    private Label wrongInfo;


    public void back(ActionEvent event) throws IOException
    {
        Main q = new Main();
        q.changeScene("afterLogin.fxml");
    }
    public void search(ActionEvent event) throws IOException
    {
        Model_sqlite patient_model = new Model_sqlite();
        Main s= new Main();
        String query="select * from Patient_info where Name = ? and PatientID = ?";
        try {
            Patient oldPatient=new Patient(p_id.getText());
            if (patient_model.is_login(oldPatient.getName(), oldPatient.getId(),query,"Patient")) {

                s.changeScene("afterLogin.fxml");

            }
            else
            {
                wrongInfo.setText("Wrong Information!");
            }
        }catch(Exception e)
        {
            System.out.println("Problem!");
        }
    }


}
