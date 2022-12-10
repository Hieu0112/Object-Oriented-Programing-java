
package CodeJava1.MangDoiTuong;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class ThucTap1{
    private String ma,name;
    private int so;

    public ThucTap1(String ma, String name, int so) {
        this.ma = ma;
        this.name = name;
        this.so = so;
    }

    public int getSo() {
        return so;
    }

    public String getMa() {
        return ma;
    }
       
    @Override
    public String toString() {
        return ma + " " + name + " "+ so;
    }
    
}
public class DanhSachDoanhNghiepNhanNhanVienThucTap1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        ArrayList<ThucTap1>list=new ArrayList<>();
        for(int i=1;i<=n;i++){
            list.add(new ThucTap1(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine())));
        }
        Collections.sort(list, Comparator.comparingInt(ThucTap1::getSo).reversed().thenComparing(ThucTap1::getMa));
        for (ThucTap1 thucTap1 : list) {
            System.out.println(thucTap1);
        }
    }
    
}
