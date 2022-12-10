
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
class TinhToan{
    private final PhanSo p1;
    public TinhToan(PhanSo p1){
        this.p1=p1;
    }
    public PhanSo TongBinh(PhanSo p){
        long x=p1.getTu()*p.getMau()+p1.getMau()*p.getTu();
        long y=p1.getMau()*p.getMau();
        x*=x;
        y*=y;
        PhanSo p2=new PhanSo(x,y);
        return p2;
    }
    public PhanSo Tich(PhanSo p2,PhanSo p3){
        long x=p1.getTu()*p2.getTu()*p3.getTu();
        long y=p1.getMau()*p2.getMau()*p3.getMau();
        PhanSo res=new PhanSo(x,y);
        return res;
    }
    
}
public class TinhToanPhanSo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long tu1=sc.nextLong();
            long mau1=sc.nextLong();
            long tu2=sc.nextLong();
            long mau2=sc.nextLong();
            PhanSo p1=new PhanSo(tu1,mau1);
            PhanSo p2=new PhanSo(tu2,mau2);
            TinhToan s=new TinhToan(p1);
            PhanSo TongBinh=s.TongBinh(p2);
            PhanSo Tich=s.Tich(p2, TongBinh);
            System.out.println(TongBinh.toString()+" "+Tich.toString());
        }
    }
}

