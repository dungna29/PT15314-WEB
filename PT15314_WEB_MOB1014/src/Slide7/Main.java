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
public class Main {
    
    public static void main(String[] args) {        
        Student st = new Student("ph00532", "Tran Van Duy");
        System.out.println(st.getNamePerson() + " " + st.getIdStudent());        
        st.addNewPerson();//Hàm này của lớp cha
        Teacher tc = new Teacher("ID00555", "Vu Quoc Luat");
        System.out.println(tc.getNamePerson() + " " + tc.getIdTeacher());
        tc.addNewPerson();//Hàm này của lớp cha
        LopChau lc = new LopChau("IDCHAU", "", "ABC");
        lc.addNewPerson();//Đây là cháu
        System.out.println("----------------");
        Person p = new Teacher();
        p.addNewPerson();
    }
    
}
