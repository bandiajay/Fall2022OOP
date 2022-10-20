/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animals;

/**
 *
 * @author AJAY
 */
public class Animal {
    private String name;
    private double weight;
    private boolean amphibian;

    public Animal(String name, double weight, boolean amphibian) {
//        this.name = name;
//        this.weight = weight;
//        this.amphibian = amphibian;
          this.setName(name);
          this.setWeight(weight);
          this.setAmphibian(amphibian);
    }

    public Animal(String name, double weight) {
        this.name = name;
        this.weight = weight;
        this.amphibian = true;
    }

    public Animal(String name) {
        this.name = name;
        this.weight = Math.abs(-1.1);
        this.amphibian = true;
    }
    
    public Animal(){
        this.name = "Not yet invented!";
        this.weight = -99.9;
        this.amphibian = true;
    }
    
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = Math.abs(weight);
    }

    public boolean isAmphibian() {
        return amphibian;
    }

    public void setAmphibian(boolean amphibian) {
        this.amphibian = amphibian;
    }

    @Override
    public String toString() {
        return "Animal{" + "name=" + name + ", weight=" + weight + ", amphibian=" + amphibian + '}';
    }
    
    
           
}
