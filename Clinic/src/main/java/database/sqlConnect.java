package database;
import java.sql.*;

public class sqlConnect {
    public static Connection connector()
    {
        try{
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:Project_database.db");
            return conn;

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        } catch (SQLException e){
            e.printStackTrace();

        }
        return null;
    }
}
