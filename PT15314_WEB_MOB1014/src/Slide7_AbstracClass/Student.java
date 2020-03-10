/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Slide7_AbstracClass;

/**
 *
 * @author Nguyen Anh Dung
 */
public class Student extends Person{
      private String namePerson = " Đây là bố ab";

    @Override
    void removePerson() {
        System.out.println(" Đây xóa Sinh viên");
    }
      
      

    @Override
    void addnewPerson() {
      System.out.println(" Đây thêm mới Sinh viên" + getNamePerson());
    }



    @Override
    void xoanewPerson1() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    void suanewPerson2() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    void locPerson2() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
