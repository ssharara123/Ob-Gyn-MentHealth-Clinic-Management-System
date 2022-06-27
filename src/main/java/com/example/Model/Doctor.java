package com.example.Model;

import com.example.database.Model_sqlite;

import java.sql.SQLException;

public class Doctor extends User{
    private String Department;   //OB-Gyn or MentalHealth
    private String Degree;
    private String Name;
    private int VisitFee;
    public boolean check;
    public String getName()
    {
        return Name;
    }
    public void setName(String name)
    {
        Name=name;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String dept) {
        Department = dept;
    }

    public int getVisitFee() { return VisitFee; }

    public void setVisitFee(int fee) {
        VisitFee = fee;
    }

    public String getDegree() {
        return Degree;
    }

    public void setDegree(String degree) {
        Degree = degree;
    }

    public Doctor (String username, String password) throws SQLException {
        super.setType("DOCTOR");
        super.setUsername(username);
        super.setPassword(password);
        Model_sqlite y = new Model_sqlite();
        super.setName(Model_sqlite.getNameForDoc(username));
        super.setDateOfBirth(Model_sqlite.getDobForDoc(username));
    }
    public Doctor(String name,String degree,String department)
    {
        Name=name;
        Degree=degree;
        Department=department;


    }

}
