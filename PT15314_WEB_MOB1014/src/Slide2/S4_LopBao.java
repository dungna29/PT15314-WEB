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
public class S4_LopBao {

    public static void main(String[] args) {
        //Lớp bao tương ứng với các kiểu dữ liệu nguyên thủy và có chữ cái đầu tiên viết hoa
        Double d1 = 5.6;
        double d2 = 5.9;
        Double a1 = Double.valueOf(5); // bao tường minh
        Double a2 = new Double(5); // bao tường minh      
        Double a3 = 5.6; // bao ngầm định
        System.out.println(a3);
        

        double b = a1.doubleValue();// mở bao tường minh
        double b1 = a1; // mở bao ngầm định

    }
}
