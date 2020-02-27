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
//subclass là lớp con
public class Student extends Person {

    private String idStudent;

    public Student(String idStudent, String namePerson) {
        super(namePerson);
        this.idStudent = idStudent;
    }

    public String getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(String idStudent) {
        this.idStudent = idStudent;
    }
    String quocgia = "POLY";
    @Override
    void addNewPerson() {
        System.out.println("Đây là hàm thêm mới sinh viên" + getNamePerson());
        //super.removePerson();//super từ khóa đại diện cho cả 1 lớp cha để nó gọi đến trực tiếp cha của nó
        System.out.println(quocgia);//In ra biến trong class của con
        System.out.println(super.quocgia);
        super.addNewPerson();//Gọi hàm từ lớp cha để kế thừa toàn bộ hàm lớp cha
    }

}
