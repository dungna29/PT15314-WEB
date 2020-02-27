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
public class Teacher extends Person {

    private String idTeacher;
    String quocgia = "POLY TEACHER";

    public Teacher() {
    }

    public Teacher(String idTeacher, String namePerson) {
        super(namePerson);
        this.idTeacher = idTeacher;
    }

    public String getIdTeacher() {
        return idTeacher;
    }

    public void setIdTeacher(String idTeacher) {
        this.idTeacher = idTeacher;
    }

    @Override
    void addNewPerson() {
        System.out.println("Đây là thêm mới giáo viên");
    }
    
    

}
