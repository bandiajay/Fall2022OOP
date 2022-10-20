/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cars;

/**
 *
 * @author AJAY
 */
public class CarDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Car c1 = new Car("Ford", 12, true);
        System.out.println(c1);
        
        Car c2 = new Car("Toyato", false);
        System.out.println(c2);
        
        Car c3 = new Car("Mazda");
        System.out.println(c3);
        
        Car c4 = new Car();
        System.out.println(c4);
                
    }
    
}
