/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotels;

/**
 *
 * @author ajay
 */
public class Hotel {
    //Declare private instance variables.
    private String hotelName;
    private double hotelRating;
    private int pricePerNight;
    
    public Hotel(String hotelNameIn, double hotelRatingIn, int pricePerNightIn){
        hotelName = hotelNameIn;
        hotelRating = hotelRatingIn;
        pricePerNight = pricePerNightIn;
    }
    
    public String getHotelName(){
        return hotelName;
    }
    
    public double getHotelRating(){
        return hotelRating;
    }
    
    public int getPricePerNight(){
        return pricePerNight;               
    }
    
    public void setHotelName(String hotelNameIn){
        hotelName = hotelNameIn;
    }
    
    public void setHotelRating(double hotelRatingIn){
        hotelRating = hotelRatingIn;
    }
    
    public void setPricePerNight(int pricePerNightIn){
        pricePerNight = pricePerNightIn;
    }
}//end hotel
