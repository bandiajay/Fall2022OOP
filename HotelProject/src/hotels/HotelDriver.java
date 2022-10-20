/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hotels;

/**
 *
 * @author ajay
 */
public class HotelDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Hotel h1 = new Hotel("Hilton", 4.5, 130);
        //Test getter methods or accessors.
        
        
        System.out.println(h1.getHotelName());
        
        String hName = h1.getHotelName();
        System.out.println(hName);
        
       double rating =  h1.getHotelRating();
        System.out.println(rating);
        
        int price = h1.getPricePerNight();
        System.out.println(price);
        
        //Testing mutators
        
        //changed the hotel name
        h1.setHotelName("Marriot");
        //get the hotel name to check whether the name has 
        //been changed or not.
        System.out.println(h1.getHotelName());
        //***********Done with h1*************
        
        //****start h2***********
        
        
    }
    
}
