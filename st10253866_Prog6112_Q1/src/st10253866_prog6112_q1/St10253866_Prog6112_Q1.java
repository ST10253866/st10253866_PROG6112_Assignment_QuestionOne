/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package st10253866_prog6112_q1;

import java.util.Scanner;

/**
 *
 * @author Aveshan
 */
public class St10253866_Prog6112_Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a Student object
        Student st = new Student();
        Scanner kb = new Scanner(System.in);

        System.out.println("STUDENT MANAGEMENT APPLICATION\n******************");
        System.out.println("Enter (1) to launch the menu or any other key to exit");

        if (kb.next().matches("1")) {
            while (true) {
                display(); // Display the program menu
                String choice = kb.next(); // Read user's choice

                switch (choice) {
                    case "1":
                        st.studentDetail(); // Capture a new student
                        break;
                    case "2":
                        System.out.println("Enter the Student ID to search");
                        System.out.println(st.searchStudent(kb.nextInt())); // Search for a student
                        break;
                    case "3":
                        System.out.println("Enter ID to delete");
                        System.out.println(st.deleteStudent(kb.nextInt())); // Delete a student
                        break;
                    case "4":
                        System.out.println(st.studentReport()); // Print student report
                        break;
                    case "5":
                        st.exitStudentApplication(); // Exit the application
                        return; // Exit the method and stop the program
                    default:
                        System.out.println("Invalid choice");
                        break;
                }

                System.out.println("Enter 1 to launch the menu or any other key to exit");
                if (!kb.next().equals("1")) {
                    st.exitStudentApplication(); // Exit the application
                    return; // Exit the method and stop the program
                }
            }
        } else {
            st.exitStudentApplication();
        }
    }// main

    // Display the program menu
    public static void display() {
        System.out.println("Please select one of the following: \n"
                + "(1) Capture a new student\n"
                + "(2) Search for a student\n"
                + "(3) Delete a student\n"
                + "(4) Print Student Report\n"
                + "(5) Exit the Application");
    }
}
    

