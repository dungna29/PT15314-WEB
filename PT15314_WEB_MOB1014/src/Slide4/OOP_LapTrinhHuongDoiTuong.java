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
public class OOP_LapTrinhHuongDoiTuong {

    public static void main(String[] args) {
        Person pt = new Person();
        pt.HoVaTen = "";
        NewClass nc = new NewClass();
        nc.FullName = "";
        //Bài tập viết 1 chương trình cho người dùng nhập vào 
        //thông tin của giáo viên, thông tin của học sinh, thông tin của của nhân viên của trường FPT
        //TT Giáo Viên gồm: MSGiaoVien, TenGV, TuoiGV, DayMon
        //TT Sinh Viên gồm: MSSinhVien, TenSV, TuoiSV, Nganh
        //TT Nhân Viên gồm: MSNhanVien, TenNV, TuoiNV, LoaiNV
        
        //Person là class
        //1 thằng nó sẽ chỉ đại diện cho 1 object duy nhất
//        Person personGV = new Person();//person chính là đại diên cho 1 object
//        personGV.NhapDuLieuGV();//Hàm NhapDuLieuGV()      
//        personGV.InRaManHinhGV();  
//        Person personSV = new Person();//Tạo thêm 1 object SV
//        personSV.NhapDuLieuSV();
//        personSV.InRaManHinhSV();
//        Person personSV1 = new Person();//Tạo thêm 1 object SV
//        personSV1.NhapDuLieuSV();
//        personSV1.InRaManHinhSV();
//        


          //Mỗi 1 cái pt đại diện cho 1 loại phương tiện mà mình định xử lý
//          PhuongTien pt = new PhuongTien();
//          pt.TrongTai = 15.000000;
//          pt.HangSX =" Made in VN";
//          pt.Mau = "Trắng";
//          pt.CoiKeu("1");//Hành vi của cái phương tiện chính là HÀM trong lập trình
          
//          XeMay xm = new XeMay();
//       
//          xm.;
        

    }

    static void Bai1() {
        //Bài tập viết 1 chương trình cho người dùng nhập vào 
        //thông tin của giáo viên, thông tin của học sinh, thông tin của của nhân viên của trường FPT
        //TT Giáo Viên gồm: MSGiaoVien, TenGV, TuoiGV, DayMon
        //TT Sinh Viên gồm: MSSinhVien, TenSV, TuoiSV, Nganh
        //TT Nhân Viên gồm: MSNhanVien, TenNV, TuoiNV, LoaiNV
        String MSGiaoVien, TenGV, DayMon;
        String MSSinhVien, TenSV, Nganh;
        String MSNhanVien, TenNV, LoaiNV;
        int TuoiGV, TuoiSV, TuoiNV;
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập thông tin");
        System.out.println("Mời bạn nhập Mã Giáo Viên: ");
        MSGiaoVien = sc.nextLine();
        System.out.println("Mời bạn nhập Tên Giáo Viên: ");
        TenGV = sc.nextLine();
        System.out.println("Mời bạn nhập GV Dạy Môn: ");
        DayMon = sc.nextLine();
        System.out.println("Mời bạn nhập Tuổi Giáo Viên: ");
        TuoiGV = sc.nextInt();
        sc.nextLine();
        System.out.println("Thông tin Giáo viên: " + MSGiaoVien + "Tên: " + TenGV + "TuổiGV: " + TuoiGV + "Dạy Môn: " + DayMon);
        System.out.println("Mời bạn nhập thông tin SINH VIÊN");
        System.out.println("Mời bạn nhập Mã SINH VIÊN: ");
        MSSinhVien = sc.nextLine();
        System.out.println("Mời bạn nhập Tên SINH VIÊN: ");
        TenSV = sc.nextLine();
        System.out.println("Mời bạn nhập NGHÀNH SINH VIÊN: ");
        Nganh = sc.nextLine();
        System.out.println("Mời bạn nhập Tuổi SINH VIÊN: ");
        TuoiSV = sc.nextInt();
        sc.nextLine();
        System.out.println("Thông tin SV: " + MSSinhVien + "Tên: " + TenSV + "TuổiGV: " + TuoiSV + "Nghành: " + Nganh);
        System.out.println("Thông tin Giáo viên: " + MSGiaoVien + "Tên: " + TenGV + "TuổiGV: " + TuoiGV + "Dạy Môn: " + DayMon);
        System.out.println("Mời bạn nhập thông tin SINH VIÊN");
        System.out.println("Mời bạn nhập Mã SINH VIÊN: ");
        MSSinhVien = sc.nextLine();
        System.out.println("Mời bạn nhập Tên SINH VIÊN: ");
        TenSV = sc.nextLine();
        System.out.println("Mời bạn nhập NGHÀNH SINH VIÊN: ");
        Nganh = sc.nextLine();
        System.out.println("Mời bạn nhập Tuổi SINH VIÊN: ");
        TuoiSV = sc.nextInt();
        sc.nextLine();
        System.out.println("Thông tin SV: " + MSSinhVien + "Tên: " + TenSV + "TuổiGV: " + TuoiSV + "Nghành: " + Nganh);
    }

    static void OOP() {
        //OOP (LẬP TRÌNH HƯỚNG ĐỐI TƯỢNG) (OBJECT ORIENTED PROGRAMMING)
        // GIúp người lập trình thao tác được với các đối tượng để xử lý theo bài toàn đặt ra
        
        //Class: Một tập hợp các đối tượng bên trong gọi là Class. 
        //Đối tượng (Object): được xem là một thực thể trong thế giới thực.
        //Object bao gồm: Thuộc tính (Attribute/Properties) và Phương Thức (Hàm) (Method)
        //Attribute: Các thuộc tính của đối tượng
        //Properties: Nó có thể được sử dụng để lấy giá trị thuộc tính hoặc gán dựa trên khóa thuộc tính

        //***4 Tính chất quan trọng của OOP***
        //Tính trừu tượng (abstraction):
        //Trừu tượng có nghĩ là tổng quát hóa một cái gì đó lên. không cần chú ý chi tiết bên trong.
        //Tính đóng gói (encapsulation):
        //Tính chất này nhằm bảo vệ đối tượng không bị truy cập từ code bên ngoài vào để thay
        //đổi giá trị các thuốc tính hay có thể truy cập trực tiếp. Việc này do người lập trình
        //viết ra để bảo mật lớp. Tính chất này giúp bảo vệ toàn vẹn đối tượng trong java.        
        //Tính đa hình (polymorphism): 
        //Đối với tính chất đa hình, nó được thể hiện rõ qua việc gọi phương thức của đối tượng.
        //Các phương thức hoàn toàn có thể giống nhau, nhưng việc xử lý luồng có thể khác nhau.
        //Tính kế thừa (inheritance): 
        //Tính kế thừa cho phép ta xây dựng một lớp mới dựa trên các định nghĩa của một lớp đã có. 
    }

}
