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
public class Main {

    public static void main(String[] args) {
//        SinhVien sv = new SinhVien();
//        sv.ChaoSV();
//        sv.InThongTinSV("Dao Duy Anh", "7.3");
//        System.out.println("Điểm Tông kết kỳ là: " + sv.TinhDiemTrungBinh(7.5, 6.2, 9.0));
//        if (sv.KiemTraCamThi(5)) {
//            System.out.println("Bạn vẫn chưa bị cấm thi");
//        } else {
//            System.out.println("Bạn đã bị cấm thi java 1");
//        }
//        System.out.println(sv.KiemTraCamThi(4));
//
//        System.out.println("Năm là năm:" + sv.InRaNamHienTai());
//        sv.KiemTraNghiHoc2(6);
//        sv.DaoDuyAnh();
//        sv.DaoDuyAnh(4);
//        sv.DaoDuyAnh("7.3", 10);

        SinhVien sv = new SinhVien("msv", "tensinhvien", "nghanhhoc", 9.0);
        SinhVien sv1 = new SinhVien();
        sv.setTenSV("Dao Duy Anh");

        System.out.println(sv.getTenSV() + sv.getTenTruong());

//        sv.Diem = 9;
//        sv.Msv = "phhasdasj";
//        sv.NghanhHoc ="WEB";
//        System.out.println(sv.Msv);

        //Inner Class
        ClassNgoai classNgoai = new ClassNgoai();
        ClassNgoai.ClassTrong classTrong = classNgoai.new ClassTrong();
        System.out.println(classNgoai.name + classTrong.name);

    }

}
