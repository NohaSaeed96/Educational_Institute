package com.AI;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;


public class Instructor extends Person {
    private Time OfficeHours ;
    private List<Subject> Courses;

    public void setCourses(List<Subject> courses) {
        Courses = courses;
    }

    public Instructor(String name) {
        super(name);
    }

    public List<Subject> getCourses() {
        return Courses;
    }

    public Time getOfficeHours() {
        return OfficeHours;
    }

    public void setOfficeHours(Time officeHours) {
        OfficeHours = officeHours;
    }
    public List<String> displayInfo(){
        List<String> info = new ArrayList<String>();
        info.add(Name);
        info.add(String.valueOf(OfficeHours));
        info.add(String.valueOf(Courses));
        return info ;



    }
}
