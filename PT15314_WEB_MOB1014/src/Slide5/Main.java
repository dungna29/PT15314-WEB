/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Slide5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author Nguyen Anh Dung
 */
public class Main {

    public static void main(String[] args) {
        ArrayList();

    }

    static void ArrayOBJ() {
        int[] arrMang = new int[5];//Khai báo mảng theo kiểu dữ liệu nguyên thủy
        arrMang[0] = 5;
        Student student1 = new Student("Dung", "JAVA1", 19);
        //Khai báo đối tượng và khởi tạo giá trị cho lớp Student
        Student student2 = new Student("Phong", "JAVA1", 19);
        Student student3 = new Student("Duy", "JAVA1", 19);

        //Khai báo mảng theo kiểu đối tượng
        Student[] arrStudent = new Student[3];
        //Cách 1 để thêm đối tượng vào mảng
        arrStudent[0] = new Student();
        arrStudent[0].setTenSV("Dung");
        arrStudent[0].setMonSV("JAVA1");
        arrStudent[0].setTuoiSV(19);
        //Cách 2 ngắn hơn
        arrStudent[1] = new Student("Phong", "Java1", 19);
        arrStudent[2] = new Student("Duy", "JAVA1", 19);
//        for (Student x : arrStudent) {
//            System.out.println(x.getTenSV() + x.getMonSV() + x.getTuoiSV());
//        }
        for (int i = 0; i < arrStudent.length; i++) {
            System.out.println(arrStudent[i].getTenSV() + arrStudent[i].getMonSV() + arrStudent[i].getTuoiSV());
        }
    }

    static void JavaList() {
        //List không định kiểu
        List lstKhongDinhKieu = new ArrayList();
        //Phương thức add
        lstKhongDinhKieu.add("Duy Anh");
        lstKhongDinhKieu.add(2020);
        lstKhongDinhKieu.add(2020);//Interger
        lstKhongDinhKieu.add(1.5);//Double
        lstKhongDinhKieu.add("a");
        lstKhongDinhKieu.add(true);

        //Khi add thêm tử kiểu dữ liệu nguyên thủy thì nó tự động chuyển sang đối tượng Wrapper
//        double temp = lstKhongDinhKieu.get(3);//Lỗi
//        double temp = (double) lstKhongDinhKieu.get(3);
//        System.out.println(temp);
        //Khi truy xuất các phần tử, cần ép về kiểu gốc của phần tử để xử lý
        //Double temp = (Double) lstKhongDinhKieu.get(3);
        //Phương thức get dùng để lấy giá trị trong List theo index
//        System.out.println(lstKhongDinhKieu.get(5));
//        for (Object x : lstKhongDinhKieu) {
//            System.out.println(x);
//        }
        // List có định kiểu
        List<Double> lstCodinhKieuDouble = new ArrayList<Double>();
        lstCodinhKieuDouble.add(9.5);
        lstCodinhKieuDouble.add(7.5);
        lstCodinhKieuDouble.add(4.5);
        double temp = lstCodinhKieuDouble.get(0);
        Double temp2 = lstCodinhKieuDouble.get(0);

//        //Convert từ Array về List 
        String[] arrString = {"Duy Anh", "My MY", "Sy Phong"};
//        //Cần khai báo thêm một biến tạm
        List<String> lstArrString = Arrays.asList(arrString);//List phụ
        List<String> lstStringName = new ArrayList<String>();//List chính
        lstStringName.add("Dung");
        lstStringName.addAll(lstArrString);//Phương thức add all phải truyền vào một List khác
        Collections.sort(lstStringName);//Sắp Sếp cái list phải cùng kiểu dữ liệu
        for (String x : lstStringName) {
            System.out.println(x);
        }
        Student student1 = new Student("Dung", "JAVA1", 19);
        //Khai báo đối tượng và khởi tạo giá trị cho lớp Student
        Student student2 = new Student("Phong", "JAVA1", 19);
        Student student3 = new Student("Duy", "JAVA1", 19);
        Student student4 = new Student("HOA", "JAVA1", 19);
        List<Student> lstStudent = new ArrayList<Student>();
        lstStudent.add(student1);
        lstStudent.add(student2);
        lstStudent.add(student3);//Add 1 OBJ vào list student
        lstStudent.add(0, student4);

        Collections.sort(lstStudent, Collections.reverseOrder());
        //lstStudent.addAll(lstStudent);//add all truyền cả 1 list student
        //Lấy 1 phần tử trong List ra
        //System.out.println(lstStudent.get(0).getTenSV() + lstStudent.get(0).getMonSV());
//        for (Student x : lstStudent) {//x là cả 1 đối tượng student cần phải chấm để lấy các thuộc tính của nó
//            System.out.println(x.getTenSV() + x.getMonSV());
//        }
        System.out.println(lstStudent.size());
        for (int i = 0; i < lstStudent.size(); i++) {
            System.out.println(lstStudent.get(i).getTenSV() + lstStudent.get(i).getTuoiSV());
        }
        System.out.println("--------------");
        //Xóa phẩn tử trong mảng
        //lstStudent.remove(0);//Xóa phẩn tử trong List tại vị trí 0
        for (int i = 0; i < lstStudent.size(); i++) {
            System.out.println(lstStudent.get(i).getTenSV() + lstStudent.get(i).getTuoiSV());
        }
        //lstStudent.remove(student1);//Xóa obj
        for (Student x : lstStudent) {
            lstStudent.remove(x);
            if (x.getTenSV().equals("Dung")) {
                lstStudent.remove(x);//Xóa obj
            }
        }
        System.out.println("--------------");
        for (int i = 0; i < lstStudent.size(); i++) {
            System.out.println(lstStudent.get(i).getTenSV() + lstStudent.get(i).getTuoiSV());
        }
        //Sắp xếp list
//        Arrays.sort(a);;

        System.out.println("---------------------------");
        //Duyệt các phần tử trong List listIterator
        System.out.println("Duyệt các phẩn tử");
        ListIterator<Student> listIterator = lstStudent.listIterator();
        System.out.println("Duyệt các phần vị trí con trỏ từ đầu của LIST");
        while (listIterator.hasNext()) {
            System.out.println("\t" + listIterator.next().getTenSV());
        }
        System.out.println("Duyệt các phần vị trí con trỏ từ cuối của LIST");
        while (listIterator.hasPrevious()) {
            System.out.println("\t" + listIterator.previous().getTenSV());
        }

        //Kiểm tra List có rỗng hay không
        List<Student> lstStudent1 = new ArrayList<Student>();

        if (lstStudent1.isEmpty()) {
            System.out.println("Hiện tại danh sách sinh viên đang không có gì");
        } else {
            for (Student student : lstStudent1) {
                System.out.println(student.getTenSV());
            }
        }

    }

