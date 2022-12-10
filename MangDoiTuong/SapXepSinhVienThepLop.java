
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

    public String getMa() {
        return ma;
    }

    public String getLop() {
        return lop;
    }
    
    public String toTring(){
        return ma + " " + ten + " " + lop+ " " + mail;
    }
}
public class SapXepSinhVienThepLop {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        ArrayList<SinhVienLop>a=new ArrayList<>();
        for(int i=1;i<=n;i++){
            SinhVienLop sv=new SinhVienLop(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine());
            a.add(sv);
        }
        Collections.sort(a, Comparator.comparing(SinhVienLop::getLop).thenComparing(SinhVienLop::getMa));
        for(SinhVienLop x:a){
            System.out.println(x.toTring());
        }
    }
}
