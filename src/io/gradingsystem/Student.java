package io.gradingsystem;

public class Student {
    private String std_Id;
    private static int count ;
    private String firstName;
    private String lastName;
    private float marksObtained ;

    static {
        count=01;
    }

    public Student (String firstName , String lastName, float marksObtained) {
        this.std_Id = "CS-" + count++;
        this.firstName = firstName;
        this.lastName = lastName;
        this.marksObtained = marksObtained;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public float getMarksObtained() {
        return marksObtained;
    }

    public void setMarksObtained(float marksObtained) {
        this.marksObtained = marksObtained;
    }

    public String getStd_Id() {
        return std_Id;
    }

    public void setStd_Id(String std_Id) {
        this.std_Id = std_Id;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Student.count = count;
    }

    @Override
    public String toString() {
        return "Student Id: " + this.std_Id+" " +"Name: " + this.firstName +" " + this.lastName + " "+"Marks Obtained :" + this.marksObtained;
    }
}

