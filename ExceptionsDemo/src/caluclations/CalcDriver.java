/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package caluclations;

/**
 *
 * @author ajay
 */
public class CalcDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws MyException {
        // TODO code application logic here
        Calculator calc = new Calculator(5, 6);
        try {
            System.out.println(calc.add());
            System.out.println(calc.sub());
            System.out.println(calc.div());
            System.out.println(calc.mul());
        } catch (ArithmeticException ae) {
            System.out.println("We handled " + ae + " " + ae.getMessage());
        } catch(DividedByZeroException ex){
            System.out.println(ex+" "+ex.getMessage());
        }catch(MyException ex){
            System.out.println(ex+" "+ex.getMessage());
        }catch(Exception ex){
            
        }
        finally {
            System.out.println("Finally executes all the time.");
        }
    }

}
