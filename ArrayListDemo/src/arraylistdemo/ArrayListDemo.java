/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraylistdemo;

import java.util.ArrayList;

/**
 *
 * @author ajay
 */
public class ArrayListDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> cities = new ArrayList<String>();
        cities.add("Maryville");
        cities.add("St. Jo.");
        cities.add("Kansas City");
        
        System.out.println(cities.size());
        System.out.println(cities);
        
        System.out.println("*******");
        for(String city :cities){
            System.out.println(city); 
       }
        System.out.println("********");
        
        cities.add(1, "Chicago");
        System.out.println(cities);
        
        //cities.add(5, "Memphis"); //exception
        cities.add(4, "Memphis");
        System.out.println(cities);
        
        cities.set(3, "Boston");
        System.out.println(cities);
        
        cities.remove(2);
        cities.remove("Maryville");
        
        System.out.println(cities);
        
        cities.add("Chicago");
        System.out.println(cities);
        
        cities.remove("Chicago");
        System.out.println(cities);
        
        //accessing second element.
        System.out.println(cities.get(1)); 
        
        
        ArrayList<Integer> myInts = new ArrayList<Integer>();
        myInts.add(1);
        myInts.add(2);
        myInts.add(3);
        myInts.add(3);
        myInts.add(7);
        myInts.add(4);
        myInts.add(2, 8);
        myInts.remove(3);//index 3 will be removed.
        System.out.println(myInts);
        //remove the element 8.
        //myInts.remove(8); //exception because of index>size
        int element8 = myInts.indexOf(8);
        myInts.remove(element8);
        System.out.println(myInts);
        
        //myInts.remove(Integer.valueOf("8"));
        
        System.out.println(myInts.remove(Integer.valueOf("7"))); 
        System.out.println(myInts);
        
        //myInts.add(new Integer(99));//deprecated
        myInts.add(new Integer(99));
        System.out.println(myInts);
       
        
        
    }
    
}
