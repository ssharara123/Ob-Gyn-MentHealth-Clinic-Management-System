package com.example.helloworldjavafx;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static com.example.helloworldjavafx.Model_sqlite.conection;

public class Controller {
    private Stage stage;
    private Scene scene;
    private Parent root;


    public boolean is_login(String Username,String Password)
    {
        conection = sqlConnect.connector();
        if (conection == null) {
            System.out.println("connection not successful");
            System.exit(1);
        }
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        String Query = "select * from user_info where Username = ? and Password = ?";

        try {
            preparedStatement = conection.prepareStatement(Query);
            preparedStatement.setString(1,Username);
            preparedStatement.setString(2,Password);
            resultSet = preparedStatement.executeQuery();
            if(resultSet.next())
            {
                return true;
            }
            else
            {
                return false;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
        finally {
            try {
                preparedStatement.close();
                resultSet.close();
            }
            catch (SQLException e)
            {
                e.printStackTrace();
            }
        }
    }

}
