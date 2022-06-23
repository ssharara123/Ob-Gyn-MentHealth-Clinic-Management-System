package Model;

import database.Model_sqlite;

import java.sql.SQLException;

public class Staff extends User{

    public boolean check;
    public Staff (String username, String password) throws SQLException {
        super.setType("STAFF");
        super.setUsername(username);
        super.setPassword(password);
        Model_sqlite x = new Model_sqlite();
        super.setName(Model_sqlite.getNameForStaff(username));
        super.setDateOfBirth(Model_sqlite.getDobForStaff(username));
    }
}
