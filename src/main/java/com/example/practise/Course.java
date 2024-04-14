package com.example.practise;

public class Course {
    private int crn;
    private String courseCode, courseName;

    public Course(int crn, String courseCode, String courseName) {
        setCrn(crn);
        setCourseCode(courseCode);
        setCourseName(courseName);
    }

    public int getCrn() {
        return crn;
    }

    public void setCrn(int crn) {
        this.crn = crn;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        String courseCodePattern = "[A-Z]{4} \\S [0-9]{4}";
        courseCode = courseCode.toUpperCase();

        if(courseCode.matches(courseCodePattern))
            this.courseCode = courseCode;
        else
            throw new IllegalArgumentException("Invalid course code");

        this.courseCode = courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
}