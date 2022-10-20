/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package students;

/**
 *
 * @author ajay
 */
public class Student {
    private String name;//multiple words
    private int age;
    private String schedule;//multiple words
    private boolean attendance;
    private String comment;//multiple words

    public Student(String name, int age, String schedule, boolean attendance, String comment) {
        this.name = name;
        this.age = age;
        this.schedule = schedule;
        this.attendance = attendance;
        this.comment = comment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public boolean isAttendance() {
        return attendance;
    }

    public void setAttendance(boolean attendance) {
        this.attendance = attendance;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", age=" + age + ", schedule=" + schedule + ", attendance=" + attendance + ", comment=" + comment + '}';
    }
    
    
}
