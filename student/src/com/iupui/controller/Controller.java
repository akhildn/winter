package com.iupui.controller;

import com.iupui.model.beans.Student;

public interface Controller {

    public boolean addStudent(String firstName, String lastName);
    public boolean retrieveStudentDb();
    public Student retrieveStudentInfoById();
}
