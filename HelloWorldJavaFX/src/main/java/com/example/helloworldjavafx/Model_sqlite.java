package com.example.helloworldjavafx;
import java.sql.*;


public class Model_sqlite {
    public static Connection conection;
    public static Connection con;
    public Model_sqlite () {
        conection = sqlConnect.connector();
        if (conection == null) {
            System.out.println("connection not successful");
            System.exit(1);
        }
    }

    public boolean isDbConnected() {
        try {
            return !conection.isClosed();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return false;
        }
    }
    public boolean is_login(String Username,String Password,String Query)
    {
        conection = sqlConnect.connector();
        if (conection == null) {
            System.out.println("connection not successful");
            System.exit(1);
        }
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

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
    public boolean information_add(String Pname, String DateOfBirth, String Psex,String Pweight,String BG,String Med,String cont,String Pid) {
        con = sqlConnect.connector();
        if (con == null) {
            System.out.println("connection not successful");
            System.exit(1);
        }
        PreparedStatement pst;
        try {
            pst = con.prepareStatement("insert into Patient_info(Name,BirthDate,Sex,Weight,BloodGroup,Medication,Contact,PatientID) values(?,?,?,?,?,?,?,?)");
            pst.setString(1, Pname);
            pst.setString(2, DateOfBirth);
            pst.setString(3, Psex);
            pst.setString(4,Pweight);
            pst.setString(5, BG);
            pst.setString(6, Med);
            pst.setString(7, cont);
            pst.setString(8,Pid);
            int status = pst.executeUpdate();
            if (status == 1)
            {
                return true;
            }
            else
            {
                return false;
            }
        } catch (SQLException e) {

            e.printStackTrace();
            System.out.println("bhejaal");
            return false;

        }
    }
}

