/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Slide4;

/**
 *
 * @author Nguyen Anh Dung
 */
public class PhuongTien {

    String HangSX;
    String Mau;
    int NamSX;
    double TrongTai;
    String BienSo;
    String DongXe;

    void Phanh() {

    }

    void CoiKeu(String dongxe) {
        //hành vi của 1 loại phương tiện
        if (dongxe.equals("1")) {
            System.out.println("Tâu Thủy bấm còi tu tu");            
        }else if(dongxe.equals("2")){
            System.out.println("Ô tô bấm còi BIM BIM");
        }else if(dongxe.equals("3")){
            System.out.println("Xe đạp là reng reng");
        }
    }

}
