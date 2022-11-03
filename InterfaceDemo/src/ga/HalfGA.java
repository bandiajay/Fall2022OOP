/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ga;

/**
 *
 * @author ajay
 */
public class HalfGA extends GradAssistant{

    public HalfGA(String name, String ssn) {
        super(name, ssn);
    }

    @Override
    public double calcSalary() {
        return MAX_SALARY/2.0;
    }

    @Override
    public double calcTutitionWaiver() {
        return MAX_TUTION/2.0;
    }
    
    
}
