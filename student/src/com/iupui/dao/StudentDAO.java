package com.iupui.dao;

import com.iupui.model.beans.Student;

import java.util.HashMap;

public class StudentDAO {

    HashMap<Integer, Student> studentHashMap;
    public StudentDAO(){
        this.studentHashMap= new HashMap<Integer, Student>();
    }

    public Student addStudent(String firstName, String lastName, int i) {
        Student student = new Student();
        student.setFirstName(firstName);
        student.setLastName(lastName);
        student.setStudentId(i);
        studentHashMap.put(i,student);
        return student;
    }

    public HashMap<Integer, Student> getAllStudents() {
        return studentHashMap;
    }

    public Student getStudentDetails(int id) {
        return studentHashMap.get(id);
    }
}
