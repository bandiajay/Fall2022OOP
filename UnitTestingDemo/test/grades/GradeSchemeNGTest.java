/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package grades;

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author ajay
 */
public class GradeSchemeNGTest {
    
    public GradeSchemeNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        System.out.println("Before class");                
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
        System.out.println("After class");
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        System.out.println("Before method");

    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
        System.out.println("After method");

    }

    

    /**
     * Test of getGrade method, of class GradeScheme.
     */
    @Test
    public void testGetGrade() {
        System.out.println(" Testing getGrade");
        int score = 79;
        String expResult = "C";
        String result = GradeScheme.getGrade(score);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
