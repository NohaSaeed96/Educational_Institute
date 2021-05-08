package com.AI;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Subject> subjectList = new ArrayList<Subject>();
        Subject s1 = new Subject("Math",95);
        Subject s2 = new Subject("Database",90);
        Subject s3 = new Subject("Java",80);
        subjectList.add(s1);
        subjectList.add(s2);
        subjectList.add(s3);
        Student st1 = new Student("Noha", 2696 );

        }

    }

