/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Slide8_Static_Final_VARAGRS;

import Slide8.*;

/**
 *
 * @author Nguyen Anh Dung
 */
public class StaticKhoi {
    //Khối static (static blocks): được sử dụng để khởi tạo thành viên dữ liệu static.
    //Khối static được dùng để khởi tạo hoặc thay đổi giá trị của các biến static.
    //Nó được thực thi trước phương thức main tại thời gian tải lớp.
    //Một class có thể có nhiều static blocks.
    private static String tempStatic= "Đây là biến Static";
    //khối static
    static {
        System.out.println("Đây là khối static 1");
    }
    static {
        System.out.println("Đây là khối static 2");
    }
    
    public StaticKhoi() {
        System.out.println("Đã vào hàm main");
        System.out.println("Đây là " + tempStatic);
    }
    public static void main(String[] args) {
        StaticKhoi st = new StaticKhoi();
    }
    
}
