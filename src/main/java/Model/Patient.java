package Model;

import database.Model_sqlite;

import java.sql.SQLException;

public class Patient extends People{

    private String Id;
    private String Sex;
    private String Weight;
    private String ContactNo;
    private String BloodGroup;
    private String Medication;
    private String Diagnosis;
    private String Symptoms;


    public Patient(String name, String Id, String Sex, String Weight, String ContactNo, String BloodGroup,String Medication )
    {
        setName(name);
        this.Id = Id;
        this.Sex = Sex;
        this.Weight = Weight;
        this.ContactNo = ContactNo;
        this.BloodGroup = BloodGroup;
        this.Medication = Medication;
        this.Diagnosis = Diagnosis;
        this.Symptoms = Symptoms;




    }

    public Patient()
    {

    }

    public String getSex() {
        return Sex;
    }

    public void setSex(String sex) {
        Sex = sex;
    }

    public String getWeight() {
        return Weight;
    }

    public void setWeight(String weight) {
        Weight = weight;
    }

    public String getContactNo() {
        return ContactNo;
    }

    public void setContactNo(String contact) {
        ContactNo = contact;
    }

    public String getBloodGroup() {
        return BloodGroup;
    }

    public void setBloodGroup(String bloodgroup) {
        BloodGroup = bloodgroup;
    }

    public String getMedication() {
        return Medication;
    }

    public void setMedication(String medication) {
        Medication = medication;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public Patient (String id) throws SQLException {
        super.setType("PATIENT");
        Model_sqlite x = new Model_sqlite();
        //this.Id = id;
        super.setName(Model_sqlite.getNameForPatient(id));
        super.setDateOfBirth(Model_sqlite.getDobForPatient(id));
    }
}


