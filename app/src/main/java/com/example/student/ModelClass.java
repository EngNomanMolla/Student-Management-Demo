package com.example.student;

public class ModelClass {
   String Semester,Roll,Name;

    public String getSemester() {
        return Semester;
    }

    public void setSemester(String semester) {
        Semester = semester;
    }

    public String getRoll() {
        return Roll;
    }

    public void setRoll(String roll) {
        Roll = roll;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public ModelClass(String semester, String roll, String name) {
        Semester = semester;
        Roll = roll;
        Name = name;
    }
}
