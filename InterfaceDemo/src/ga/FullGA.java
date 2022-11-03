/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ga;

/**
 *
 * @author ajay
 */
public class FullGA extends GradAssistant {

    public FullGA(String name, String ssn) {
        super(name, ssn);
    }
    

    @Override
    public double calcSalary() {
        return MAX_SALARY;
    }

    @Override
    public double calcTutitionWaiver() {
        return MAX_TUTION;
    }
    
}
