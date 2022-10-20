/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraydemo2;

/**
 *
 * @author ajay
 */
public class ArrayDemo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //create an array of type integer of size 5.
        int[] numbers = new int[5];
        numbers[2] = 75;
        numbers[4] = 27;
        //numbers[5] = 34;//exception as it does not exist.
        
        for(int i=0; i<numbers.length; i++){
            numbers[i] = (int) Math.pow(2, i);
        }
        
        for(int i=0; i<numbers.length; i++){
            System.out.println(numbers[i]);
        }
        
        
        
        System.out.println(numbers[4]);
        System.out.println("*************");
        for(int i:numbers){
            System.out.println(i);
        }
        
    }
    
}
