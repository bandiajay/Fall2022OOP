/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraydemo1;

/**
 *
 * @author ajay
 */
public class ArrayDemo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] numbers = new int[5];//creating an array.
        numbers[3] = 22;
        numbers[1] = 21;
        //Print array

        
        //populate the array with its index itself.
        for(int i=0; i<numbers.length; i++){
            numbers[i] = i;
        }
        numbers[3] = 98;
        //numbers[4] = "Maryville";// holds only same type of data
        
        for(int i =0; i<numbers.length; i++){
            System.out.println(numbers[i]);
        }
        
        //Print all the elements using an enhanced for loop/.
        for(int n: numbers){
            System.out.println(n+7);
        }
        
        
    }
    
}
