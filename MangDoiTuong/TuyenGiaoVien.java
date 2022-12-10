package CodeJava1.MangDoiTuong;


import java.util.*;
class GiaoVien{
    private String ma,ten,tt;
    private double p1,p2;
    public GiaoVien(int i,String ten,String ma,double p1,double p2){
        this.tt = "GV"+String.format("%02d", i);
        this.ten = ten;
        this.ma = ma;
        this.p1 = p1;
        this.p2 = p2;
    }
    public String getMon(){
        if(ma.charAt(0) == 'A') {
            return "TOAN";
        }
        else if(ma.charAt(0) == 'B') {
            return "LY";
        }
        return "HOA";
    }
    public double getDiem(){
        if(ma.charAt(1) == '1'){
            return p1*2.0+p2+2;
        }
        else if(ma.charAt(1) == '2'){
            return p1*2.0+p2+1.5;
        }
        else if(ma.charAt(1) == '3'){
            return p1*2.0+p2+1;
        }
        return p1*2.0+p2;
    }
    public String getTT(){
        if(getDiem() >= 18) return "TRUNG TUYEN";
        return "LOAI";
    }
    @Override
    public String toString(){
        return tt+" "+ten+" "+getMon()+" "+String.format("%.1f", getDiem())+" "+getTT();
    }
}
public class TuyenGiaoVien {
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<GiaoVien> ls = new ArrayList<>();
        for(int i = 1; i <= t; i++){
            ls.add(new GiaoVien(i,sc.nextLine(),sc.nextLine(),Double.parseDouble(sc.nextLine()),Double.parseDouble(sc.nextLine())));
        }
        Collections.sort(ls,Comparator.comparingDouble(GiaoVien::getDiem).reversed());
        for(GiaoVien x:ls) System.out.println(x);
    }
}
