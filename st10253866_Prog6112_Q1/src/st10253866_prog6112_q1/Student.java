/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package st10253866_prog6112_q1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Aveshan
 */
public class Student {
  
    // ArrayLists to store student information
    private ArrayList<Integer> studentID = new ArrayList<>();
    private ArrayList<String> studentName = new ArrayList<>();
    private ArrayList<Integer> studentAge = new ArrayList<>();
    private ArrayList<String> studentEmail = new ArrayList<>();
    private ArrayList<String> studentCourse = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    // Method to capture student details
    public void studentDetail() {
        int ID;
        boolean isValidID = false;

        // Validate and obtain a unique student ID
        do {
            try {
                System.out.print("Enter a valid ID: ");
                ID = Integer.parseInt(sc.next());

                // Check for duplicate ID
                if (studentID.contains(ID)) {
                    System.out.println("This ID is already in use. Please enter a different ID.");
                } else {
                    isValidID = true; // Mark the ID as valid
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid ID, try again.");
                ID = -1; // Set ID to an invalid value to continue the loop
            }
        } while (!isValidID);

        System.out.println("Please enter the student's name");
        String name = sc.next();

        String age;

        // Validate and obtain a valid student age
        do {
            System.out.print("Enter age: ");
            age = sc.next();
        } while (invalidAge(age));

        System.out.println("Valid age entered: " + age);

        System.out.println("Please enter the student's Email");
        String email = sc.next();

        System.out.println("Please enter the Student's Course");
        String course = sc.next();

        // Save student details
        saveStudent(course, email, Integer.parseInt(age), ID, name);
    }

    // Method to validate student age
    public boolean invalidAge(String age) {
        try {
            int studentAge = Integer.parseInt(age);
            if (studentAge >= 16) {
                return false; // Age is valid
            } else {
                System.out.println("You have entered an incorrect student age!!! \n Please re-enter"
                        + "the student's age  >>>");
            }
        } catch (NumberFormatException e) {
            System.out.println("You have entered an incorrect student age!!! \n Please re-enter"
                    + "the student's age >>>");
        }
        return true; // Age is invalid
    }

    // Method to save student details
    public void saveStudent(String course, String email, int age, int ID, String name) {
        System.out.println("CAPTURED NEW STUDENT\n **************");
        studentID.add(ID);
        studentName.add(name);
        studentAge.add(age);
        studentEmail.add(email);
        studentCourse.add(course);
        System.out.println("Enter the student ID: " + ID
                + "\nEnter the student name: " + name
                + "\nEnter the student age: " + age
                + "\nEnter the student email: " + email
                + "\nEnter the student course: " + course);
    }

    // Method to search for a student by ID
    public String searchStudent(int ID) {
        for (int x = 0; x < studentID.size(); x++) {
            if (ID == studentID.get(x)) {
                return "STUDENT ID: " + studentID.get(x) +
                        "\nSTUDENT NAME: " + studentName.get(x) +
                        "\nSTUDENT AGE: " + studentAge.get(x) +
                        "\nSTUDENT EMAIL: " + studentEmail.get(x) +
                        "\nSTUDENT COURSE: " + studentCourse.get(x);
            }
        }
        return "Invalid ID number, student with ID: " + ID + " NOT FOUND";
    }

    // Method to delete a student by ID
    public String deleteStudent(int ID) {
        for (int x = 0; x < studentID.size(); x++) {
            if (ID == studentID.get(x)) {
                System.out.println("Enter Yes (y) to confirm");
                String tempValue = sc.next();
                if ("y".equals(tempValue)) {
                    studentID.remove(x);
                    studentName.remove(x);
                    studentAge.remove(x);
                    studentEmail.remove(x);
                    studentCourse.remove(x);
                    return "Student with ID " + ID + " WAS deleted!";
                } else {
                    return "Action was canceled by the user";
                }
            }
        }
        return "Student with ID: " + ID + " was not found";
    }

    // Method to generate a student report
    public String studentReport() {
        int i = 0;
        String output = "";
        for (int id : studentID) {
            output += "STUDENT " + (i + 1) + "\n-------------------\n"
                    + "STUDENT ID: " + id +
                    "\nSTUDENT NAME: " + studentName.get(i) + "\nSTUDENT AGE: " +
                    studentAge.get(i) + "\nSTUDENT EMAIL: " + studentEmail.get(i)
                    + "\nSTUDENT COURSE: " + studentCourse.get(i) + "\n-------------------\n";
            i++;
        }
        return output;
    }

    // Method to exit the student application
    public boolean exitStudentApplication() {
        System.out.println("The Application is exited");
        return false;
    }
}