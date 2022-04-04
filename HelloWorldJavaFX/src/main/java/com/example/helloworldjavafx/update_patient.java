package com.example.helloworldjavafx;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import org.w3c.dom.Text;

import java.io.IOException;

public class update_patient {



    @FXML
    private TextField p_name;
    @FXML
    private TextField p_id;
    @FXML
    private Button search;
    @FXML
    private Button back;


    public void back(ActionEvent event) throws IOException
    {
        HelloApplication q = new HelloApplication();
        q.changeScene("afterLogin.fxml");
    }
    public void search(ActionEvent event) throws IOException
    {
        Model_sqlite patient_model = new Model_sqlite();
        HelloApplication s= new HelloApplication();
        String query="select * from Patient_info where Name = ? and PatientID = ?";
        try {
            if (patient_model.is_login(p_name.getText(), p_id.getText(),query)) {

                s.changeScene("afterLogin.fxml");

            }
        }catch(Exception e)
        {
            System.out.println("Problem!");
        }
    }

    }



