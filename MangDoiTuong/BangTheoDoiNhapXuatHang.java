
package CodeJava1.MangDoiTuong;

import java.util.*;

class InfoHang{
    private String ma;
    private long nhap,gia;
    public InfoHang(String ma, long nhap) {
        this.ma = ma;
        this.nhap = nhap;
        if(ma.charAt(ma.length()-1)=='N') 
            this.gia=135000;
        else 
            this.gia=110000;
    }

    public long getXuat() {
        if(ma.charAt(0)=='A'){
            return Math.round(0.6*(double)nhap);
        }
        else 
            return Math.round(0.7*(double)nhap);
    }

    public long Tien() {
        return this.gia*getXuat();
    }

    public long Thue() {
        if(ma.charAt(0)=='A'&&ma.charAt(ma.length()-1)=='Y')
            return 8*Tien()/100;
        else if(ma.charAt(0)=='A'&&ma.charAt(ma.length()-1)=='N')
            return 11*Tien()/100;
        else if(ma.charAt(0)=='B'&&ma.charAt(ma.length()-1)=='Y')
            return 17*Tien()/100;
        else 
            return 22*Tien()/100;
    }

    @Override
    public String toString() {
        return ma+" "+nhap+" "+getXuat()+" "+gia+" "+Tien()+" "+Thue();
    }
    
    
}
public class BangTheoDoiNhapXuatHang {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        ArrayList<InfoHang>list=new ArrayList<>();
        for(int i=1;i<=n;i++){
            list.add(new InfoHang(sc.nextLine(), Long.parseLong(sc.nextLine())));
        }
        for(InfoHang x:list){
            System.out.println(x);
        }
    }
}
