
package CodeJava1.KhaiBaoLopVaDoiTuong;
import java.util.Scanner;
class InfoGV{
    private String ma;
    private String ChucVu;
    private String name;
    private long heSo;
    private long LuongCoBan;
    private long phuCap;
    public InfoGV(String ma,String ChucVu,String name,long heSo,long LuongCoBan,long phuCap){
        this.ma=ma;
        this.ChucVu=ChucVu;
        this.name=name;
        this.heSo=heSo;
        this.LuongCoBan=LuongCoBan;
        this.phuCap=phuCap;  
    }

    public long getLuong() {
        return LuongCoBan*heSo+phuCap;
    }

    @Override
    public String toString() {
        return ma+" "+name+" "+heSo+" "+phuCap+" "+getLuong();
    }
}
public class ThuNhapGiaoVien {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String name=sc.nextLine();
        long luongCoBan=Long.parseLong(sc.nextLine());
        String[] ch=a.split("");
        String ChucVu=ch[0]+ch[1];
        long heso=Long.parseLong(ch[2])*10+Long.parseLong(ch[3]);
        long phucap=0;
        if(a.contains("HT")) phucap=2000000;
        else if(a.contains("HP")) phucap=900000;
        else phucap=500000;
        InfoGV gv=new InfoGV(a, ChucVu, name, heso, luongCoBan, phucap);
        System.out.println(gv.toString());
    }
}
