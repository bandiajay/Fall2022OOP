/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ga;

/**
 *
 * @author ajay
 */
public abstract class GradAssistant implements Payable {
    private String name;
    private String ssn;

    public GradAssistant(String name, String ssn) {
        this.name = name;
        this.ssn = ssn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    @Override
    public String toString() {
        return "GradAssistant{" + "name=" + name + ", ssn=" + ssn + '}';
    }
    
    
    
}
