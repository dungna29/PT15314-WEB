/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ass;

import java.util.Scanner;

/**
 *
 * @author LegendNguyen
 */
public class Main {

    public static void main(String[] args) {
        Menu();
        do {
            System.out.println("Mời người dùng nhập");
            String input1 = "Y";
            input1.toLowerCase();
            
            if (input1.length() >1) {
                System.out.println("Bạn đã nhập quá 1 ký tự");
            } else if (input1.equals("y")) {
                //Thực hiên 1 chứu nào đó
                break;

            } else if (input1.equals("n")) {                
                //Thực hiên 1 chứu nào đó 
                break;
            }
            System.out.println("Bạn vui lòng nhập đúng theo yêu cầu");
        } while (true);

    }

    static void Menu() {
        System.out.println("****** Chương Trình Quản Lý SV & GV                             ******");
        System.out.println("****** 1.Thêm Mới Sinh Viên & Thêm Mới Giáo Viên                ******");
        System.out.println("****** 2.Chỉnh Sử Giờ Dạy Giáo Viên                             ******");
        System.out.println("****** 3.Chỉnh Sử Mã Sinh Viên Theo Mã SV                       ******");
        System.out.println("****** 4.DS Sinh Viên Và Giáo Viên                              ******");
        System.out.println("****** 5.Tìm Các Sinh Viên Theo Điểm Trung Bình                 ******");
        System.out.println("****** 6.Xóa Sinh Viên Theo Mã SV                               ******");
        System.out.println("****** 7.Xuất 5 Sinh Viên có số điểm cao hoặc thấp              ******");
        System.out.println("****** 8.Sắp xếp Sinh Viên và Giáo Viên Theo Tên                ******");
        System.out.println("****** 9.Xuất 5 giáo viên có số giờ dạy cao nhất hoặc thấp nhất ******");
        System.out.println("****** 10.Xuất danh sách sinh viện được học bổng hoặc học lại   ******");
        Hamchucnang();

    }

    static void Hamchucnang() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn chọn chức năng của chương :");
        int input = sc.nextInt();
        //Switch case

        switch (input) {
            case 1:
                System.out.println("Vào chức năng 1");
                //Triển khai các chứng năng bên trong nó
                break;
            case 2:
                System.out.println("Vào chức năng 2");
                break;
            case 3:
                System.out.println("Vào chức năng 3");
                // break; không sử dụng thì sẽ đọc xuống tiếp
                break;
            case 4:
                System.out.println("Vào chức năng 4");
                break;
            default:
                System.out.println("Không có chức năng đó");

        }

    }

}
