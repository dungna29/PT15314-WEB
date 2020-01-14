/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Slide2;

/**
 *
 * @author LegendNguyen
 */
public class S1_KieuDuLieu {

    public static void main(String[] args) {
        //1.Kiểu dữ liệu
        //Kiểu số nguyên
        byte b = 5; //Byte gọi là kiểu lớp bao ôm lấy kiểu dữ liệu nguyên thủy đó
        short h = 9;//Short
        int i1 = 5;
        long c = 6;//2 cách khai báo biến kiểu long
        long c1 = 6l;
        long c2 = 6L;
        //Kiểu ký tự
        char ch = '1';
        char ch1 = 'a';
        //Kiểu số thực
        float f = 8.6f;//Chú ý chữ f hoa hoặc F
        float f1 = 8.6F;
        double d1 = 9.2;
        double d2 = 1.6d;
        double d3 = 1.6D;
        // Kiểu chuỗi
        String str = "1977 Vlog";
        // Kiểu logic
        boolean bl = true;
        boolean b2 = false;
        // byte temp = 128;
        //Giá trị lớn nhất và nhỏ nhất của từng kiểu dữ liệu
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);

    }

}
