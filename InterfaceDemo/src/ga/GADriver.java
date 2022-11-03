/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ga;

import java.util.ArrayList;

/**
 *
 * @author ajay
 */
public class GADriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<GradAssistant> GAs = new ArrayList<>();
        GradAssistant ga1 = new FullGA("John", "123");
        GradAssistant ga2 = new HalfGA("Byron", "234");
        GradAssistant ga3 = new ThreeFourthGA("Ed", "0987");
        GradAssistant ga4 = new FullGA("Becky", "122");
        GradAssistant ga5 = new HalfGA("Lisa", "238");
        GradAssistant ga6 = new ThreeFourthGA("Bob", "0997");
        GAs.add(ga1);GAs.add(ga2);GAs.add(ga3);
        GAs.add(ga4);GAs.add(ga5);GAs.add(ga6);
        
        //System.out.println(GAs);
        for(GradAssistant ga:GAs){
            if(ga instanceof FullGA)
                System.out.println(ga);
        }
        
       // Payable p1 = new Payable();
       //cannot create objects for interface.
       
       //Payable p1 = new GradAssistant(name, ssn);
       //Polymorphic substitution for interfaces and 
       //abstract classes is illegal. 
       
       Payable p1 = new FullGA("Mary", "98776");
       System.out.println(p1);

       
        
        
    }
    
}
