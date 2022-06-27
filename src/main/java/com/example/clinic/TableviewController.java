package com.example.clinic;

import com.example.Model.Patient;
import com.example.database.Model_sqlite;
import com.example.database.sqlConnect;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class TableviewController implements Initializable {
    @FXML
    private TableView<Patient> patientTable;
    @FXML
    private TableColumn<Patient, String> PatientName;
    @FXML
    private TableColumn<Patient, String> PatientID;
    @FXML
    private TableColumn<Patient, String> appointment;
    String query = null;
    Connection connection = null;
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;
    Patient patient = null;

    ObservableList<Patient> patientList = FXCollections.observableArrayList();

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        try {
            Model_sqlite x = new Model_sqlite();
            String query=null;
            switch (Model_sqlite.getInstance().get_doctor().getName())
            {
                case "Dr. Fatema Kabir":
                    query="select * from Fatema_Kabir";
                    break;
                case "Dr. Maliha Ahsan":
                    query="select * from Maliha_Ahsan";
                    break;
                case "Dr. Sneha Kamal":
                    query="select * from Sneha_Kamal";
                    break;
                case "Dr. Dilara Zaman":
                    query="select * from Dilara_Zaman";
                    break;
                case "Dr. Faisal Khan":
                    query="select * from Faisal_Khan";
                    break;
                case "Dr. Rehnuma Bushra":
                    query="select * from Rehnuma_Bushra";
                    break;



            }
            System.out.println(Model_sqlite.getInstance().get_doctor().getName());
            x.loadDate(patientList,query);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        PatientName.setCellValueFactory(new PropertyValueFactory<>("Name"));
        PatientID.setCellValueFactory(new PropertyValueFactory<>("Id"));
        appointment.setCellValueFactory(new PropertyValueFactory<>("AppointmentDate"));
        patientTable.setItems(patientList);

    }
    public void back(ActionEvent e) throws IOException
    {
        Main t=new Main();
        t.changeScene("doctor.fxml");
    }

}