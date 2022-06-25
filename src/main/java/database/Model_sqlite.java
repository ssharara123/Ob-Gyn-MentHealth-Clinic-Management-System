package database;
import Model.Doctor;
import Model.Patient;
import Model.Staff;

import java.sql.*;


public class Model_sqlite {
    private static final Model_sqlite instance = new Model_sqlite();
    public static Model_sqlite getInstance()
    {
        return instance;

    }
    private Patient patient;
    private Doctor doctor;
    private Staff staff;
    private String type;


    public static Connection conection;
    public static Connection con;

    public Doctor get_doctor()
    {
        return doctor;
    }
    public Staff get_staff()
    {
        return staff;
    }

    public String get_type()
    {
        return type;
    }
    public void set_type(String type)
    {
       this.type = type;
    }
    public void set_doctor(Doctor doctor)
    {
       // this.doctor.setUsername(doctor.getUsername());
       // this.doctor.setPassword(doctor.getPassword());
        this.doctor = doctor;


    }
    public void set_staff(Staff staff)
    {
       // this.staff.setUsername(staff.getUsername());
       // this.staff.setPassword(staff.getPassword());
        this.staff = staff;


    }
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

    /*public boolean doc_login(String Username,String Password,String Query)
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
    } */


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
    public boolean information_update(String Pname, String DateOfBirth, String Psex,String Pweight,String BG,String Med,String cont,String Pid) {
        try {
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
       con = sqlConnect.connector();
        if (con == null) {
            System.out.println("connection not successful");
            System.exit(1);
        }
        PreparedStatement pst;
        try {
            System.out.println("Line 1");
            pst = con.prepareStatement("UPDATE Patient_info SET Name=?,BirthDate=?,Sex=?,Weight=?,BloodGroup=?,Medication=?,Contact=? WHERE PatientID=?");
            pst.setString(1, Pname);
            pst.setString(2, DateOfBirth);
            pst.setString(3, Psex);
            pst.setString(4,Pweight);
            pst.setString(5, BG);
            pst.setString(6, Med);
            pst.setString(7, cont);
            pst.setString(8,Pid);
            System.out.println("line 2");

            int status = pst.executeUpdate();
            if (status == 1)
            {
                return true;
            }
            else
            {
                System.out.println("line 3");
                return false;
            }
        } catch (SQLException e) {

            //e.printStackTrace();
            System.out.println("SQL Exception Found");
            System.out.println(e.getMessage());
            return false;

        }
        catch(Exception e)
        {
            System.out.println("Normal Exception Found");
            System.out.println(e.getMessage());
            return false;
        }
        finally
        {
            try {
                //pst.close();
                con.close();
                //System.out.println("Yes in update database");
            }
            catch (SQLException e) {
                e.printStackTrace();
            }
            catch (NullPointerException e) {
                System.out.println(e);
            }
            catch(Exception e) {
                System.out.println(e);
            }
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
                patient = new Patient(resultSet.getString("Name"), resultSet.getString("BirthDate"),resultSet.getString("PatientID"),
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
