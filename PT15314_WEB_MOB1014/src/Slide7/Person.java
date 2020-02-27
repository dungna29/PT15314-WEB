/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Slide7;

/**
 *
 * @author Nguyen Anh Dung
 */
//superclass là lớp cha
public class Person {
    private String namePerson = " Đây là bố ";
    String quocgia = "VietNam";

    public Person() {
    }

    public Person(String namePerson) {
        this.namePerson = namePerson;
    }

    public String getNamePerson() {
        return namePerson;
    }

    public void setNamePerson(String namePerson) {
        this.namePerson = namePerson;
    }
    
    void addNewPerson(){
        System.out.println("Đây phương thức addNewPerson");
    }
    
     void removePerson(){
        System.out.println("Đây phương thức Xóa của Person");
    }
    
    
}
