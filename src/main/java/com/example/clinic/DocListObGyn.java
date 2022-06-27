package com.example.clinic;

import Model.Patient;
import database.Model_sqlite;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.io.IOException;

public class DocListObGyn
{
    @FXML
    private Button sneha;
    @FXML
    private Button maliha;
    @FXML
    private Button dilara;
    @FXML
    private Button back;
    @FXML
    private TextField Name;
    @FXML
    private TextField ID;
    @FXML
    private TextField Date;

    public void chooseSneha(ActionEvent event) throws IOException
    {
        try {
            Main o = new Main();
            Model_sqlite model = new Model_sqlite();
            Patient patient=new Patient();
            patient.setName(Name.getText());
            patient.setId(ID.getText());
            patient.setAppointmentDate(Date.getText());
            String Query = "insert into Sneha_Kamal(PatientName,PatientID,AppointmentDate) values(?,?,?)";
            if (model.appointmentAdd(patient.getName(), patient.getId(), patient.getAppointmentDate(), Query)) {
                o.changeScene("appointment2.fxml");
            }
        }
        catch(Exception e)
        {
            System.out.println("Hoynai");
        }
    }
    public void chooseMaliha(ActionEvent event) throws IOException {
        try {
            Main o = new Main();
            Model_sqlite model = new Model_sqlite();
            Patient patient = new Patient();
            patient.setName(Name.getText());
            patient.setId(ID.getText());
            patient.setAppointmentDate(Date.getText());
            String Query = "insert into Maliha_Ahsan(PatientName,PatientID,AppointmentDate) values(?,?,?)";
            if (model.appointmentAdd(patient.getName(), patient.getId(), patient.getAppointmentDate(), Query)) {
                o.changeScene("appointment2.fxml");
            }
        } catch (Exception e) {
            System.out.println("Hoynai");
        }
    }

    public void chooseDilara(ActionEvent event) throws IOException
    {
        try {
            Main o = new Main();
            Model_sqlite model = new Model_sqlite();
            Patient patient=new Patient();
            patient.setName(Name.getText());
            patient.setId(ID.getText());
            patient.setAppointmentDate(Date.getText());
            String Query = "insert into Dilara_Zaman(PatientName,PatientID,AppointmentDate) values(?,?,?)";
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
