/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trees;

/**
 *
 * @author ajay
 */
public class Tree {
    private String name; //treeName
    private double height;
    private boolean fruits;

    public Tree(String name, double height, boolean fruits) {
        this.name = name;
        this.height = height;
        this.fruits = fruits;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public boolean isFruits() {
        return fruits;
    }

    public void setFruits(boolean fruits) {
        this.fruits = fruits;
    }
    
    public String toString(){
//        return "Tree Name = " + name + "\n" +
//                "Tree Height = " + height + "\n" +
//                "Tree fruits = " + fruits + "\n" +
//                "I am done!";

        return name + "-" + height + "-"+ fruits;
    }
}
