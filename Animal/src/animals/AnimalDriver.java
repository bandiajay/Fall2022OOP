/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package animals;

/**
 *
 * @author AJAY
 */
public class AnimalDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Animal a1 = new Animal();
        System.out.println(a1);
        
        Animal a2 = new Animal("Frog", 0.5, true);
        System.out.println(a2);
        
        Animal a3 = new Animal("Turtle", 5);
        System.out.println(a3);
        
        Animal a4 = new Animal("Dog");
        System.out.println(a4);

    }
}
