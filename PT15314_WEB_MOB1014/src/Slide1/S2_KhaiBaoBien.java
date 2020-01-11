/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Slide1;

/**
 *
 * @author Nguyen Anh Dung
 */
public class S2_KhaiBaoBien {

    String Student = "Dung";//Biến toàn cục

    public static void main(String[] args) {

        // *********** Biến khái niệm cơ bản ***********
        //Có một yêu cầu phép toán 5 + 7 = 12        
        // Biến là nơi lưu trữ giá trị
        //Kiểu dữ liệu của biến nó có thể là số hoặc ký tự        
        int number = 5; // Khai báo biến và gán giá trị cho biến ở đây gán giá trị cho biến là 5, tên biến là number, kiểu dữ liệu là kiểu int
        int number2 = 7;
        //int number2 = 7;//Báo lỗi nếu khai báo biến trùng nhau
        int kq = number + number2;
        System.out.println("Kết quả: 5 + 7 = " + kq);
        //Cú pháp khai báo biến <kiểu dữ liệu> <tên biến> [=giá trị khởi đầu];
        String firstname = "Dung";//Khai báo biến có giá trị khởi tạo
        String lastname;//Khai báo biến không có giá trị khởi tạo
        String name, name2, name3 = "Test";//Khai báo nhiều biến có cùng kiểu dữ liệu 
        // *********** End ***********

        // *********** Quy Tắc Đặt Tên Biến ***********        
        String firstname1, Firstname1, FIrstname1;//Tên biến có phân biệt chữ Hoa và chữ thường
        // String firstname;// Kiểu Normal  //Sử dụng khi tên biến có 2 từ trở lên
        // String FirstName; //Kiểu CamelCase //Sử dụng khi tên biến có 2 từ trở lên
        // String first_name; // Kiểu Underscores //Sử dụng khi tên biến có 2 từ trở lên 
        String quabuoi = "Quả bưởi";//Nếu đặt bằng tiếng việt sẽ rất khó hiểu và không tường minh, khuyên dùng nên dùng tiếng Anh để đặt biến
        String grapefruit = "Quả bười";//Nên dùng tiếng anh nếu ko biết search Google để vừa học tiếng anh luôn.

        // Lưu ý: đặt tên biến không được phép bắt đầu bởi số , có dấu gạch ngang, sử dụng từ khóa của java (int,if,long....)
        // int int = 5; //Vi phạm nguyên tắc đặt biến
        // Trong cùng 1 class thì biến phải sử dụng tên khác nhau và đặt sao cho đúng nghĩa đại diện
        // *********** Các kiểu dữ liệu của biến ***********
        //String: "xin chao cac ban" "moi ban nhap vao"
        //Char : 'D' 'E' 'a' '1' '2' '\u0040' = @ '\u0041'
        //short : 33 56 78 2 4 3
        //int : 33 56 78 2 4 3
        //long:33 56 78 2 4 3
        //byte: 1 2 3 4 8 9
        //float: 3.14 5.5 6.2 7.2   
        //double 3.14 5.5 6.2 7.2
        //boolean: true false       
        boolean temp = false;
        System.out.println(temp);
        //Luyện tập tự khai báo để nhớ tên kiểu dữ liệu và loại dữ liệu mà kiểu dữ liệu đó chấp nhận.

        // *********** Biến cục bộ và biến toàn cục ***********
        //final String userName = "admin";
    }

    public void funtion2() {
        //Biến toàn cục sẽ được gọi ở mọi nơi
        String temp = "test";//Biến cục bộ
        System.out.println(Student);

    }

    public void funtion3() {
        //Biến toàn cục sẽ được gọi ở mọi nơi
        String temp = "test";
        System.out.println(Student);

    }

    public void funtion4() {
        //Biến toàn cục sẽ được gọi ở mọi nơi
        String temp = "test";
        System.out.println(Student);

    }

    public void funtion5() {
        //Biến toàn cục sẽ được gọi ở mọi nơi
        String temp = "test";//Biến cục bộ
        System.out.println(Student);

    }

}
