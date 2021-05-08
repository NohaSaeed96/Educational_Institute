package com.AI;
import java.util.List;

public class Student extends Person {
    private Integer ID;
    private List<Subject> Courses;

    public Student(String name, int ID) {
        super(name);
        this.ID=ID;

    }


    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public void setCourses(List<Subject> courses) {
        Courses = courses;
    }

    public List<Subject> getCourses() {
        return Courses;
    }
    public Integer TotalGrades(){
        int totalgrades=0 ;
        for(Subject s : Courses){
            totalgrades+=s.getGrade();
        }
        return totalgrades;
    }
}