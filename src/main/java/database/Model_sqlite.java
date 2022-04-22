package database;
import heirarchy.Patient;

import java.sql.*;


public class Model_sqlite {
    private static final Model_sqlite instance = new Model_sqlite();
    public static Model_sqlite getInstance()
    {
        return instance;

    }
    private Patient patient;

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

    public boolean doc_login(String Username,String Password,String Query)
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

    public static String getNameForStaff(String username) throws SQLException {
        /*ResultSet rs = null;
        String sql = "SELECT * From LoginDB where Emailid = ?";
        PreparedStatement pr = this.conection.prepareStatement(sql);
        pr.setString(1,username);
        rs = pr.executeQuery();
        String name = rs.getString("Username");
        rs.close();*/
        String name = "Kuddus";
        return  name;
    }

    public static String getDobForStaff(String username) throws SQLException {
        /*ResultSet rs = null;
        String sql = "SELECT * From LoginDB where Emailid = ?";
        PreparedStatement pr = this.conection.prepareStatement(sql);
        pr.setString(1,username);
        rs = pr.executeQuery();
        String name = rs.getString("Username");
        rs.close();*/
        String dob = "11/10/1987";
        return  dob;
    }

    public static String getNameForDoc(String username) throws SQLException {
        /*ResultSet rs = null;
        String sql = "SELECT * From LoginDB where Emailid = ?";
        PreparedStatement pr = this.conection.prepareStatement(sql);
        pr.setString(1,username);
        rs = pr.executeQuery();
        String name = rs.getString("Username");
        rs.close();*/
        String name = "Saleka";
        return  name;
    }

    public static String getDobForDoc(String username) throws SQLException {
        /*ResultSet rs = null;
        String sql = "SELECT * From LoginDB where Emailid = ?";
        PreparedStatement pr = this.conection.prepareStatement(sql);
        pr.setString(1,username);
        rs = pr.executeQuery();
        String name = rs.getString("Username");
        rs.close();*/
        String dob = "01/12/1977";
        return  dob;
    }

    public static String getNameForPatient(String Id) throws SQLException {
        /*ResultSet rs = null;
        String sql = "SELECT * From LoginDB where Emailid = ?";
        PreparedStatement pr = this.conection.prepareStatement(sql);
        pr.setString(1,username);
        rs = pr.executeQuery();
        String name = rs.getString("Username");
        rs.close();*/
        String name = "Sokina";
        return  name;
    }

    public static String getDobForPatient(String Id) throws SQLException {
        /*ResultSet rs = null;
        String sql = "SELECT * From LoginDB where Emailid = ?";
        PreparedStatement pr = this.conection.prepareStatement(sql);
        pr.setString(1,username);
        rs = pr.executeQuery();
        String name = rs.getString("Username");
        rs.close();*/
        String dob = "04/10/1986";
        return  dob;
    }
    public Patient getPatient()
    {
        return this.patient;
    }
    public boolean searchPatient(String patientName, String patientID)
    {
        con = sqlConnect.connector();
        if (con == null) {
            System.out.println("connection not successful");
            System.exit(1);
        }
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        String Query = "SELECT * FROM Patient_info WHERE Name = ? and PatientID = ?";
        try{
            preparedStatement = con.prepareStatement(Query);
            preparedStatement.setString(1, patientName);
            preparedStatement.setString(2, patientID);
            resultSet = preparedStatement.executeQuery();
            if(resultSet.next())
            {
                patient = new Patient(resultSet.getString("Name"), resultSet.getString("PatientID"),
                        resultSet.getString("Sex"), resultSet.getString("Weight"),
                        resultSet.getString("Contact"), resultSet.getString("BloodGroup"), resultSet.getString("Medication"));

                        return true;

            }

            else
            {return false;}


        }
        catch(SQLException e)
        {
            e.printStackTrace();
            return false;
        }


    }
}
