/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employees;

/**
 *
 * @author ajay
 */
public class HourlyEmployee extends Employee{
    private int noOfHoursWorked;
    private double wageRate;

    public HourlyEmployee(int noOfHoursWorked, double wageRate, String firstName, String lastName, String ssn) {
        super(firstName, lastName, ssn);
        this.noOfHoursWorked = noOfHoursWorked;
        this.wageRate = wageRate;
    }

    public int getNoOfHoursWorked() {
        return noOfHoursWorked;
    }

    public void setNoOfHoursWorked(int noOfHoursWorked) {
        this.noOfHoursWorked = noOfHoursWorked;
    }

    public double getWageRate() {
        return wageRate;
    }

    public void setWageRate(double wageRate) {
        this.wageRate = wageRate;
    }
    
    public double calcSalary(){
        return noOfHoursWorked * wageRate;
    }
    
    @Override
    public String toString(){
        return super.toString()+" "+"In hrEmployee class." +
                " " + calcSalary();
    }
    
    
    @Override
    public String getFullName(){
        return super.getFirstName()+" "+super.getLastName();
    }
    
}
