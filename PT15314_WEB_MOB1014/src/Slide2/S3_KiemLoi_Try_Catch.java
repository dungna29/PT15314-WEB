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
public class S3_KiemLoi_Try_Catch {

    public static void main(String[] args) {
        // Kiểm lỗi Khối try trong Java được sử dụng để bao quanh code mà có thể ném một Exception. 
        int a;
        
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhập vào 1 số nguyên:");
            a = sc.nextInt();
            System.out.println(a);
        } catch (Exception e) {
            System.out.println("Mày không đọc đề à");

        }

    }

}
