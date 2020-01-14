/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Slide2;

import javax.sound.midi.Soundbank;

/**
 *
 * @author LegendNguyen
 */
public class S2_QuyLuatEpKieu {

    public static void main(String[] args) {
        //Quy luật ép kiểu
        byte a = 5;
        double d = 128;
        //a = d;//Sai vì double kích thước lớn hơn
        d = a;// Ép kiểu tự động
        d = (byte) a;//Kép kiểu tường minh
        
        //Chuyển kiểu chuỗi sang kiểu nguyên thủy 
        String str = "5.6";
        String str1 = "9.4";
        // System.out.println(str + str1);
        double doub = Double.parseDouble(str) + Double.parseDouble(str1);
        System.out.println(doub);
        String boole = "True";
        boolean bool = Boolean.parseBoolean(boole);
        System.out.println(bool);
        int tempint = Integer.parseInt("5");
        

    }

}
