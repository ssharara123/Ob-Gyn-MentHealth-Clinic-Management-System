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




}
