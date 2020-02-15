/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTapThem;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Nguyen Anh Dung
 */
public class Mang {

    public static void main(String[] args) {
        String TenRieng[] = {"Duy Anh", "Anh Dung", "Van Duy"};
        String input;
        for (String x : TenRieng) {
            System.out.print(x + " | ");
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Bạn có muốn Sửa  không? Nếu muốn thì bấm Y or N ? ");
        input = sc.nextLine();
        String temp = input.toLowerCase();// truyền vào sẽ bị từ viết hoa thành viết thường
        if (temp.length() == 1) {
            if (temp.equals("y")) {
                System.out.println("Mời bạn gõ tên người muốn Sửa: ");
                input = sc.nextLine();
                for (int i = 0; i < TenRieng.length; i++) {
                    if (input.endsWith(TenRieng[i])) {
                        System.out.println("Mời bạn gõ tên sửa lại: ");
                        TenRieng[i] = sc.nextLine();
                    }
                }
                for (String x : TenRieng) {
                    System.out.print(x + " | ");
                }

            } else if (temp.equals("n")) {

            } else {
                System.out.println("Bạn đã nhập 1 nhưng không phải là Y hoặc N");
            }
        } else {
            System.out.println("Bạn cần nhập 1 ký tự vào bàn phím Y hoặc N");
        }

    }

    static void Bai1() {
        String arrInput[];
        int sizeArr;
        String inputValue;
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập số lượng phần tử bạn muốn ghi vào: ");
        sizeArr = sc.nextInt();//Người ta truyền xuống kiểu số nguyên
        sc.nextLine();//Xử lý trôi lệnh vì nextInt ở trên
        arrInput = new String[sizeArr];//Truyền giá trị người dùng muốn để khởi tạo mảng
        for (int i = 0; i < arrInput.length; i++) {
            System.out.println("Mời bạn nhập vào lần thư " + (i + 1));
            inputValue = sc.nextLine();
            //Cần phải đưa các giá trị người dùng truyền vào vào trong mảng
            arrInput[i] = inputValue;//Gán giá trị vào mảng bắt đàu từ index 0
        }
        System.out.print("Các phần tử bạn vừa nhập vào là: ");
        //In các phần tử trong mảng ra màn hình
//        for (String x : arrInput) { //x đại diện cho giá trị cho 1 phần tử trong mảng
//            System.out.print(x + " | ");           
//        }
        for (int i = 0; i < arrInput.length; i++) {
            System.out.print(arrInput[i] + " | ");
        }
        System.out.println("");

        //Sử dụng Pattern để tách phần tử trong mảng theo quy tắc
        Pattern pattern = Pattern.compile("[a-zA-Z]+");
        System.out.println("Dưới đây là các phần tử kiểu tên hoặc chữ cái");
        for (int i = 0; i < arrInput.length; i++) {
            Matcher matcher2 = pattern.matcher(arrInput[i]);
            if (matcher2.matches()) {
                System.out.print(arrInput[i] + " ");
            }
        }
        System.out.println("");
        Pattern patternKieuSo = Pattern.compile("\\d+");
        System.out.println("Dưới đây là các phần tử kiểu số ");
        for (int i = 0; i < arrInput.length; i++) {
            Matcher matcher2 = patternKieuSo.matcher(arrInput[i]);
            if (matcher2.matches()) {
                System.out.print(arrInput[i] + " ");
            }
        }
        System.out.println("");
        Pattern patternKieuKyTu = Pattern.compile("\\W+");
        System.out.println("Dưới đây là các phần tử kiểu ký tự ");
        for (int i = 0; i < arrInput.length; i++) {
            Matcher matcher2 = patternKieuKyTu.matcher(arrInput[i]);
            if (matcher2.matches()) {
                System.out.print(arrInput[i] + " ");
            }
        }

        Arrays.sort(arrInput);

        Pattern pattern1 = Pattern.compile("[a-zA-Z]+");

        System.out.println("Dưới đây là các phần tử kiểu tên hoặc chữ cái");
        for (int i = 0; i < arrInput.length; i++) {
            Matcher matcher2 = pattern1.matcher(arrInput[i]);
            if (matcher2.matches()) {
                System.out.print(arrInput[i] + " ");
            }
        }
        System.out.println("");
        Pattern patternKieuSo1 = Pattern.compile("\\d+");
        System.out.println("Dưới đây là các phần tử kiểu số ");
        for (int i = 0; i < arrInput.length; i++) {
            Matcher matcher2 = patternKieuSo1.matcher(arrInput[i]);
            if (matcher2.matches()) {
                System.out.print(arrInput[i] + " ");
            }
        }
        System.out.println("");
        Pattern patternKieuKyTu1 = Pattern.compile("\\W+");
        System.out.println("Dưới đây là các phần tử kiểu ký tự ");
        for (int i = 0; i < arrInput.length; i++) {
            Matcher matcher2 = patternKieuKyTu1.matcher(arrInput[i]);
            if (matcher2.matches()) {
                System.out.print(arrInput[i] + " ");
            }
        }
    }

    static void PatternMatcher() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập bất kì vào : ");
        String input = sc.nextLine();//Người ta truyền xuống kiểu số nguyên
        String kieuso = "\\d+";//Kiểu số hoặc 0-9
        String kieuchu = "[a-zA-Z]+";//Kiểu chữ
        String kieukytu = "\\W+";//Kiểu ký tự
        Pattern Patternkieuso = Pattern.compile(kieuso);//[a-zA-Z]+ 0-9
        Pattern Patternkieuchu = Pattern.compile(kieuchu);
        Pattern Patternkiekytu = Pattern.compile(kieukytu);
        Matcher matcherKieuSO = Patternkieuso.matcher(input);//Macher kiểm tra luôn trả ra giá trị true hoặc false
        Matcher matcherKieuChu = Patternkieuchu.matcher(input);
        Matcher matcherKieuKyTu = Patternkiekytu.matcher(input);

        if (matcherKieuSO.matches()) {
            System.out.println("Bạn vừa truyền vào kiểu số");
            int namsinh = Integer.parseInt(input);
            System.out.println("Năm sinh của bạn là " + namsinh);
        } else if (matcherKieuChu.matches()) {
            System.out.println("Bạn vừa truyền vào kiểu chữ");
        } else {
            System.out.println("Bạn vừa truyền vào Ký tự");
        }

        Pattern pattern = Pattern.compile("Viết tắt các cụm ký tự, số và chữ");
        Matcher matcher = pattern.matcher("Cai mình truyền vào");
        if (matcher.matches()) {
            //Thực hiện một hành động nào đó
        }
//        Pattern Patternkiekytu = Pattern.compile("\\d+");//Tập hợp ký tự chữ hoặc số hoặc điều kiện người lập trình đưa ra
//        Matcher matcherKieuSO = Patternkieuso.matcher("Cai mình truyền vào");//Macher kiểm tra 

    }

}
