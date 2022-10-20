/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package employees;

/**
 *
 * @author ajay
 */
public class EmployeeDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Employee emp = new Employee("Ajay", "Bandi", "456876-8-757867");
        System.out.println(emp.getFullName());
        System.out.println(emp.toString());
        
        HourlyEmployee hrEmp = new HourlyEmployee(15, 10, "John", "Smith", "123-45-6789");
        System.out.println(hrEmp.calcSalary());
        //Checks for the getFullName method in the 
        //HourlyEmployee first, if not found, then it
        //checks in its super class.
        System.out.println(hrEmp.getFullName());
        System.out.println(hrEmp.toString());
        
        
    }
    
}
