/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ga;

/**
 *
 * @author ajay
 */
public class ThreeFourthGA extends GradAssistant {

    public ThreeFourthGA(String name, String ssn) {
        super(name, ssn);
    }

    @Override
    public double calcSalary() {
        return 0.75 * MAX_SALARY;
    }

    @Override
    public double calcTutitionWaiver() {
        return MAX_TUTION*3/4.0;
    }
    
}
