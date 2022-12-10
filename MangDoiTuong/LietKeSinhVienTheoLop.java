
package CodeJava1.MangDoiTuong;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;
class SinhVienLop{
    private String ma,ten,lop,mail;

    public SinhVienLop(String ma, String ten, String lop, String mail) {
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.mail = mail;
    }

    public String getLop() {
        return lop;
    }
    
    public String toTring(){
        return ma + " " + ten + " " + lop+ " " + mail;
    }
}
public class LietKeSinhVienTheoLop {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        ArrayList<SinhVienLop>a=new ArrayList<>();
        for(int i=1;i<=n;i++){
            SinhVienLop sv=new SinhVienLop(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine());
            a.add(sv);
        }
        int t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            String s=sc.nextLine();
            System.out.println("DANH SACH SINH VIEN LOP "+ s +":");
            for(SinhVienLop x:a){
                if(x.getLop().equals(s)){
                    System.out.println(x.toTring());
                }
            }
        }
    }
}
