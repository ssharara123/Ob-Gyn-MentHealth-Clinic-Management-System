package Model;

public abstract class People{
    private String Name;
    private String DateOfBirth;
    private String type;
  //    private String ContactNo;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(String dob) {
        DateOfBirth = dob;
    }
}
