/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Slide1;

import java.util.Scanner;

/**
 *
 * @author Nguyen Anh Dung
 */
public class S2_NhapXuatDuLieu {

    public static void main(String[] args) {
        // *********** Xuất Dữ liệu ra màn hình ***********
        //System.out.print(): Xuất xong không xuống dòng
        //System.out.println(): Xuất xong có xuống dòng
        //System.out.printf(): Xuất có định dạng, các ký tự định dạng
        // %d: số nguyên , %f: số thực, %s: chuỗi, \n: xuống dòng
        //System.out.printf("Đào tạo %d \nnghề", 12);
        System.out.print("Nguyen Anh Dung");
        System.out.println("Nguyen Anh Dung");
        System.out.print("Mạc Văn Khoa");
        System.out.println("");
        System.out.printf("Chào Bạn %s đã gia nhập khóa học JAVA1", "Dũng");//Cấu trúc 1 cái lệnh xuất ra màn hình có format ("Dũng" là giá trị cho %s)
        System.out.println("");
        System.out.printf("Chào Bạn DŨNG %d \n tuổi", 27);
        // *********** Nhập Dữ liệu từ màn hình ***********
        //Scanner sc = new Scanner(System.in);
        //next(): Nhận vào một String token (nhận vào 1 từ đầu tiên thay cả câu) //ghi cả 1 chuổi gồm 2 từ là "ANH DŨNG" nó sẽ chỉ lấy chữ ANH
        //nextInt(): Nhận vào một số int
        //nextLong(): Nhận vào một số long
        //nextFloat(): Nhận vào một số float
        //nextDouble(): Nhận vào một số double
        //sc.nextLine(): Nhận vào một chuỗi String (Cả 1 câu)
        //nextByte(): Nhận vào một byte
        //nextBoolean(): Nhận vào một boolean
        
        //Viết 1 chương trình tính tuổi của bạn
        System.out.println("");
        System.out.println("Mời bạn nhập và năm sinh gồm 4 số");
        Scanner scanner = new Scanner(System.in);// Lưu ý Scanner phải chọn java.util sau dó phải gõ lại System.in
        int old;
        old = scanner.nextInt();//Kiểu dữ liệu của biến là gì thì phải scanner đúng kiểu dữ liệu đó
        int year = 2020;
        int yourold= year - old;
        System.out.println("Số tuổi của bạn hiện nay là:" + yourold);
        //Có thể thử 1 bài khác là truyền tên vào rồi in tên ra.
        //Toán tử + có thể sử dụng để cộng chuỗi
        System.out.println("Số tuổi của bạn hiện nay là:" + yourold + "Bạn có thấy chương trình hay không" + " Số tuổi bạn nhập vào:" + old);
       
       
        
    }

}
