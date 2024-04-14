package com.example.practise;

import java.time.LocalDate;
import java.util.ArrayList;

public class Student extends Person{
    private int studentNumber;
    private ArrayList<Grade> gardes;

    public Student(String firstName, String lastName, String address, LocalDate birthday, int studentNumber, ArrayList<Grade> gardes) {
        super(firstName, lastName, address, birthday);
        setStudentNumber(studentNumber);
        this.gardes = gardes;
    }

    //new constructor for new students
    public Student(String firstName, String lastName, String address, LocalDate birthday, int studentNumber) {
        super(firstName, lastName, address, birthday);
        setStudentNumber(studentNumber);
        this.gardes = new ArrayList<>();
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        if (studentNumber >= 100000000 && studentNumber <= 999999999)
            this.studentNumber = studentNumber;
        else
            throw new IllegalArgumentException("student number must be 9 characters long");
    }

    public ArrayList<Grade> getGardes() {
        return gardes;
    }

    public void setGardes(ArrayList<Grade> gardes) {
        this.gardes = gardes;
    }
    public String toString(){
        return String.format("%s, student Number: %d", super.toString(),studentNumber, getAvgGrade());
    }

    public double getAvgGrade(){
        if(gardes.size() == 0)
            return  -1;

        double total = 0;
        for(Grade grade : gardes)
            total += grade.getGrade;

        return total/gardes.size();
    }
}
