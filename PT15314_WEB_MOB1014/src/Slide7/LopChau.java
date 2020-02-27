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
public class LopChau extends Student{
    private String idChau;
     String quocgia = "POLY TEACHER";
    public LopChau(String idChau, String idStudent, String namePerson) {
        super(idStudent, namePerson);
        this.idChau = idChau;
    }

    public String getIdChau() {
        return idChau;
    }

    public void setIdChau(String idChau) {
        this.idChau = idChau;
    }

    @Override
    void addNewPerson() {
        System.out.println("Đây làm hàm thêm mới cháu");
        System.out.println(super.quocgia);
    }
    
    

   
    

    
    
}
