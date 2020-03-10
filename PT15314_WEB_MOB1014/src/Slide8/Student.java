/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Slide8;

/**
 *
 * @author Nguyen Anh Dung
 */
public class Student extends Person {

    private String studentID;
    private double gpa;

    public Student() {
    }

    public Student(String studentID, double gpa, String firstName, String midleName, String lastName, int yearofBird, String Address) {
        super(firstName, midleName, lastName, yearofBird, Address);
        this.studentID = studentID;
        this.gpa = gpa;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    String ValuatePerson() {
        if (gpa >= 8) {
            return "Xuất Sắc";
        } else if (gpa < 8) {
            return "Giỏi";
        } else if (gpa <= 6) {
            return "Khá";
        } else {
            return "Học lại";
        }
    }

    @Override
    void OutputPerson() {
        System.out.printf("Tên SV: %s %s %s Năm sinh SV: %d Mã SV: %s GPA SV: %f \nĐịa chỉ: %s \n", getFirstName(), getMidleName(), getLastName(), getYearofBird(), getStudentID(), getGpa(), getAddress());
        System.out.println("-------------");
    }

    @Override
    void InputPerson() {

    }

    void InputStudent() {

    }

    void OutputStudent() {

    }

    void ValuateStudent() {

    }

}
