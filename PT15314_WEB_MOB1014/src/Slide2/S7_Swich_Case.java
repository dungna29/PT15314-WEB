/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Slide2;

import java.util.Scanner;

/**
 *
 * @author Nguyen Anh Dung
 */
public class S7_Swich_Case {

    public static void main(String[] args) {
        //Switch Case (Menu)
        //Thực hiện 2 phép toán cộng hoặc trừ
        Scanner sc = new Scanner(System.in);
        int input, a, b, c;
        System.out.println("Mời bạn nhập 2 số: ");
        System.out.print("Số thứ nhất : ");
        a = sc.nextInt();
        System.out.println("Số thứ hai : ");
        b = sc.nextInt();
        System.out.println("1. Phép tính cộng");
        System.out.println("2. Phép tính trừ");
        System.out.println("3. Phép tính nhân");
        System.out.println("Mời bạn chọn phép tính");
        input = sc.nextInt();
        switch (input) {
            case 1://Mỗi một case là một chức năng nào đó bạn thực hiện
                //Số 1 là từ khóa để chọn được vào chức năng đó.
                System.out.print("Phép toán cộng giữa 2 số a và b =" + (c = a + b));
                break;//Phải có lệnh break để không chạy sang các chức năng khác trong switch case.
            case 2:
                System.out.print("Phép toán trư giữa 2 số a và b =" + (c = a - b));
                break;
            case 3:
                System.out.print("Phép toán nhân giữa 2 số a và b =" + (c = a * b));
                break;
            case 4:
                System.out.print("Chức năng thêm sinh đang được Code");
                break;
            default:
                System.out.print("Rất lấy làm tiếc chức năng bạn chọn không tồn tại");
                break;
        }

    }
}
