package com.example.helloworldjavafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import org.w3c.dom.Text;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class NewPatient
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
        HelloApplication q = new HelloApplication();
        q.changeScene("afterLogin.fxml");
    }

    public void newConfirm(ActionEvent event) throws IOException {

        Model_sqlite model = new Model_sqlite();
        HelloApplication r = new HelloApplication();
        try {
            if (model.information_add(name.getText(),DoB.getText(),sex.getText(),weight.getText(),blood_group.getText(),medicine.getText(),contact.getText(),id.getText())) {
                r.changeScene("afterLogin.fxml");
            }
        }catch(Exception e)
        {
            System.out.println("Problem in information add!");
        }
    }

    }




