
package CodeJava1.MangDoiTuong;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;
class SinhVienKhoa{
    private String ma,ten,lop,mail;

    public SinhVienKhoa(String ma, String ten, String lop, String mail) {
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.mail = mail;
    }

    public String getMa() {
        return lop;
    }
    
    public String toTring(){
        return ma + " " + ten + " " + lop+ " " + mail;
    }
}
public class LietKeSinhVienTheoKhoa {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        ArrayList<SinhVienKhoa>a=new ArrayList<>();
        for(int i=1;i<=n;i++){
            SinhVienKhoa sv=new SinhVienKhoa(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine());
            a.add(sv);
        }
        int t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            String s=sc.nextLine();
            System.out.println("DANH SACH SINH VIEN KHOA "+ s +":");
            for(SinhVienKhoa x:a){
                if(s.contains(x.getMa().substring(1, 3))){
                    System.out.println(x.toTring());
                }
            }
        }
    }
}
