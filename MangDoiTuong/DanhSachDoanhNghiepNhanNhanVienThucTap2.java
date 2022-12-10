
package CodeJava1.MangDoiTuong;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class ThucTap2{
    private String ma,name;
    private int so;

    public ThucTap2(String ma, String name, int so) {
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
public class DanhSachDoanhNghiepNhanNhanVienThucTap2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        ArrayList<ThucTap2>list=new ArrayList<>();
        for(int i=1;i<=n;i++){
            list.add(new ThucTap2(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine())));
        }
        Collections.sort(list, Comparator.comparingInt(ThucTap2::getSo).reversed().thenComparing(ThucTap2::getMa));
        int t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            System.out.println("DANH SACH DOANH NGHIEP NHAN TU " +a+" DEN "+b+" SINH VIEN:");
            for (ThucTap2 thucTap2 : list) {
               if(thucTap2.getSo()>=a&&thucTap2.getSo()<=b)
                    System.out.println(thucTap2);
        } 
        }
        
    }
    
}
