/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Slide4;

import java.util.Scanner;

/**
 *
 * @author Nguyen Anh Dung
 */

//Đối tượng ở đây là đối tượng Person(Người)
public class Person {

    //Đây là các thuộc tính của đối tượng
    String MS;
    String HoVaTen;
    int Tuoi;
    String DayMon;
    String Nghanh;
    String Phong;

    //(hàm) Method
    void NhapDuLieuGV() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập thông tin");
        System.out.println("Mời bạn nhập Mã Giáo Viên: ");
        MS = sc.nextLine();
        System.out.println("Mời bạn nhập Tên Giáo Viên: ");
        HoVaTen = sc.nextLine();
        System.out.println("Mời bạn nhập GV Dạy Môn: ");
        DayMon = sc.nextLine();
        System.out.println("Mời bạn nhập Tuổi Giáo Viên: ");
        Tuoi = sc.nextInt();
    }

    void NhapDuLieuSV() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập thông tin");
        System.out.println("Mời bạn nhập Mã SV: ");
        MS = sc.nextLine();
        System.out.println("Mời bạn nhập Tên SV: ");
        HoVaTen = sc.nextLine();
        System.out.println("Mời bạn nhập Nghành SV: ");
        Nghanh = sc.nextLine();
        System.out.println("Mời bạn nhập Tuổi SV: ");
        Tuoi = sc.nextInt();
    }

    void InRaManHinhGV() {
        System.out.println("Thông tin Giáo viên: " + MS + "Tên: " + HoVaTen + "TuổiGV: " + Tuoi + "Dạy Môn: " + DayMon);
    }

    void InRaManHinhSV() {
        System.out.println("Thông tin SV: " + MS + "Tên: " + HoVaTen + "TuổiSV: " + Tuoi + "Nghành: " + Nghanh);

    }

}
