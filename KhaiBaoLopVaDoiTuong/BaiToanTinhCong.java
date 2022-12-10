
package CodeJava1.KhaiBaoLopVaDoiTuong;

import java.util.Scanner;

class CongNV{
    private String name;
    private long luong,cong;
    private String Chuc;

    public CongNV(String name, long luong, long cong, String Chuc) {
        this.name = name;
        this.luong = luong;
        this.cong = cong;
        this.Chuc = Chuc;
    }

    public long Luong() {
        return luong*cong;
    }
    public long Thuong() {
        if(cong>=25)
            return Luong()*20/100;
        else if(cong>=22)
            return Luong()*10/100;
        else
            return 0;
    }
    public long PhuCap() {
        if(Chuc.equals("GD"))
            return 250000;
        else if(Chuc.equals("PGD"))
            return 200000;
        else if(Chuc.equals("TP"))
            return 180000;
        else 
            return 150000;
    }
    public long ThuNhap() {
        return Luong()+Thuong()+PhuCap();
    }
    
    @Override
    public String toString() {
        return "NV01"+" "+name+" "+Luong()+" "+Thuong()+" "+PhuCap()+" "+ThuNhap();
    }
}
public class BaiToanTinhCong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        CongNV x=new CongNV(sc.nextLine(), Long.parseLong(sc.nextLine()), Long.parseLong(sc.nextLine()),sc.nextLine());
        System.out.println(x);
    }
}
