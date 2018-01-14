package com.iupui.controller;

import com.iupui.model.beans.Student;

import java.util.HashMap;

public interface Controller {

    public boolean addStudent(String firstName, String lastName);
    public HashMap<Integer, Student> retrieveStudentDb();
    public Student retrieveStudentInfoById(int id);
}
