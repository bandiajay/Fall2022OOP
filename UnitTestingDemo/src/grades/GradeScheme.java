/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grades;

/**
 *
 * @author ajay
 */
public class GradeScheme {

    public static String getGrade(int score) {
        if (score <= 70) {
            return "D";
        } else if (score < 80) {
            return "C";
        } else {
            return "A";
        }
    }

}
