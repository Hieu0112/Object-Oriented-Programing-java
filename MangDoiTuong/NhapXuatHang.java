
package MangDoiTuong;
import java.util.*;
class SanPham{
    private String ma,ten;
    private double Lai;
    public SanPham(String ma, String ten, char loai) {
        this.ma = ma;
        this.ten = ten;
        if(loai=='A') 
            this.Lai=1.08;
        else if(loai=='B') 
            this.Lai=1.05;
        else 
            this.Lai=1.02;
    }

    public String getTen() {
        return ten;
    }
    public double getLai() {
        return Lai;
    }
    
    public String getMa() {
        return ma;
    }
}
class XuatNhap{
    private SanPham sp;
    private long slNhap,gNhap,slXuat;

    public XuatNhap(SanPham sp, long slNhap, long gNhap, long slXuat) {
        this.sp = sp;
        this.slNhap = slNhap;
        this.gNhap = gNhap;
        this.slXuat = slXuat;
    }

    public SanPham getSp() {
        return sp;
    }
    
    public long GTNhap() {
        return slNhap*gNhap;
    }
    
    public long GTXuat() {
        return (long)(((double)gNhap*sp.getLai())*slXuat);
    }
    
    @Override
    public String toString() {
        return sp.getMa()+" "+sp.getTen()+" "+GTNhap()+" "+GTXuat();
    }
    
}
public class NhapXuatHang {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<SanPham>list1=new ArrayList<>();
        ArrayList<XuatNhap>list2=new ArrayList<>();
        int n=Integer.parseInt(sc.nextLine());
        for(int i=1;i<=n;i++){
            list1.add(new SanPham(sc.nextLine(), sc.nextLine(), sc.nextLine().charAt(0)));
        }
        int m=Integer.parseInt(sc.nextLine());
        for(int i=1;i<=m;i++){
            String[] Lines=sc.nextLine().split("\\s+");
            String ma1=Lines[0];
            long so1=Long.parseLong(Lines[1]);
            long so2=Long.parseLong(Lines[2]);
            long so3=Long.parseLong(Lines[3]);
            for(SanPham x:list1){
                if(ma1.equals(x.getMa())){
                    list2.add(new  XuatNhap(x, so1, so2, so3));
                    break;
                }
            }
        }
        for(XuatNhap x:list2){
            System.out.println(x);
        }
    }
}
