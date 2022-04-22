package com.example.clinic;
import heirarchy.Doctor;
import heirarchy.Staff;
import heirarchy.User;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.*;
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
    @FXML
    private RadioButton doctor;
    @FXML
    private RadioButton staff;



    public void userLogin(ActionEvent event) throws IOException
    {
        checkLogin();
    }




    public void checkLogin() throws IOException {
        Model_sqlite login_model = new Model_sqlite();
        Main n = new Main();
        if (staff.isSelected()) {
            String query = "select * from user_info where Username = ? and Password = ?";
            try {
                Staff staff = new Staff(Username.getText(), password.getText());
                if (login_model.is_login(staff.getUsername(), staff.getPassword(), query)) {

                    //wrongLogin.setText("Login Successful!");
                    n.changeScene("afterLogin.fxml");


                }
                else {
                    wrongLogin.setText("Wrong Username or Password");
                }

            } catch (Exception e) {
                System.out.println("Problem!");
            }
        } else if (doctor.isSelected()) {
            String query = "select * from doctor_info where Username = ? and Password = ?";
            try {
                Doctor doctor = new Doctor(Username.getText(), password.getText());
                if (login_model.is_login(doctor.getUsername(), doctor.getPassword(), query)) {

                    //wrongLogin.setText("Login Successful!");
                    n.changeScene("doctor.fxml");


                } else {
                    wrongLogin.setText("Wrong Username or Password");
                }


            } catch (Exception e) {
                System.out.println("Problem!");
            }
        }
        else {
            wrongLogin.setText("Choose your division");
        }

        }
    }

