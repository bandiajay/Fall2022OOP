/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package students;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author ajay
 */
public class StudentDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Scanner scan = new Scanner(new File("studentInput.txt"));
        PrintWriter write = new PrintWriter(new File("output.txt"));
        while(scan.hasNext()){
            String name  = scan.nextLine();
            int age = scan.nextInt();
            scan.nextLine();//skip
            String schedule = scan.nextLine();
            boolean attendance = scan.nextBoolean();
            scan.nextLine(); //skip
            String comment = scan.nextLine();
            Student s = new Student(name, age, schedule,
                    attendance, comment);
            System.out.println(s);
            write.println(s);
        }
        write.close();
    }
    
}
