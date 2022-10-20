/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package scannerdemo;

import java.util.Scanner;

/**
 *
 * @author ajay
 */
public class ScannerDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the name: ");
        String name = scan.next();
        scan.nextLine();
        System.out.println("Enter the job title: ");
        String title = scan.nextLine();
        System.out.println("Enter the age: ");
        int age = scan.nextInt();
        System.out.println("Enter the salary");
        double salary = scan.nextDouble();
        System.out.println("Enter the course");
        scan.nextLine();
        String course = scan.nextLine();
        System.out.println("Enter the college name: ");
        String collegeName = scan.nextLine();
        System.out.println("Enter the state name: ");
        String state = scan.next();
        
        System.out.println(name + "-" + title +"-" + age + "-" +
                salary+" "+course + " "+ collegeName +" "+state);
        
    }
    
}
