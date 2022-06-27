package com.example.clinic;

import com.example.Model.Patient;
import com.example.database.Model_sqlite;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class DocListMentalHealth extends Main {

    @FXML
    private Button fatema;
    @FXML
    private Button faisal;
    @FXML
    private Button rehnuma;
    @FXML
    private Button back;
    @FXML
    private TextField Name;
    @FXML
    private TextField ID;
    @FXML
    private TextField Date;



    public void chooseFatema(ActionEvent event) throws IOException
    {
        try {

            Model_sqlite model = new Model_sqlite();
            Patient patient=new Patient();
            patient.setName(Name.getText());
            patient.setId(ID.getText());
            patient.setAppointmentDate(Date.getText());
            String Query = "insert into Fatema_Kabir(PatientName,PatientID,AppointmentDate) values(?,?,?)";

                if (model.appointmentAdd(patient.getName(), patient.getId(), patient.getAppointmentDate(), Query)) {
                super.changeScene("appointment2.fxml");
            }




        }
        catch(Exception e)
        {
            System.out.println("Hoynai");
        }
    }
    public void chooseFaisal(ActionEvent event) throws IOException
    {
        try {
            Model_sqlite model = new Model_sqlite();
            Patient patient=new Patient();
            patient.setName(Name.getText());
            patient.setId(ID.getText());
            patient.setAppointmentDate(Date.getText());
            String Query = "insert into Faisal_Khan(PatientName,PatientID,AppointmentDate) values(?,?,?)";
            if (model.appointmentAdd(patient.getName(), patient.getId(), patient.getAppointmentDate(), Query)) {
                super.changeScene("appointment2.fxml");
            }
        }
        catch(Exception e)
        {
            System.out.println("Hoynai");
        }    }

    public void chooseRehnuma(ActionEvent event) throws IOException
    {
        super.changeScene("appointment2.fxml");
    }

    public void goBack(ActionEvent event) throws IOException
    {
        super.changeScene("appointment1.fxml");
    }
}
