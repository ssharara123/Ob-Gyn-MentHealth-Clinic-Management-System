package com.example.clinic;

import com.example.database.Model_sqlite;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class searchController extends Main{
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


        if (Model_sqlite.getInstance().searchPatient(nameField.getText(), Idfield.getText())) {

            try
            {
                super.changeScene("ViewPatient.fxml");

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

        LoginController x = new LoginController();

       if(Model_sqlite.getInstance().get_type().equals("Staff"))
       { super.changeScene("afterLogin.fxml");}

        else if(Model_sqlite.getInstance().get_type().equals("Doctor"))
        { super.changeScene("doctor.fxml");}
    }
}


