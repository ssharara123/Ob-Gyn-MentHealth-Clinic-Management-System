package com.example.clinic;

import database.Model_sqlite;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.sql.SQLException;

public class searchController {
    @FXML
    private Button searchbutton;
    @FXML
    private TextField nameField;
    @FXML
    private TextField Idfield;

    @FXML
    private Button back;

    public void search(ActionEvent e) {
        if (Model_sqlite.getInstance().searchPatient(nameField.getText(), Idfield.getText())) {
            Main q = new Main();
            try {
                q.changeScene("ViewPatient.fxml");

            } catch (IOException ex) {
                ex.printStackTrace();
            }

        }
    }

    public void back(ActionEvent event) throws IOException
    {
        Main k = new Main();
        k.changeScene("doctor.fxml");
    }
}


