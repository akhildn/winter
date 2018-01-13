package com.iupui.controller;

import com.iupui.dao.StudentDAO;
import com.iupui.model.beans.Student;

import java.util.HashMap;
import java.util.Random;

public class ControllerImpl implements Controller {

    StudentDAO studentDAO;
    int studentId;
    public ControllerImpl(){
         this.studentDAO = new StudentDAO();
         studentId = 20000000;
    }

    @Override
    public boolean addStudent(String firstName, String lastName) {
        Student student = studentDAO.addStudent(firstName, lastName, studentId++);
        if (student != null)
            return true;
        return false;
    }

    @Override
    public boolean retrieveStudentDb() {
        HashMap<Integer, Student> studentHashMap = studentDAO.getAllStudents();
        if(studentHashMap.isEmpty()){
            return false;
        }
        return true;
    }

    @Override
    public Student retrieveStudentInfoById() {
        return null;
    }
}
