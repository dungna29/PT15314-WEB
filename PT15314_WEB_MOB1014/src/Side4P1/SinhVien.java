/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Side4P1;

/**
 *
 * @author Nguyen Anh Dung
 */
// Class SV để mô tả đối tượng cùng loại: Lớp WEb - Lơp MOB - Lớp Đồ họa...
public class SinhVien {

    //Thuộc tính nó phải là danh từ
    private String Msv;
    private String TenSV;
    private String NghanhHoc;
    private double Diem;
    private String TenTruong = "FPT POLY";

    public String getMsv() {
        return Msv;
    }

    public void setMsv(String Msv) {
        this.Msv = Msv;
    }

    public String getTenSV() {
        return TenSV;
    }

    public void setTenSV(String TenSV) {
        this.TenSV = TenSV;
    }

    public String getNghanhHoc() {
        return NghanhHoc;
    }

    public void setNghanhHoc(String NghanhHoc) {
        this.NghanhHoc = NghanhHoc;
    }

    public double getDiem() {
        return Diem;
    }

    public void setDiem(double Diem) {
        this.Diem = Diem;
    }

    public String getTenTruong() {
        return TenTruong;
    }

   
    
    

    //Gọi hàm khởi tạo constructor
    //alt + insert
    public SinhVien(String Msv1, String TenSV, String NghanhHoc, double Diem) {
        Msv = Msv1;//Cách này không cần dùng this
        this.TenSV = TenSV;
        this.NghanhHoc = NghanhHoc;
        this.Diem = Diem;
    }

    public SinhVien() {
    }

    
    //Phương thức là động từ
    //Hàm không trả về là các hàm dưới đây
    void ChaoSV() {
        System.out.println("Chào mừng bạn học POLY");
    }

    void InThongTinSV(String tensv, String kyhoc) {
        System.out.println("Chào bạn " + tensv + " Kỳ học " + kyhoc);
    }

    void TinhDiemSV() {

    }

    public void KiemTraNghiHoc2(int songaynghi) {
        if (songaynghi > 4) {
            System.out.println("Bạn bị cấm thi");
        } else {
            System.out.println("Tình trạng bạn vẫn bình thường");
        }
    }

    //Hàm trả về luôn luôn có return
    //Return một giá trị dựa theo kiểu dữ liệu của hàm
    double TinhDiemTrungBinh(double diemjava1, double diemhtml, double diemphp) {
        double tempdiemtb = 0;
        tempdiemtb = (diemjava1 + diemhtml + diemphp) / 3;
        return tempdiemtb;
    }

    boolean KiemTraCamThi(int songaynghihoc) {
        if (songaynghihoc > 4) {
            return false;
        } else {
            return true;
        }

    }

    int InRaNamHienTai() {
        return 2020;
    }

    double TinhDiem() {
        return 0;
    }

    //double là kiểu dữ liệu của hàm
    double TinhDiem2() {
        if (true) {
            return 100;
        } else {
            ///return 99;
        }
        return 0;
        //bắt buộc hàm phải có return;
    }

    //Nạp chồng phương thức
    //DaoDuyAnh là hàm không có tham số đầu vào
    void DaoDuyAnh() {
        System.out.println("Chào bạn Đào Duy Anh 1 ");
    }

    //DaoDuyAnh là hàm  có tham số đầu vào và tham số đầu vào ở đây là kyhoc kiểu String
    void DaoDuyAnh(int songaynghihoc) {
//         System.out.println("Chào bạn Đào Duy Anh 2 " + kyhoc);
        if (songaynghihoc > 4) {
            System.out.println("Duy Anh  bị cấm thi");
        } else {
            System.out.println("Duy Anh không bị cấm thi");
        }
    }

    void DaoDuyAnh(String kyhoc, double diem, String Msv) {
        System.out.println("Chào bạn Đào Duy Anh 3 " + kyhoc + diem + this.Msv);
    }

}
