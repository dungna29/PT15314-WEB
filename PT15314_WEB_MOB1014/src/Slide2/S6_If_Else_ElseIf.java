/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Slide2;

import java.util.Scanner;

/**
 *
 * @author LegendNguyen
 */
public class S6_If_Else_ElseIf {

    public static void main(String[] args) {
        //If
//        String temp;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Bạn có muốn đi uống tà tưa không?");
//        temp = sc.nextLine();
//        if (temp.equals("co")) {
//            System.out.println("Thì tí hết giờ đi");
//            
//        } else {
//            System.out.println("Chắc không?");
//            
//        }
//        if (temp.equals("co")) { // Điểu kiện trong if phải đúng (True) 
//            System.out.println("Thì tí hết giờ đi");//Sau khi thỏa mãn if thì sẽ thực hiện câu lệnh
//
//        } else {// Phủ định của if là else
//            System.out.println("Chắc không?");//Sau khi không thỏa mãn if thì sẽ vào else
//
//        }
//        double gpa = 5;
//        if (gpa >= 8) {
//            System.out.println("Bạn được học sinh giỏi");
//
//        } else if (gpa >= 6 && gpa < 8) {
//            System.out.println("Bạn được học tiên tiến");
//        } else if (gpa >= 5 && gpa < 6) {
//            System.out.println("Bạn được học sing trung bình");
//        } else {
//            System.out.println("Bạn phải học lại");
//
//        }
        Scanner sc = new Scanner(System.in);
        String input; 
        int a,b;
        System.out.println("1. Phép cộng");
        System.out.println("2. Phép trừ");
        System.out.println("Mời bạn chọn phép tính mà bạn muốn?");
        input = sc.nextLine();
        if (input.equals("1")) {
            System.out.println("Mời bạn nhập số thứ nhất : ");
            a = sc.nextInt();
            System.out.println("Mời bạn nhập số thứ hai : ");
            b = sc.nextInt();
            System.out.println("Kết quả phết tính cộng là:"+ (a + b));
        }else if (input.equals("2")) {
            
        }

    }

}
