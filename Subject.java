package com.AI;
public class Subject {
    private String Name ;
    private Integer Grade ;
    public Subject(String name,Integer grade) {
        this.Name = name;
        this.Grade = grade;
    }

    public void setName(String name) {
        Name = name;
    }
    public String getName() {
        return Name;
    }
    public void setGrade(Integer grade){
        Grade = grade;
    }
    public Integer getGrade(){
        return Grade;
    }
}
