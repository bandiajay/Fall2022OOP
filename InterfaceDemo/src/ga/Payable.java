/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ga;

/**
 *
 * @author ajay
 */
public interface Payable {
    //It has abstract methods and constants
    public static final double MAX_SALARY = 750;
    public static final double MAX_TUTION = 3000;
    public abstract double calcSalary();
    public abstract double calcTutitionWaiver();
    
    
}
