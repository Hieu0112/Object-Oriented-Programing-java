
package CodeJava1.KhaiBaoLopVaDoiTuong;
import java.util.Scanner;
class PhanSo{
    private long tu;
    private long mau;
    public PhanSo(long tu,long mau){
        this.tu=tu;
        this.mau=mau;
    }
    public long getTu(){
        return tu;
    }
    public long getMau(){
        return mau;
    }
    public long Gcd(){
        while(tu*mau!=0){
            if(tu>mau) tu%=mau;
            else mau%=tu;
        }
        return tu+mau;
    }

    @Override
    public String toString() {
        long a=tu,b=mau;
        return (a/Gcd())+"/"+(b/Gcd());
    }
}
class Tong{
    private PhanSo p1;
    public Tong(PhanSo p1){
        this.p1=p1;
    }
    public PhanSo TongSo(PhanSo p){
        long x=p1.getTu()*p.getMau()+p1.getMau()*p.getTu();
        long y=p1.getMau()*p.getMau();
        PhanSo p2=new PhanSo(x,y);
        return p2;
    }
}
public class TongPhanSo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long tu1=sc.nextLong();
        long mau1=sc.nextLong();
        long tu2=sc.nextLong();
        long mau2=sc.nextLong();
        PhanSo p1=new PhanSo(tu1,mau1);
        PhanSo p2=new PhanSo(tu2,mau2);
        Tong s=new Tong(p1);
        PhanSo ps=s.TongSo(p2);
        System.out.println(ps.toString());
    }
}

