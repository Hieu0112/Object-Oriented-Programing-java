
package CodeJava1.KhaiBaoLopVaDoiTuong;

import java.util.Scanner;

class TuyenSinh{
    private String ma,ten;
    private double toan,ly,hoa;

    public TuyenSinh(String ma, String ten, double toan, double ly, double hoa) {
        this.ma = ma;
        this.ten = ten;
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
    }

    public double getDiem() {
        return 2*toan+ly+hoa;
    }

    public double Vung() {
        if(ma.charAt(2)=='1')
            return 0.5;
        else if(ma.charAt(2)=='2')
            return 1;
        else 
            return 2.5;
    }
    public String Thi() {
        if(getDiem()+Vung()>=24)
            return "TRUNG TUYEN";
        else
            return "TRUOT";
    }

    public String So(double x) {
        double tmp=x;
        if((double)((int)tmp)-x==0) return String.format("%.0f",x);
        else return String.format("%.1f",x);
    }
    
    @Override
    public String toString() {
        return ma + " " + ten + " " + So(Vung()) + " " + So(getDiem()) + " " + Thi();
    }    
}

public class BaiToanTuyenSinh {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        TuyenSinh SV=new TuyenSinh(sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()));
        System.out.println(SV);
    }
}
