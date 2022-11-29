/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caluclations;

/**
 *
 * @author ajay
 */
public class Calculator {
    private int num1;
    private int num2;

    public Calculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
    
    public int add(){
        return num1+num2;
    }
    
    public int sub() throws MyException{
        if(num2>num1){
            throw new MyException("The differene cannot be neagtive");
        }
        return num1-num2;
    }
    
    public int mul(){
        return num1*num2;
    }
    
    public int div(){
        if(num2 == 0){
            //throw an Exception
            throw new DividedByZeroException("Denominator cannot "
                    + "be zero.");
        }
        return num1/num2;
    }
}
