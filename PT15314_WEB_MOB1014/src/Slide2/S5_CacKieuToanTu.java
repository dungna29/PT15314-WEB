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
public class S5_CacKieuToanTu {

    public static void main(String[] args) {
        //Toán tử số học bao gồm + - * /  %(Chia lấy dư)   ++ -- 
        //int a = 5;
        //a++;
        //++a;
        //System.out.println(a);
        //int b = 5;
        //b--;
        //++b;
        //System.out.println(b);

        //Toán tử so sánh > , < , >=, <=, ==, != dùng để so sánh giữa 2 giá trị trả ra giá trị true hoặc false
        //boolean bool = 5 != 9;
        //Toán tử Logic || (hoặc) && (và) !(phủ định) Dùng để
        //boolean boollogic = !((1 > 0) && (8 > 0));
        //Toán tử 3 ngồi <điều kiện> ? <giá trị đúng> : <giá trị sai>
        double diemsv = 8.0;
        String toantubangoi = 5.0 >= 5.2 ? "Toang" : "Hên";
        System.out.println(toantubangoi);
        if (diemsv <= 5.0) {
            System.out.println("Toang");

        }
        if (diemsv > 5.0) {
            System.out.println("Hên");

        }
        if (!false) {
            System.out.println("123");
        }
    }

}
