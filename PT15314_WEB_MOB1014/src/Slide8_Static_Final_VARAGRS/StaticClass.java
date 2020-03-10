/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Slide8_Static_Final_VARAGRS;

/**
 *
 * @author Nguyen Anh Dung
 */
public class StaticClass {
     private String name;
    //Lớp static (static class): một class được có thể được đặt là static chỉ khi nó là một nested
    //class. Một  nested static class có thể được truy cập mà không cần một object 
    //của outer class (lớp bên ngoài).
    StaticClass (String name) {
        this.name = name;
    }
     
    // nested static class
    static class inSideClass {
        public static String TruongDay = "POLY";
    }
     
    public void print() {
        System.out.println("Tên môn = " + name);
        System.out.println("Trường = " + inSideClass.TruongDay);
    }
     
    public static void main(String[] args) {
        StaticClass ex1 = new StaticClass("JAVA1");
        ex1.print();
    }
    
}
