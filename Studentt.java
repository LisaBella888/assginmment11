package Person;

import java.util.Date;

class Student extends Person {

    private float gpa;
    private String major;

    public Student(String id, String fullName, Date dateOfBirth, float gpa, String major) {
        super(id, fullName, dateOfBirth);
        this.gpa = gpa;
        this.major = major;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void displayInfo() {
        System.out.println("ID: " + getId() + ", Name: " + getFullName()
                + ", DOB: " + getDateOfBirth() + ", GPA: " + gpa
                + ", Major: " + major);
    }

    @Override
    public void displayinfor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
