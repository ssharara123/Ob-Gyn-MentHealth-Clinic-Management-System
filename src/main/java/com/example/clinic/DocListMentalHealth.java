package com.example.clinic;

import Model.Patient;
import database.Model_sqlite;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.io.IOException;

public class DocListMentalHealth {

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
        // Dr. Fatema Kabir er table e patient entry add korbi
        try {
            Main o = new Main();
            Model_sqlite model = new Model_sqlite();
            Patient patient=new Patient();
            patient.setName(Name.getText());
            patient.setId(ID.getText());
            patient.setAppointmentDate(Date.getText());
            String Query = "insert into Fatema_Kabir(PatientName,PatientID,AppointmentDate) values(?,?,?)";
            if (model.appointmentAdd(patient.getName(), patient.getId(), patient.getAppointmentDate(), Query)) {
                o.changeScene("appointment2.fxml");
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
            Main o = new Main();
            Model_sqlite model = new Model_sqlite();
            Patient patient=new Patient();
            patient.setName(Name.getText());
            patient.setId(ID.getText());
            patient.setAppointmentDate(Date.getText());
            String Query = "insert into Faisal_Khan(PatientName,PatientID,AppointmentDate) values(?,?,?)";
            if (model.appointmentAdd(patient.getName(), patient.getId(), patient.getAppointmentDate(), Query)) {
                o.changeScene("appointment2.fxml");
            }
        }
        catch(Exception e)
        {
            System.out.println("Hoynai");
        }
    }

    public void chooseRehnuma(ActionEvent event) throws IOException
    {
        try {
            Main o = new Main();
            Model_sqlite model = new Model_sqlite();
            Patient patient=new Patient();
            patient.setName(Name.getText());
            patient.setId(ID.getText());
            patient.setAppointmentDate(Date.getText());
            String Query = "insert into Rehnuma_Bushra(PatientName,PatientID,AppointmentDate) values(?,?,?)";
            if (model.appointmentAdd(patient.getName(), patient.getId(), patient.getAppointmentDate(), Query)) {
                o.changeScene("appointment2.fxml");
            }
        }
        catch(Exception e)
        {
            System.out.println("Hoynai");
        }
    }

    public void goBack(ActionEvent event) throws IOException
    {
        Main o = new Main();
        o.changeScene("appointment1.fxml");
    }
}