    static void ArrayList() {
        //List không định kiểu
        ArrayList arrlstKhongDinhKieu = new ArrayList();
        //Phương thức add
        arrlstKhongDinhKieu.add("Duy Anh");
        arrlstKhongDinhKieu.add(2020);
        arrlstKhongDinhKieu.add(2020);//Interger
        arrlstKhongDinhKieu.add(1.5);//Double
        arrlstKhongDinhKieu.add("a");
        arrlstKhongDinhKieu.add(true);
        //Khi add thêm tử kiểu dữ liệu nguyên thủy thì nó tự động chuyển sang đối tượng Wrapper
//        double temp = arrlstKhongDinhKieu.get(3);//Lỗi
//       double temp = (double) arrlstKhongDinhKieu.get(3);
//        System.out.println(temp);
        //Khi truy xuất các phần tử, cần ép về kiểu gốc của phần tử để xử lý
        // Double temp = (Double) arrlstKhongDinhKieu.get(3);
        //Phương thức get dùng để lấy giá trị trong List theo index
        System.out.println(arrlstKhongDinhKieu.get(5));
        for (Object x : arrlstKhongDinhKieu) {
            System.out.println(x);
        }

        // List có định kiểu
        ArrayList<Double> arrlstCodinhKieuDouble = new ArrayList<Double>();
        arrlstCodinhKieuDouble.add(9.5);
        arrlstCodinhKieuDouble.add(7.5);
        arrlstCodinhKieuDouble.add(4.5);
        double temp = arrlstCodinhKieuDouble.get(0);
        Double temp2 = arrlstCodinhKieuDouble.get(0);
        for (Object x : arrlstCodinhKieuDouble) {
            System.out.println(x);
        }

        //Sử dụng các
        ArrayList<String> arrListName = new ArrayList<>();
        //Phương thức add dùng để chèn phần tử vào cuối của arrlist
        arrListName.add("Nam");
        arrListName.add("Anh");
        arrListName.add("Duy");
        arrListName.add("My");
        //boolean remove(Object) dùng để tìm và xóa phần tử trong ArrayList
        // arrListName.remove("Duy");
        ///boolean remove(index) dùng để tìm và xóa phần tử theo index
        //arrListName.remove(1);        
        //Clear() dùng để xóa các phần tử bên trong Arraylist
        //arrListName.clear();
        //Set Object dùng để sửa phần tử ở trong mảng theo index chỉ định
        //arrListName.set(1, "Hoang");
        //Hàm dùng để tìm ra kích thước mảng
        System.out.println("Kích thước của List là: " + arrListName.size());
        ///Lấy 1 phần tử ra khỏi List và in ra thì dùng get
        System.out.println("Phần tử tại vị trí 1 là: " + arrListName.get(1));
        //Contains dùng để kiểm tra 1 phần tử có trong danh sách hay không
        if (arrListName.contains("Duy Anh1")) {
            System.out.println("Bạn Duy Anh có trong lớp WEB");
        } else {
            System.out.println("Người bạn tìm không tồn tại trong danh sách Lớp WEb");
        }
        //Tìm vị trí của phần tử
        System.out.println("Bạn Mỹ đang đứng thứ  " + arrListName.indexOf("My"));
        //isEmpty kiểm tra
        //arrListName.clear();
        System.out.println(arrListName.isEmpty());
        //Sắp xếp sort
        Collections.sort(arrListName);
        for (Object x : arrListName) {
            System.out.print(x + " | ");
        }

        Student student1 = new Student("Dung", "JAVA1", 20);
        Student student2 = new Student("Phong1", "JAVA1", 21);
        Student student3 = new Student("Duy", "JAVA1", 18);
        Student student4 = new Student("HOA", "JAVA1", 19);
        ArrayList<Student> arrlstStudent1 = new ArrayList<Student>();
        arrlstStudent1.add(student1);
        arrlstStudent1.add(student2);
        arrlstStudent1.add(student3);//Add 1 OBJ vào list student
        ArrayList<Student> arrlstStudent2 = new ArrayList<Student>();
        arrlstStudent2.add(student4);//Add 1 OBJ vào list student
        //AddAll
        //arrlstStudent1.addAll(arrlstStudent2);
        for (Student student : arrlstStudent1) {
            System.out.println(student.getTenSV() + student.getMonSV());
        }
        //Sắp xếp có 2 cách
//        Collections.sort(arrlstStudent1);Không sử dụng được cáhc này vì không xác định được trường cần sắp xêp theo gì?
        //Collections.sort(arrlstStudent1);//Sử dụng được là vì sử dụng bên class có kể thừa hàm sắp xêp
        Collections.sort(arrlstStudent1, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                //return o1.getTenSV().compareTo(o2.getTenSV());//săp xếp xuôi
                // return -o1.getTenSV().compareTo(o2.getTenSV());//
                if (o1.getTuoiSV() > o2.getTuoiSV()) {
                    return -1;
                } else if (o1.getTuoiSV() < o2.getTuoiSV()) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });
        System.out.println("Sau khi sắp xếp");
        for (Student student : arrlstStudent1) {
            System.out.println(student.getTenSV() + student.getMonSV() + student.getTuoiSV());
        }

