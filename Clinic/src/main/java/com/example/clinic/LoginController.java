package com.example.clinic;
import heirarchy.Staff;
import heirarchy.User;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.event.ActionEvent;

import java.io.IOException;
import java.sql.*;
import database.Model_sqlite;

public class LoginController
{
    public LoginController()
    {
    }
    @FXML
    private Button login_button;
    @FXML
    private Label wrongLogin;
    @FXML
    private TextField Username;
    @FXML
    private PasswordField password;


    public void userLogin(ActionEvent event) throws IOException
    {
        checkLogin();
    }
    public void checkLogin() throws IOException{
        Model_sqlite login_model = new Model_sqlite();
        Main n = new Main();
        String query="select * from user_info where Username = ? and Password = ?";
        try {
            Staff staff = new Staff(Username.getText(), password.getText());
            if (login_model.is_login(staff.getUsername(), staff.getPassword(),query)) {

                //wrongLogin.setText("Login Successful!");
                n.changeScene("afterLogin.fxml");


            } else {
                wrongLogin.setText("Wrong username or password!");
            }

        }catch(Exception e)
        {
            System.out.println("Problem!");
        }
    }

}
