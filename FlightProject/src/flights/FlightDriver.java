/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package flights;

/**
 *
 * @author ajay
 */
public class FlightDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Flight f1 = new Flight("Jet", 3, 10.0);
        
        //testing accessor methods
        System.out.println(f1.getFlightName());//Jet
        
        String fName = f1.getFlightName();
        System.out.println(fName);//Jet
        
        //test setter or mutators
        f1.setFlightName("Lufthansa");
        System.out.println(f1.getFlightName());//Lufthansa
        
        //*********end of f1*********
        
        
    }
    
}