        System.out.println("--------------");
        Student student1a = new Student("A", "JAVA1", 20);
        Student student2b = new Student("B", "JAVA1", 21);
        Student student3c = new Student("C", "JAVA1", 18);
        Student student4d = new Student("D", "JAVA1", 19);
        ArrayList<Student> arrlstStudent3 = new ArrayList<Student>();
        arrlstStudent3.add(student1a);
        arrlstStudent3.add(student2b);
        arrlstStudent3.add(student3c);
        arrlstStudent3.add(student4d);
        //sử dụng sắp xếp ngẫu nhiên các phần tử bên trong
        //Shuflte
         for (Student student : arrlstStudent3) {
            System.out.println(student.getTenSV() + student.getMonSV() + student.getTuoiSV());
        }
        //
         ArrayList<String> arrListString1 = new ArrayList<String>();
        arrListString1.add("Dũng");
        arrListString1.add("Duy Anh");
        ArrayList<String> arrListString2 = new ArrayList<String>();       
        arrListString2.add("Dũng");
        arrListString2.add("Duy Anh");
        //arrListString1.addAll(arrListString2);
        arrListString1.retainAll(arrListString2);// Hiệu của 2 List chỉ giữ lại những phần tử giống nhau của 2 arrlist
        for (String x : arrListString1) {
            System.out.print(x + " | ");
        }
        

    }

}
