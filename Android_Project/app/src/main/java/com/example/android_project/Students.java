package com.example.android_project;

public class Students {
    String stdName, stdID, crsName, crsCode, crsCredit;

    public Students(String studentName, String studentID, String courseName, String courseCode, String courseCredit) {
        this.stdName = studentName;
        this.stdID = studentID;
        this.crsName = courseName;
        this.crsCode = courseCode;
        this.crsCredit = courseCredit;
    }

    public String getStudentName() {
        return stdName;
    }

    public String getStudentID() {
        return stdID;
    }

    public String getCourseName() {
        return crsName;
    }

    public String getCourseCode() {
        return crsCode;
    }

    public String getCourseCredit() {
        return crsCredit;
    }
}
