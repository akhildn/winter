package com.iupui;

import com.iupui.controller.Controller;
import com.iupui.controller.ControllerImpl;
import com.iupui.model.beans.Student;

import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Controller controller = new ControllerImpl();
        do{
           System.out.println("1. add new student");
           System.out.println("2. Retrieve all Students");
           System.out.println("3. Get info my id");
           System.out.println("4. Exit");


            int choice = in.nextInt();
            if(choice>=0 && choice<=4){
                switch (choice){
                    case 1:
                        System.out.println("***********Enter Student Details***********");
                        System.out.println("First name:");
                        String fname = in.next();
                        System.out.println("last name:");
                        String lname = in.next();
                        controller.addStudent(fname,lname);
                        break;
                    case 2:
                        HashMap<Integer, Student> studentHashMap = controller.retrieveStudentDb();
                        if(studentHashMap != null){
                            for ( int id: studentHashMap.keySet()) {
                                Student student = studentHashMap.get(id);
                                System.out.println(student.getFirstName() + "\t" + student.getLastName() + "\t" +
                                    student.getStudentId());
                            }
                        }
                        break;
                    case 3:
                        System.out.println("enter student id: ");
                        int id = in.nextInt();
                        Student student = controller.retrieveStudentInfoById(id);
                        System.out.println(student.getFirstName() + "\t" + student.getLastName() + "\t" +
                                student.getStudentId());
                        break;
                    case 4:
                        System.exit(0);
                        break;
                    default:
                        break;
                }
            }else{
                System.out.println("Invalid input, please enter one of four given choices");
            }

        }while(true);

    }
}
