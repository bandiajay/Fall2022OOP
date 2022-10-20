/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package flights;

/**
 *
 * @author ajay
 */
public class Flight {
    private String flightName;
    private int flightDuration;
    private double flightPrice;
    
    public Flight(String flightNameIn, int flightDurationIn, double flightPriceIn){
        flightName = flightNameIn;
        flightDuration = flightDurationIn;
        flightPrice = flightPriceIn;
    }
    
    public String getFlightName(){
        return flightName;
    }
    
    public int getFlightDuration(){
        return flightDuration;
    }
    
    public double getFlightPrice(){
        return flightPrice;
    }
    
    public void setFlightName(String flightNameIn){
        flightName = flightNameIn;
    }
    
    public void setFlightDuration(int flightDurationIn){
        flightDuration = flightDurationIn;
    }
    
    public void setFlightPrice(double flightPriceIn){
        flightPrice = flightPriceIn;
    }
}
