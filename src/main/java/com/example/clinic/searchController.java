package com.example.clinic;

import com.example.database.Model_sqlite;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class searchController {
    @FXML
    private Button searchbutton;
    @FXML
    private TextField nameField;
    @FXML
    private TextField Idfield;
    @FXML
    private Label wrongInfo;
    @FXML
    private Button back;

    public void search(ActionEvent e) {
        Main q = new Main();

        if (Model_sqlite.getInstance().searchPatient(nameField.getText(), Idfield.getText())) {

            try
            {
                q.changeScene("ViewPatient.fxml");

            } catch (IOException ex) {
                ex.printStackTrace();
            }

        }
        else
        {
            wrongInfo.setText("Wrong Information");
        }

    }

    public void back(ActionEvent event) throws IOException
    {
        Main k = new Main();
        LoginController x = new LoginController();

       if(Model_sqlite.getInstance().get_type().equals("Staff"))
       { k.changeScene("afterLogin.fxml");}

        else if(Model_sqlite.getInstance().get_type().equals("Doctor"))
        { k.changeScene("doctor.fxml");}
    }
}


