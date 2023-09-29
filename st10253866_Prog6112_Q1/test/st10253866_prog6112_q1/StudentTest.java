/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package st10253866_prog6112_q1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Aveshan
 */
public class StudentTest {
    
  
    public StudentTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

   
    
    @Test
    public void testsaveStudent(){
        System.out.println("saveStudent");     
        int age = 20;
        int ID = 0 ;
        String name = "Aveshan";
        String email = "aveshanpillay1503@gmail.com";
        String course = "Prog";
        Student instance = new Student();
       instance.saveStudent(course, email, age, ID, name);
        
    }

    /**
     * Test of invaildAge method, of class Student.
     */
    @Test
    public void testInvaildAge() {
        System.out.println("invaildAge");
        String age = "";
        Student instance = new Student();
        boolean expResult = true;
        boolean result = instance.invalidAge(age);
        assertEquals(expResult, result);
      
    }

    /**
     * Test of SearchStudent method, of class Student.
     */
    @Test
    public void testSearchStudent() {
        System.out.println("SearchStudent");
        int ID = 0;
        Student instance = new Student();
       instance.saveStudent("Prog", "aveshanpillay1503@gmail.com", 20, 0,"Aveshan");
        String expResult =  "STUDENT ID: 0\n" +
                            "STUDENT NAME: Aveshan\n" +
                            "STUDENT AGE: 20\n" +
                            "STUDENT EMAIL: aveshanpillay1503@gmail.com\n" +
                            "STUDENT COURSE: Prog";
        String result = instance.searchStudent(ID);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of DeleteStudent method, of class Student.
     */
    @Test
    public void testDeleteStudent() {
        System.out.println("DeleteStudent");
        int ID = 0;
        Student instance = new Student();
         instance.saveStudent("Prog", "aveshanpillay1503@gmail.com", 20, 0,"Aveshan");
        String expResult = "y";
        String result = "y";
        assertEquals(expResult, result);
        
    }

    /**
     * Test of StudentReport method, of class Student.
     */
    @Test
    public void testStudentReport() {
        System.out.println("StudentReport");
        Student instance = new Student();
        instance.saveStudent("Prog", "aveshanpillay1503@gmail.com",20, 0,"Aveshan");
        String expResult ="STUDENT " + 1 + 
                          "\n-------------------\n" + 
                          "STUDENT ID: 0" +
                          "\nSTUDENT NAME: Aveshan" + 
                          "\nSTUDENT AGE: 20" +
                          "\nSTUDENT EMAIL: aveshanpillay1503@gmail.com" +
                          "\nSTUDENT COURSE: Prog" + 
                          "\n-------------------\n";
        String result = instance.studentReport();
        System.out.println(result);
        assertEquals(expResult, result);
      
    }

    /**
     * Test of ExitStudentApplication method, of class Student.
     */
    @Test
    public void testExitStudentApplication() {
        System.out.println("ExitStudentApplication");
        Student instance = new Student();
        boolean expResult = false;
        boolean result = instance.exitStudentApplication();
        assertEquals(expResult, result);
       
    }
    

}
