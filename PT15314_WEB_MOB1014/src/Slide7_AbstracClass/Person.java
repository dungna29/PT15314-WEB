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
public abstract class Person {
    private String namePerson = " Đây là bố ";

    public String getNamePerson() {
        return namePerson;
    }

    public void setNamePerson(String namePerson) {
        this.namePerson = namePerson;
    }
    
    //Hàm non - abstract  
    void removePerson(){
        //body
    }
    
    //Đây là khai báo các hàm abstract - Không có Body(Thân code bên trong hàm)
    //Khi lớp con kế thừa sẽ phải kế thừa toàn bộ hàm có từ khóa abstract ở đầu
    abstract void addnewPerson();

    abstract void xoanewPerson1();

    abstract void suanewPerson2();
    
    abstract void locPerson2();

}
